package app.makino.harutiro.anzan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1Text = findViewById<TextView>(R.id.number1Text)
        val number2Text = findViewById<TextView>(R.id.number2Text)
        val signText :TextView = findViewById<TextView>(R.id.signText)


        val randomNumber1 = Random.nextInt(1000)
        val randomNumber2 = Random.nextInt(1000)

        number1Text.text = randomNumber1.toString()
        number2Text.text = randomNumber2.toString()

        val randomOperator = Random.nextInt(2)
        var operatorText = ""
        var correctAnswer = 0

        if(randomOperator == 0 ){

            operatorText = "+"
            signText.text = operatorText
            correctAnswer = randomNumber1 + randomNumber2

        }else{

            operatorText = "-"
            signText.text = operatorText
            correctAnswer = randomNumber1 - randomNumber2

        }
    }



}