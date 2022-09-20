package ee.developments.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.textfield.TextInputLayout
private var mUserName: String? = null

var tvBeginnersChooseQuiz:TextInputLayout?=null
var tvAdvancedChooseQuiz:TextInputLayout?=null
var tvProfessionalChooseQuiz:TextInputLayout?=null
var tvLernActivity:TextInputLayout? = null


class ChooseQuizActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_quiz)

        tvBeginnersChooseQuiz = findViewById(R.id.beginnerChiose)
        tvAdvancedChooseQuiz = findViewById(R.id.advancedChiose)
        tvProfessionalChooseQuiz = findViewById(R.id.professinalsChiose)
        tvLernActivity = findViewById(R.id.rliv)

        tvBeginnersChooseQuiz?.setOnClickListener(this)
        tvAdvancedChooseQuiz?.setOnClickListener(this)
        tvProfessionalChooseQuiz?.setOnClickListener(this)
        tvLernActivity?.setOnClickListener(this)

        mUserName = intent.getStringExtra(Contacts.USER_NAME)

        setChooseQuiz()


    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.beginnerChiose->{

                // setChooseQuiz()

                val intent = Intent(this,Quiz_activity::class.java)
                intent.putExtra(Contacts.USER_NAME, mUserName)
                startActivity(intent)
            }

            R.id.advancedChiose->{
                if (Contacts.QuizLevel==1){
                    Toast.makeText(
                        this,
                        "YOU FIRST NEED TO CONCARE THE FIRST LEVE!"
                                , Toast.LENGTH_LONG).show()
                }else if (Contacts.QuizLevel!! >=2) {

                    val intent = Intent(this, Advanced_Quiz_Activity::class.java)
                    intent.putExtra(Contacts.USER_NAME, mUserName)
                    startActivity(intent)
                }
            }
            R.id.professinalsChiose->{
                if (Contacts.QuizLevel!!<3){
                    Toast.makeText(
                        this,
                        "YOU FIRST NEED TO CONCARE THE OTHER LEVELS!"
                        , Toast.LENGTH_LONG).show()
                }else {
                val intent = Intent(this,ProfessionalActivity::class.java)
                intent.putExtra(Contacts.USER_NAME, mUserName)
                startActivity(intent)
            }
        }
        R.id.rliv->{

            val intent = Intent(this,LearningActivity::class.java)
            startActivity(intent)
        }
        }

    }

         fun setChooseQuiz() {

        if (Contacts.QuizLevel==2){

            tvAdvancedChooseQuiz?.background = ContextCompat.getDrawable(this,
                R.drawable.avaliblechoose)

        }else if (Contacts.QuizLevel!! >= 3) {

            tvAdvancedChooseQuiz?.background = ContextCompat.getDrawable(
                this,
                R.drawable.avaliblechoose
            )

            tvProfessionalChooseQuiz?.background = ContextCompat.getDrawable(
                this,
                R.drawable.avaliblechoose
            )
        }
    }
}