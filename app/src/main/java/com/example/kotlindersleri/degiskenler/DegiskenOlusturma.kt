package com.example.kotlindersleri.degiskenler

fun main() {

    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasHarf = 'A'
    var ogrenciDevamEdiyorMu = true

    println("Adı : "+ ogrenciAdi)
    println("Yaş : "+ ogrenciYas)
    println("Boy : " + ogrenciBoy)
    println("Bas Harf : "+ogrenciBasHarf)
    println("Devam Ediyor mu ?" + ogrenciDevamEdiyorMu)

    var urun_id : Int = 3416
    var urun_adi : String = "Mackbook Pro"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 42999.99
    var urun_tedarikci : String = "Apple"

    println("Ürün id : $urun_id")
    println("Ürün adi : $urun_adi")
    println("Ürün adet : $urun_adet")
    println("Ürün fiyat : $urun_fiyat")
    println("Ürün tedarikçi  : $urun_tedarikci")


    var a = 10
    var b = 20

    println("$a x $b : ${ a * b }")

    // Sabitler - Constant
    // val(Kotlin) - let(Swift) -final(Java) -const tanımlandıktan sonra değiştirilemeyenler

    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 40
    println(numara)
    // numara = 80 çalışmaz çünkü numara val ile tanımlandı

    //Tür dönüşümü - Type Casting
    //toDouble(),toInt(),toString(),toFloat(),toLong(),toShort()
    val i = 42
    val d = 78.95

    //Sayısaldan sayısala dönüşüm

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()

    println(sonuc1)
    println(sonuc2)

    //Sayısaldan Metine dönüşüm
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)

    //Metinden sayısala dönüşüm
    val yazi = "67.54"

    val sonuc5 = yazi.toDouble()
    println(sonuc5)

    val hataliyazi = "67.54tas" //string double döndürme hata engelleme

    val sonuc6 = hataliyazi.toDoubleOrNull()
    println(sonuc6)

    println(sonuc5)

    sonuc6?.let {
        println(it)
    }

}