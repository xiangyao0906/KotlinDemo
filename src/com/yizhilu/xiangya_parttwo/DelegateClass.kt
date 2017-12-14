package com.yizhilu.xiangya_parttwo

/**
 * 委托
 *      接口实现类的包装类？
 * */
fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print() // prints 10
}

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(b: Base) : Base by b {
    override fun print() {
        print("Abc")
    }
}
