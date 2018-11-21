package com.example.thebest.hellodagger2.dagger

import android.app.Application
import android.content.Context
import com.example.thebest.hellodagger2.util.ApiService
import com.example.thebest.hellodagger2.util.ApiServiceImpl
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    /**
     * We create our AppComponent with our <MainApplication> class.
     * At that time we use @BindsInstance to inject Application instance to AppComponent.
     * So, that is a reason why Dagger know Application without passing it via constructor.
     */
    @Provides
    fun provideContext(application: Application): Context = application

    @Provides
    fun provideApiService(): ApiService = ApiServiceImpl()
}