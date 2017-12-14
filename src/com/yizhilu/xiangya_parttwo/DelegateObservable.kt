package com.yizhilu.xiangya_parttwo

import kotlin.properties.Delegates

fun main(args: Array<String>) {

    var user = User()

    user.name = "A"
    user.name = "B"


}

class User {
    var name: String by Delegates.observable("<null value>", { property, oldValue, newValue ->

        println(property.name + " :oldValue$oldValue,newValue: $newValue")

    })

}