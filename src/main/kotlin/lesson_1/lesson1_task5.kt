package org.example.lesson_1

fun main(){
    val timeInSeconds: Int = 12345
    val minutes: Int = (timeInSeconds/60)%60
    val hours: Int = (timeInSeconds/3600)
    val seconds: Int = timeInSeconds%60
    println("Time: ${hours.toDisplayableNumber()}:${minutes.toDisplayableNumber()}:${seconds.toDisplayableNumber()}")
}
fun Int.toDisplayableNumber(): String{
    if(this<10){
        return "0"+ this
    }
    else{
        return "$this"
    }
}