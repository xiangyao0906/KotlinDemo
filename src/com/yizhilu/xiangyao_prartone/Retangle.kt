package com.yizhilu.xiangyao_prartone

/**
 * 2.3.2 自定义访问器

假设声明一个矩形，它能判断自己是否是正方形，那么就不需要一个单独的字段来存储这个信息，
此时我们可以写一个自定义的访问器：用val开头作为声明，紧跟着的是属性的名称和类型，
接下来是get()关键字，最后是一个函数体。
 * */
class Retangle {
    var width = 30
    var heoght = 40;
    val isSqule: Boolean
        get() = width == heoght

}

fun main(args: Array<String>) {
    var retangle = Retangle()
    println(retangle.isSqule)
    retangle.width = 40
    println(retangle.isSqule)
}