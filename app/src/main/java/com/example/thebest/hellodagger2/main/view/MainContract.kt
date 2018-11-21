package com.nutron.daggerandroidinjection.presentation.main


interface MainContract {

    interface View {
        fun showLoading()
    }

    interface UserActionListener {
        fun refresh()
    }
}