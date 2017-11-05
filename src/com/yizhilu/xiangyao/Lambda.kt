package com.yizhilu.xiangyao

/**
 *
 * Lambda
 * */
fun main(args: Array<String>) {


//    用于定义函数：
    val foo = { str: String -> println(str) }

    val personName={person:Person-> println(person)}


    foo("shakalaka")

    foo2("kotlin 可以作为参数传递,再也不用写callback啦", { s -> println(s) })

    foo3("只接受一个参数", { println(it) })


    foo4(Person("尼古拉斯*赵四", 23), { println(it) })

    personName(Person("张三丰",26))


}

/**
 * 作为表达式直接使用：
 * */
fun foo2(a: String, b: (String) -> Unit) {
    b(a)
}

/**
 *
 * 当表达式只接受一个参数的时候
 */
fun foo3(a: String, b: (String) -> Unit) {
    b(a)
}

fun foo4(a: Person, b: (Person) -> Unit) {
    b(a)
}



