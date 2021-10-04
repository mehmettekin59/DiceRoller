package com.mehmettekin.diceroller

class Dice (val slide: Int) {


    fun roll(): Int {

        return (1..6).random()
    }

}