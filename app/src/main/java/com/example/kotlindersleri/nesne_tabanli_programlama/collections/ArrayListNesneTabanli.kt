package com.example.kotlindersleri.nesne_tabanli_programlama.collections

fun main() {
    val o1 = Ogrenciler(1,"Furkan","12/A")
    val o2 = Ogrenciler(2,"Sena","10/A")
    val o3 = Ogrenciler(3,"Ebi","7/A")
    val o4 = Ogrenciler(4,"Yiğitalp","1/A")

    val ogrencilerList = ArrayList<Ogrenciler>()

    ogrencilerList.add(o1)
    ogrencilerList.add(o2)
    ogrencilerList.add(o3)
    ogrencilerList.add(o4)

    for (o in ogrencilerList){
        println("No : ${o.no} -> Ad : ${o.ad}  -> Sınıf : ${o.sinif}")
    }


}