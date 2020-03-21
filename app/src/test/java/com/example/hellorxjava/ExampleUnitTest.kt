package com.example.hellorxjava

import android.util.Log
import android.util.Range
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.junit.Test

import org.junit.Assert.*
import java.util.concurrent.TimeUnit

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testGuGuDan_Imperative() {
        val intervalObservable : Observable<Long> = Observable.interval(2, TimeUnit.SECONDS).take(5)

        val observableJust: Observable<String> = Observable.just("1", "2","abc","1234","aaa")

        intervalObservable
            //.subscribeOn(Schedulers.io())
            .subscribe(
                { println("onNext : $it") },
                { println("onError : $it") },
                { println("onComplete") }
            )

        assertTrue(true)
    }
}
