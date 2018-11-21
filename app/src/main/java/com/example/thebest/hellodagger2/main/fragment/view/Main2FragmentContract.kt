package com.example.thebest.hellodagger2.main.fragment.view


interface Main2FragmentContract {

    interface View {
        fun showDetail()
    }

    interface UserActionListener {
        fun loadData()
    }
}