package com.example.kotlindersleri.nesne_tabanli_programlama.composition

fun main() {
    val k1 = Kategoriler( 1, "Dram")
    val k2 = Kategoriler( 2, "Bilim Kurgu")

    val y1= Yonetmenler (1, "Qentin Tarantino")
    val y2= Yonetmenler(2,"Christoper Nolan")

    val f1 = Filmler (1,"Dyango",2023,k2,y1)

    println("Film id : ${f1.film_id}")
    println("Film adi : ${f1.film_adi}")
    println("Film yıl : ${f1.film_yil}")
    println("Film yönetmen : ${f1.yonetmen.yonetmen_adi}")
    println("Film kategori : ${f1.kategori.kategori_adi}")
}