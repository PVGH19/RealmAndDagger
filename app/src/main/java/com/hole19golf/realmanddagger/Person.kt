package com.hole19golf.realmanddagger

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Person(
    @PrimaryKey var id : String = UUID.randomUUID().toString(),
    var name: String? = null,
    var age: Int = 0
) : RealmObject() {

    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }
}
