package ee.developments.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat

class ReasultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reasult)

        var tvName: TextView = findViewById(R.id.name)
        val tvScore: TextView = findViewById(R.id.score)
        val btnFinish: Button = findViewById(R.id.finish_button)


      // Contacts.QuizLevel = Contacts.QuizLevel!! +1

        tvName.text = intent.getStringExtra(Contacts.USER_NAME)

        val totalQuestions = intent.getIntExtra(Contacts.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(Contacts.CORRECT_ANSWERS,0)

        tvScore.text ="Your score is ${correctAnswers} out of ${totalQuestions}"


        btnFinish.setOnClickListener {

            startActivity(Intent(this, ChooseQuizActivity::class.java))

        }


    }
}