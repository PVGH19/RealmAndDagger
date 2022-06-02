package com.hole19golf.realmanddagger

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import io.realm.Realm
import io.realm.RealmConfiguration

@HiltAndroidApp
class DaggerAndRealmApp : Application() {

    val realm: Realm
        get() =  Realm.getDefaultInstance()

    override fun onCreate() {
        super.onCreate()
        instance = this

//        Realm.init(this)
//
//        val realmConfiguration = RealmConfiguration.Builder()
//            .allowQueriesOnUiThread(true)
//            .allowWritesOnUiThread(true)
//            .build()
//
//        Realm.setDefaultConfiguration(realmConfiguration)
    }

    companion object {
        @JvmStatic
        lateinit var instance: DaggerAndRealmApp
            private set
    }
}