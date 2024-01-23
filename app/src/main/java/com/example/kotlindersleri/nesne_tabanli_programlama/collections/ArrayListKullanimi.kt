package com.example.kotlindersleri.nesne_tabanli_programlama.collections

fun main() {
    val sayilar = ArrayList<Int>()
    val meyveler = ArrayList<String>()

    //Veri ekleme
    meyveler.add("Elma")
    meyveler.add("Armut")
    meyveler.add("Muz")
    println(meyveler)

    //Güncelleme
    meyveler[1] = "Yeni Muz"
    println(meyveler)

    //Insert
    meyveler.add(1,"Portakal")
    println(meyveler)

    //Okuma İşlemi
    println(meyveler[3])
    println(meyveler.get(2))

    println("Boyut : ${meyveler.size}")
    println("Boyut : ${meyveler.count()}")
    println("Boş mu : ${meyveler.isEmpty()}")
    println("İçeriyor mu ? ${meyveler.contains("Kiraz")}")

    meyveler.reverse()
    println(meyveler)

    meyveler.sort()
    println(meyveler)

    for (meyve in meyveler){
        println("Sonuç : $meyve")
    }

    for ((indeks,meyve) in meyveler.withIndex()){ //enumereted()
        println("$indeks. -> $meyve")
    }

    meyveler.removeAt(2)
    println(meyveler)
}