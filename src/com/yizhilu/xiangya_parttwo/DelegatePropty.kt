package com.yizhilu.xiangya_parttwo

import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    var e=Example()
    print(e.p)
    e.p="haha"
    println(e.p)

}

class Delegate {

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }

}

class Example {
    /***
     * Example 的p 属性被代理
     */
    var p: String by Delegate()
}
