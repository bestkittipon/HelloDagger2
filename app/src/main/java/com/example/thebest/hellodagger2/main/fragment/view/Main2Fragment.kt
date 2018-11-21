package com.example.thebest.hellodagger2.main.fragment.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.thebest.hellodagger2.R
import com.example.thebest.hellodagger2.base.BaseFragment
import javax.inject.Inject

class Main2Fragment : BaseFragment() , Main2FragmentContract.View {

    @Inject
    lateinit var presenter: Main2FragmentContract.UserActionListener

    companion object {
        fun newInstance() : Main2Fragment {
            val args = Bundle()
            val fragment = Main2Fragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.loadData()
    }

    override fun showDetail() {
        Toast.makeText(activity , "showDetail222" , Toast.LENGTH_LONG).show()
    }
}