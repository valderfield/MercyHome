package com.example.lib_learn_kt.main.Kt3_cycle_sentence

/**
 *@author
 *@Date 2022/9/15
 *@Edit
 *@describe
 *@From or To
 *@Mark 循环语句 for while
 */
class CycleSentence {
    //for 循环
}

fun main() {
    //for in
    val names = arrayListOf<String>("Tom", "Jack", "Rose", "Kitty")



    for (name in names) {
        println("$name")
    }

    //for in 1..10 step 2
    for (i in 1..10 step 2){
        when (i) {
            3 -> println("3")
            5 -> println("5")
        }
    }
    //for until down to
    for (i in 10 downTo 2){
        when(i) {
            2-> println("2")
            4-> println("4")
        }
    }


}