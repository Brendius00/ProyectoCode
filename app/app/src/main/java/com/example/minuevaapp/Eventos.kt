package com.example.minuevaapp

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.util.Locale

class Eventos {
    var nombreEvento="";
    var lugarEvento="";
    @RequiresApi(Build.VERSION_CODES.O)
    var fechaEvento= LocalDate.of(2024,4,5);
    var id="";

    // constructores

    @RequiresApi(Build.VERSION_CODES.O)
    constructor(nombreEvento: String, lugarEvento: String, fechaEvento: LocalDate,id:String) {
        this.nombreEvento = nombreEvento
        this.lugarEvento = lugarEvento
        this.fechaEvento=fechaEvento
        this.id=id;

    }
    constructor()
    //to string
    @RequiresApi(Build.VERSION_CODES.O)
    override fun toString(): String {
        return "Eventos(nombreEvento='$nombreEvento'," +
                " lugarEvento='$lugarEvento', fechaEvento=$fechaEvento)"
    }



  /*  fun modificarEvento(id: String){
        argumentosEventos = recuperarEvento (id)
        modificoArgumentos
        insertoArgumentosNovos <- Coidado con non insertar un novo
    }*/

}