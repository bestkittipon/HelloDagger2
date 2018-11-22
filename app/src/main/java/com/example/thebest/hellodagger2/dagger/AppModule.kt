package com.example.thebest.hellodagger2.dagger

import android.app.Application
import android.content.Context
import com.example.thebest.hellodagger2.util.ApiService
import dagger.Module
import dagger.Provides
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class AppModule {
    /**
     * We create our AppComponent with our <MainApplication> class.
     * At that time we use @BindsInstance to inject Application instance to AppComponent.
     * So, that is a reason why Dagger know Application without passing it via constructor.
     */
    @Provides
    fun provideContext(application: Application): Context = application

    @Singleton
    @Provides
    fun provideApiService(): ApiService {
        return Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
                .build()
                .create(ApiService::class.java)
    }
}