package com.example.thebest.hellodagger2

import com.example.thebest.hellodagger2.util.ApiService
import com.nutron.daggerandroidinjection.presentation.main.MainContract
import com.nutron.daggerandroidinjection.presentation.main.MainPresenter
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class MainActivityUnitTest {
    @Mock
    private lateinit var view: MainContract.View
    @Mock
    private lateinit var service: ApiService
    private lateinit var presenter: MainContract.UserActionListener

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        presenter = MainPresenter(view , service)
    }

    @Test
    fun test_show_loading() {
        presenter.refresh(true)
        verify(view).showLoading()
    }

    @Test
    fun test_show_error() {
        presenter.refresh(false)
        verify(view).showError()
    }
}