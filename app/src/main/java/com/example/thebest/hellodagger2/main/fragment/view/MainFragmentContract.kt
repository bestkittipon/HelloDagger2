package com.example.thebest.hellodagger2.main.fragment.view


interface MainFragmentContract {

    interface View {
        fun showDetail()
    }

    interface UserActionListener {
        fun loadData()
    }
}