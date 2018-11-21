package com.example.thebest.hellodagger2.main.view

import android.os.Bundle
import android.widget.Toast
import com.example.thebest.hellodagger2.R
import com.example.thebest.hellodagger2.base.BaseActivity
import com.example.thebest.hellodagger2.main.fragment.view.Main2Fragment
import com.example.thebest.hellodagger2.main.fragment.view.MainFragment
import com.nutron.daggerandroidinjection.presentation.main.MainContract
import javax.inject.Inject

class MainActivity : BaseActivity() ,  MainContract.View {
    @Inject
    lateinit var presenter: MainContract.UserActionListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.refresh()
    }


    override fun showLoading() {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.content_container, MainFragment.newInstance())
        }.commit()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.content_container2, Main2Fragment.newInstance())
        }.commit()
    }
}