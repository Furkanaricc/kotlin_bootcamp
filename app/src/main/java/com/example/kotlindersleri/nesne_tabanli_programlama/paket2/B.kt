package com.example.kotlindersleri.nesne_tabanli_programlama.paket2

import com.example.kotlindersleri.nesne_tabanli_programlama.paket1.A

class B : A() {
    fun fonksiyon(){

        println(internalDegisken)
        println(publicDegisken)
        println(varsayilanDegisken)
    }
}