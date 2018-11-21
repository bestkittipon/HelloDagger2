package com.example.thebest.hellodagger2.main.fragment.module

import com.example.thebest.hellodagger2.main.fragment.presenter.Main2FragmentPresenter
import com.example.thebest.hellodagger2.main.fragment.presenter.MainFragmentPresenter
import com.example.thebest.hellodagger2.main.fragment.view.Main2Fragment
import com.example.thebest.hellodagger2.main.fragment.view.Main2FragmentContract
import com.example.thebest.hellodagger2.main.fragment.view.MainFragment
import com.example.thebest.hellodagger2.main.fragment.view.MainFragmentContract
import com.example.thebest.hellodagger2.util.ApiService
import dagger.Module
import dagger.Provides

@Module
class MainFragmentModule {
    /**
     * Dagger will attach DetailFragment to it’s graph that why we can refer to it.
     */
    @Provides
    fun provideView(fragment: MainFragment) : MainFragmentContract.View = fragment

    @Provides
    fun providePresenter(view: MainFragmentContract.View,
                         api: ApiService) : MainFragmentContract.UserActionListener {
        return MainFragmentPresenter(view, api)
    }

    @Provides
    fun provideView2(fragment: Main2Fragment) : Main2FragmentContract.View = fragment

    @Provides
    fun providePresenter2(view: Main2FragmentContract.View,
                         api: ApiService) : Main2FragmentContract.UserActionListener {
        return Main2FragmentPresenter(view, api)
    }
}