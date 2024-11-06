package com.app.travelmate.data.model.destination

data class FoodItem(
    val name: String,
    val image: Int,
    val ingredient: List<Ingredients>
)