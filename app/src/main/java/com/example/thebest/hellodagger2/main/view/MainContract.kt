package com.example.thebest.hellodagger2.main.view


interface MainContract {

    interface View {
        fun showLoading()

        fun showError()
    }

    interface UserActionListener {
        fun refresh(result: Boolean)
    }
}