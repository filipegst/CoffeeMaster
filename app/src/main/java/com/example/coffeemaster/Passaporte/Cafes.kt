package com.example.coffeemaster.Passaporte

data class Cafes(
    var nome: String,
    var Origem: String,
    var notas: String,
    var imagem: Int,
    var torra: Int,
    var historia: String,
    var corpo: String,
    var processamento: String,
    var acidez: String,
    var Anotacoes: String? = null
)
