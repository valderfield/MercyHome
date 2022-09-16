package com.example.lib_learn_kt.main.Kt2_control_sentence

import android.widget.Toast
import com.example.lib_learn_kt.main.Kt1_data_type.Data

/**
 *@author
 *@Date 2022/9/14
 *@Edit
 *@describe
 *@From or To
 *@Mark 控制语句 if when instance == is (类型判断)
 */
class ControlSentence {

}

fun main() {
    val isFirst = false
    var ifCallBack = ""

    //if else
    if (isFirst) {
        println("if..else..----isFirst: $isFirst")
    } else {
        println("if..else..----isFirst: $isFirst")
    }

    //simple
    ifCallBack = if (isFirst) "True" else "False"


    //if-- else if -- else  === when
    val month = 5
    when (month) {
        1 -> println("months Spring: $month")
        2 -> println("months Spring: $month")
        3 -> println("month Spring: $month")
        else -> println("month: else:$month")
    }

    //high
    when (month) {
        1, 2, 3 -> print("Spring:$month")
        in 4..6 -> print("Summer : $month")
        in 7..10 -> print("Fall ")
    }

    //instance === is 类型判
    if (month is Int) {
        println("类型判断 用is")
    }



}