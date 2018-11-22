package com.example.thebest.hellodagger2.main.fragment.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.thebest.hellodagger2.R
import com.example.thebest.hellodagger2.base.BaseFragment
import javax.inject.Inject

class MainFragment : BaseFragment() , MainFragmentContract.View {

    @Inject
    lateinit var presenter: MainFragmentContract.UserActionListener

    companion object {
        fun newInstance() : MainFragment {
            val args = Bundle()
            val fragment = MainFragment()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.loadData()
    }

    override fun showDetail() {
        //Toast.makeText(activity , "showDetail" , Toast.LENGTH_LONG).show()
    }
}