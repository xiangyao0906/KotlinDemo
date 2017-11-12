package com.yizhilu.xiangyao_prartone

import java.util.*


fun main(args: Array<String>) {

//    forOne()

//    forTwo()

//    forThree()

//    getNum()

//    getNum2()

//    forFour()

//    forString()

//    forWithIndex()

//    forWithIndex2()

    operatorTest()
}

fun forWithIndex2() {
    var arrayListTwo = arrayOf(1, 3, 5, 7, 9)
    for (i in arrayListTwo.indices) {
        println("arrayListTwo[$i] => " + arrayListTwo[i])
    }
}

fun forWithIndex() {
    var nums = arrayOf(1, 2, 3, 4, 7, 9)
    for ((index, value) in nums.withIndex()) {
        println("index $index  value $value")
    }
}


/**
 * for
 *
 *  默认步长1
 *
 * */
fun forOne() {
    for (i in 0..15) {
        println(i)
    }
}


/**
 * max
 * */
fun finMax(a: Int, b: Int): Int {
    return maxOf(a, b)
}

fun forTwo() {
    for (i in 0..20 step 2) {

        println(i.toString())
    }

}

/**
 * 倒叙
 * */

fun forThree() {

    for (i in 20 downTo 0) {
        println(i.toString())
    }


}

var num = 5

/**
 * kotlin 三元运算符
 * */
fun getNum() {
    var numB = if (num == 2) 5 else 3

    println(println("numB = > $numB"))
}

/**
 * 作为一个块结构，并且最后一句表达式为块的值(很重要)
 * */
fun getNum2() {
    var numA = 2
    var numB: Int = if (numA > 2) {
        numA++
        numA = 10
        println("numA > 2 => true")
        numA
    } else if (numA == 2) {
        numA++
        numA = 20
        println("numA == 2 => true")
        numA
    } else {
        numA++
        numA = 30
        println("numA < 2 => true")
        numA
    }
    // 根据上面的代码可以看出，每一个if分支里面都是一个代码块，并且返回了一个值。根据条件numC的值应该为20
    println("numC => $numA")


}

/*
 * 1.1、递增
 * 关键字 until
 * 特点 右闭区间
 *
 * 关键字 ..
 * 特点开区间
 * */
fun forFour() {
    for (i in 0 until 20) {
        println("i的值是 $i")
    }


    for (i in 0..20) {
        println("第二种递增的写法  $i")

    }

}

/**
 * 字符串的遍历
 * */

fun forString() {
    for (i in "abcdefg") {

        println("chracter $i")
    }


}

fun operatorTest() {
    var oo: OperatorOverride = OperatorOverride("zhang", 10)

    println("----------------------------------")

    println("原oo = ${oo.age}")
    +oo
    println("新oo = ${oo.age}")
}
