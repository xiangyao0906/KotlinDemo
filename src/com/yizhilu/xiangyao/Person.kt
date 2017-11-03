package com.yizhilu.xiangyao


/**
 * kotlin 写bean 不用写get/set
 *
 * 字符串 有 plus 连接符啦
 *
 * */
class Person(var name: String, var age: Int) {
    override fun toString(): String {
        return "我是".plus(name).plus(",今年").plus(age).plus("岁")
    }
}
