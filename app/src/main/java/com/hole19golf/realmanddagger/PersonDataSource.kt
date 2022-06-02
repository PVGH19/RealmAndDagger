package com.hole19golf.realmanddagger

import io.realm.Realm
import org.bson.types.ObjectId
import javax.inject.Inject

class PersonDataSource @Inject constructor(private val realm: Realm) {

    fun insert(person: Person) {
        realm.executeTransaction { r: Realm ->
            r.copyToRealmOrUpdate(person)
        }
    }

    fun findAll() : List<Person> {
        return realm.use { r: Realm ->
            val result = r.where(Person::class.java).findAll()
            r.copyFromRealm(result)
        }
    }
}