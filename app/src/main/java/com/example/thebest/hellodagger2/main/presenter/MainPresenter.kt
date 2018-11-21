package com.nutron.daggerandroidinjection.presentation.main

import com.example.thebest.hellodagger2.util.ApiService


class MainPresenter(val view: MainContract.View,
                    val api: ApiService) : MainContract.UserActionListener {


    override fun refresh() {
        view.showLoading()
        api.loadData()
    }
}