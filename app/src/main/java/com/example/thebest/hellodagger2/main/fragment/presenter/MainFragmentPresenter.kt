package com.example.thebest.hellodagger2.main.fragment.presenter

import com.example.thebest.hellodagger2.main.fragment.view.MainFragmentContract
import com.example.thebest.hellodagger2.util.ApiService


class MainFragmentPresenter(val view: MainFragmentContract.View,
                            val api: ApiService) : MainFragmentContract.UserActionListener {

    override fun loadData() {
        view.showDetail()
    }

}