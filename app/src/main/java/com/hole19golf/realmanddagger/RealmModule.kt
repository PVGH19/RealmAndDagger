package com.hole19golf.realmanddagger

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import io.realm.Realm
import io.realm.RealmConfiguration
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RealmModule {

    @Provides
    @Singleton
    fun providesRealm(@ApplicationContext context: Context): Realm {
        Realm.init(context)

        val realmConfiguration = RealmConfiguration.Builder()
            .allowQueriesOnUiThread(true)
            .allowWritesOnUiThread(true)
            .build()

        Realm.setDefaultConfiguration(realmConfiguration)
        return Realm.getDefaultInstance()
    }

}