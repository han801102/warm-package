package com.ascii.warmpackage.presenter

import com.ascii.warmpackage.WarmPackageView
import com.ascii.warmpackage.model.WarmPackageModel
import org.junit.Before
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations

class WarmPackagePresenterTest {

    @Mock
    lateinit var warmPackageView: WarmPackageView

    @InjectMocks
    lateinit var mainPresenter: MainPresenter

    @Mock
    lateinit var warmPackageModel: WarmPackageModel

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        mainPresenter.attachModel(warmPackageModel)
    }

    @Test
    fun addition_isCorrect() {
        mainPresenter.initial()
        verify(warmPackageModel).setTemperatureSensorUpdateListener(any())
        verify(warmPackageView).initUIStatus()
    }

    private fun <T> any(): T = Mockito.any<T>()
}