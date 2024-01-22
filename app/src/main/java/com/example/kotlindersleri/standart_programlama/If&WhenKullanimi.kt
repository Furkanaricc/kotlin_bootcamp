package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 19
    val isim = "ahmet"

    if(yas >= 18 ){ //Swift : if yas >= 18 {}
        println("Reşitsiniz.")
    }else{
        println("Reşit değilsiniz.")
    }

    if(isim == "ahmet"){
        println("Merhaba Ahmet")
    }else{
        println("Tanınmayan kişi")
    }

    //When : Switch
    val gun = 5

    when(gun){
        1 -> println("Pazartesi")
        2 -> println("Sali")
        3 -> println("Çarşamba")
        4 -> println("Perşembe")
        5 -> println("Cuma")
        6 -> println("Cumartesi")
        7 -> println("Pazar")
        else -> println("Böyle bir gün yok")

    }

}