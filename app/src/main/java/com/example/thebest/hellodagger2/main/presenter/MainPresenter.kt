package com.example.thebest.hellodagger2.main.presenter

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.example.thebest.hellodagger2.main.view.MainContract
import com.example.thebest.hellodagger2.util.ApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


class MainPresenter(val view: MainContract.View,
                    private val api: ApiService) : MainContract.UserActionListener {

    private var subscription: Disposable? = null

    override fun refresh(result: Boolean) {
        if(result) {
            view.showLoading()

            subscription = api
                    .getPosts()
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe(
                            { postList -> Toast.makeText(view as Context , postList[0].body , Toast.LENGTH_LONG).show() },
                            { t -> Log.e("error" , t.message) }
                    )
        }else {
            view.showError()
        }
    }
}