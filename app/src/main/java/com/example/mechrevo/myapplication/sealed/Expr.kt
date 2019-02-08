package com.example.mechrevo.myapplication.sealed

sealed class Expr {
    //密封类的子类
    data class Const(val number: Double) : Expr()
    data class Sum(val e1: Expr, val e2: Expr) : Expr()
    class Result : Expr()

    //同时可以定义一个普通类
    fun eval(expr: Expr): String = when (expr) {
        is Const -> "${expr.number}"
        is Sum -> "双数据类型"
        is Result->"正常数据类型"
    }
}