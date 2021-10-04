package com.mehmettekin.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.mehmettekin.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dice1.setImageResource(R.drawable.dice_1)
        binding.dice2.setImageResource(R.drawable.dice_2)

        binding.btnStart.setOnClickListener {
            rollDice(binding.dice1)
            rollDice(binding.dice2)
        }
    }

    private fun rollDice(imageView: ImageView){
        val dice = Dice(6)

        val drawableResource = when(dice.roll()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imageView.setImageResource(drawableResource)

    }

}