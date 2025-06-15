package org.example.lesson_1

fun main(){
    val year:Short = 1961
    var hour:Short = 9
    var minute: Short = 7
    println("Год полета: $year")
    println("hour of launch: ${hour.toDisplayableFormat()}")
    println("minute of launch: ${minute.toDisplayableFormat()}")
    hour = 10
    minute = 55
    print("Время посадки: ${hour.toDisplayableFormat()}:${minute.toDisplayableFormat()}")//
}
fun Short.toDisplayableFormat(): String{
    if(this<10){
        return "0"+this
    }
    else{
        return this.toString()
    }
}