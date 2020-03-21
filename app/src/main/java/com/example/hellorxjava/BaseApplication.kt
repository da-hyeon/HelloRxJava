package com.example.hellorxjava

import android.app.Application
import android.content.Context
import com.example.hellorxjava.util.ErrorHandler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.plugins.RxJavaPlugins

class BaseApplication : Application(){
    companion object {
        lateinit var appContext: Context
    }
    override fun onCreate() {
        super.onCreate()
        appContext = this
        setErrorHanlder()
    }

    private fun setErrorHanlder() {
        // onError 가 없거나, onError에서 또 Exception이 나면 오는애
        RxJavaPlugins.setErrorHandler {
            ErrorHandler.handle(it)
        }
    }
}