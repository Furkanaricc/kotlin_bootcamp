package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    val sonuc = 5.carpi(2)
    println("Gelen sonuç : $sonuc")
    val bolsonuc = 10 bol (2)
    println(bolsonuc)
}

fun Int.carpi( sayi : Int) : Int{
    return this * sayi //this = Int sınıfı
}

infix fun Int.bol( sayi : Int) : Int{
    return this / sayi //this = Int sınıfı
}