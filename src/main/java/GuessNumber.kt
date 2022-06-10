package fju.edu

import java.util.Scanner
import kotlin.random.Random

class GuessNumber {

}

fun main(){
    val secret: IntRange = 1..100
    println("secret:"+secret)
    var min = 1;
    var max = 100;
    for (i in 0..5){
        println("Please enter a number between "+min+" to "+max)
        //fun readLine():String  *???????
        val num: Int = readLine()!!.toInt()
        //if (num < secret){ }   *it doesn't work

    }
}