package com.example.thebest.hellodagger2.main.fragment.module

import com.example.thebest.hellodagger2.main.fragment.module.MainFragmentModule
import com.example.thebest.hellodagger2.main.fragment.view.Main2Fragment
import com.example.thebest.hellodagger2.main.fragment.view.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class MainFragmentBinder {
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun contributeMainFragment(): MainFragment

    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    abstract fun contributeMain2Fragment(): Main2Fragment
}
