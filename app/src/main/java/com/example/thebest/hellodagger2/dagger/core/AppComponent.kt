package com.example.thebest.hellodagger2.dagger.core

import android.app.Application
import com.example.thebest.hellodagger2.MainApplication
import com.example.thebest.hellodagger2.dagger.ActivityModule
import com.example.thebest.hellodagger2.dagger.AppModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(modules = [  AndroidSupportInjectionModule::class , AppModule::class , ActivityModule::class])
@Singleton
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(mainApplication: MainApplication)
}