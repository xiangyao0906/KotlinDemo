package com.yizhilu.xiangyao_prartone

import java.util.*


fun main(args: Array<String>) {

    forOne()
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