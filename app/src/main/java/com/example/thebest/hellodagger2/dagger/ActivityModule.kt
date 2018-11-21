package com.example.thebest.hellodagger2.dagger

import com.example.thebest.hellodagger2.main.fragment.module.MainFragmentBinder
import com.example.thebest.hellodagger2.main.view.MainActivity
import com.example.thebest.hellodagger2.main.module.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class , MainFragmentBinder::class])
    abstract fun bindMainActivity(): MainActivity
}