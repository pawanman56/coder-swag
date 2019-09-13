package pawan.example.coderswag.Services

import pawan.example.coderswag.Model.Category
import pawan.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes and Graphic Beanie", "$15", "hat1"),
        Product("Devslopes and Balck Hat", "$20", "hat2"),
        Product("Devslopes and Sport Hat", "$20", "hat3"),
        Product("Devslopes and Blue Beanie", "$15", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$49", "hoodie1"),
        Product("Devslopes Hoodie Red", "$49", "hoodie2"),
        Product("Devslopes Hoodie Black", "$49", "hoodie3"),
        Product("Devslopes Hoodie Blue", "$49", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Gray", "$20", "shirt1"),
        Product("Devslopes Shirt Red", "$20", "shirt2"),
        Product("Devslopes Shirt Black", "$20", "shirt3"),
        Product("Devslopes Shirt Blue", "$20", "shirt4")
    )
}