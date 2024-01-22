package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {
    //Nesne oluşturma
    val bmw = Araba("Beyaz",200,true)

    //Okuma
   /* println("Renk : ${bmw.renk}")
    println("Hız : ${bmw.hiz}")
    println("Çalışıyor mu ? : ${bmw.calisiyorMu}")*/
    bmw.bilgiAl()
    //bmw.calistir()
    bmw.durdur()
    bmw.bilgiAl()


    val opel = Araba("Siyah", hiz = 160, true)
    opel.bilgiAl()
    opel.durdur()


    //VeriAtama

    opel.renk = "Kırmızı"
    opel.hiz = 190

   /* println("Opel renk : ${opel.renk}")
    println("Oepl hız : ${opel.hiz}")*/

    opel.bilgiAl()
    opel.durdur()

    val tofas = Araba("Yeşil",0,false)

   /* println("Renk : ${tofas.renk}")
    println("Hız : ${tofas.hiz}")
    println("Çalışıyor mu ? : ${tofas.calisiyorMu}")*/

    tofas.bilgiAl()
    tofas.calistir()


}