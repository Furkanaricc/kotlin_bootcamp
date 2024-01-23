package com.example.kotlindersleri.nesne_tabanli_programlama

data class Araba (var renk : String, var hiz : Int, var calisiyorMu : Boolean){

    init {
        println("-------------Constructor çalıştı.------------")
    }

    fun calistir(){
        calisiyorMu = true
        hiz = 5
    }
    fun durdur(){
        calisiyorMu = false
        hiz = 0
    }

    fun bilgiAl(){
        println("-----------------------")
        println("Renk         : ${renk}")
        println("Hız          : ${hiz}")
        println("Çalışıyor Mu : ${calisiyorMu}")
    }

    //this veya self(Swift) : Bulunduğunuz Sınıfı belirtir
    //super : Kalıtım varsa üst sınıfı temsil eder

}