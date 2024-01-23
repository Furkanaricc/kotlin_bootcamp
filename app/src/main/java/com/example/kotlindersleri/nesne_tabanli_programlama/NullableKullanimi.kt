package com.example.kotlindersleri.nesne_tabanli_programlama

fun main() {

    //Nullable - Null safety - Optional(Swift)
    var x = "Merhaba"

    //Tanımlama
    var str:String? = null

    //Yöntem 1
    println("Yöntem 1 : ${str?.trim()}") //str? ile kullandığımda null olduğunda hata vermiyor null veriyor

    //Yöntem 2
    println("Yöntem 2 : ${str!!.trim()}") // !! iki ünlem null değil sen devam et diyor

    //Yöntem 3
    if (str !=null){
        println("Yöntem 3 : ${str.trim()}")
    }else{
        println("Sonuç nulldur")
    }

    //Yöntem 4
    str?.let {
        println("Yöntem 4 : ${str.trim()}")
    }
}