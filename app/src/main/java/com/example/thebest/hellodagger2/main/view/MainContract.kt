package com.nutron.daggerandroidinjection.presentation.main


interface MainContract {

    interface View {
        fun showLoading()

        fun showError()
    }

    interface UserActionListener {
        fun refresh(result: Boolean)
    }
}