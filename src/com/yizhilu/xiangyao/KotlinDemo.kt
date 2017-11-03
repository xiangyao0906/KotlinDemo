package com.yizhilu.xiangyao


/**
 *
 * kotlin - map
 * */
fun main(args: Array<String>) {
    haha()

}


fun haha() {
    val mapOf = mapOf<String, String>("xiangyao" to "向垚")

    print(mapOf["xiangyao"])

    for (o in mapOf) {
        print(o.key)
    }


}