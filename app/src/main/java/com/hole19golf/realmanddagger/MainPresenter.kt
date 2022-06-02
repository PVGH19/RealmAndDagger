package com.hole19golf.realmanddagger

import android.util.Log
import javax.inject.Inject

class MainPresenter @Inject constructor(private val personDataSource: PersonDataSource) {

    fun start() {
        personDataSource.insert(Person(name = "Person1", age = 25))
        personDataSource.insert(Person(name = "Person2", age = 3))
        personDataSource.insert(Person(name = "Person3", age = 39))
        personDataSource.insert(Person(name = "Person4", age = 12))
    }

}
