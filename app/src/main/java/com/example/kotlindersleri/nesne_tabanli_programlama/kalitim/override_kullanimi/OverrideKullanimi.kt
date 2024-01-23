package com.example.kotlindersleri.nesne_tabanli_programlama.kalitim.override_kullanimi

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val köpek = Köpek()

    hayvan.sesCikar() //Kalıtım yok kendi sınıfı
    memeli.sesCikar() //Kendisinde yok üst sınıfa bakar kalıtım var
    kedi.sesCikar()  //Kalıtım var, override
    köpek.sesCikar()  //Kalıtım var , override
}