package com.example.hellorxjava.util

import com.example.hellorxjava.BuildConfig


object ErrorHandler {

    fun handle(t: Throwable) {
        if (BuildConfig.DEBUG) {
            t.printStackTrace()
            // sendCrash(t)
        }
    }
}
