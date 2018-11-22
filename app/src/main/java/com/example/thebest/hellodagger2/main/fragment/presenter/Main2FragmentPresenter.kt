package com.example.thebest.hellodagger2.main.fragment.presenter

import com.example.thebest.hellodagger2.main.fragment.view.Main2FragmentContract
import com.example.thebest.hellodagger2.util.ApiService


class Main2FragmentPresenter(val view: Main2FragmentContract.View,
                             val api: ApiService) : Main2FragmentContract.UserActionListener {

    override fun loadData() {
        view.showDetail()
    }

}