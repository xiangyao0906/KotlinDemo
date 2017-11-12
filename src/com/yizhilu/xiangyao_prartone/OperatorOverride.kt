package com.yizhilu.xiangyao_prartone

/**
 * 重载运算符
 * */
data class OperatorOverride(var name: String, var age: Int) {

    // 重载 +a
    operator fun unaryPlus(): OperatorOverride {
        age = age.plus(100)

        return this
    }

    // 重载 a++
    operator fun inc(): OperatorOverride {
        age += 10
        return this
    }

    // 重载 a+b
    operator fun plus(oo: OperatorOverride): OperatorOverride {
        age += oo.age
        return this
    }

    // 重载 equals
    override fun equals(other: Any?): Boolean {
        if (other is OperatorOverride) {
            return this.age > other.age
        }
        return false
    }


}