package com.example.thebest.hellodagger2.main.module

import com.example.thebest.hellodagger2.main.view.MainActivity
import com.example.thebest.hellodagger2.util.ApiService
import com.nutron.daggerandroidinjection.presentation.main.MainContract
import com.nutron.daggerandroidinjection.presentation.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {
    /**
     * Dagger will attach MainActivity to it’s graph that why we can refer to it.
     */
    @Provides
    fun provideMainView(mainActivity: MainActivity): MainContract.View = mainActivity

    @Provides
    fun providePresenter(view: MainContract.View, api: ApiService): MainContract.UserActionListener {
        return MainPresenter(view, api)
    }
}