package com.example.coffeemaster.Passaporte

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey



data class Cafes(
    var nome: String,
    var origem:String,
    var notas: String,
    var imagem: Int,
    var torra: Int,
    var historia: String,
    var corpo: String,
    var processamento: String,
    var acidez: String,
    var regiao:String,
)
