package app.makino.harutiro.anzan

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class AnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        val questionText = findViewById<TextView>(R.id.questionText)
        val yourAnswerText = findViewById<TextView>(R.id.yourAnswerText)
        val markImage = findViewById<ImageView>(R.id.markImage)
        val randyImage = findViewById<ImageView>(R.id.randy2Image)
        val backButton = findViewById<Button>(R.id.backButton)



        val displayQuestion = intent.getStringExtra("question")
        val yourAnswer = intent.getStringExtra("answer")
        val correctAnswer = intent.getStringExtra("correct")

        questionText.text = displayQuestion
        yourAnswerText.text = yourAnswer


        if(yourAnswer == correctAnswer){
            markImage.setImageResource(R.drawable.correct_image)
            randyImage.setImageResource(R.drawable.randy_happy_image)
        }else{
            markImage.setImageResource(R.drawable.miss_image)
            randyImage.setImageResource(R.drawable.randy_sad_image)
        }

        backButton.setOnClickListener {
            val questionPage = Intent(this,MainActivity::class.java)
            startActivity(questionPage)
            finish()
        }


    }
}