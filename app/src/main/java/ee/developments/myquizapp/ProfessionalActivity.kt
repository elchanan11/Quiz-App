package ee.developments.myquizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class ProfessionalActivity : AppCompatActivity(), View.OnClickListener{
    private var mCurrentPosition: Int = 1
    private var mQouestionsList:ArrayList<Questions>? = null
    private var mSelectedOptionPosition : Int =0
    private var mUserName: String? = null
    private var mCorrectAnswers: Int = 0

    private var tv_question: TextView?=null
    private var iv_flag: ImageView?=null
    private var pg_progressBar: ProgressBar?=null
    private var tv_pb: TextView?=null
    private var btn_submit: Button?=null

    private var tv_optionOne: TextView?=null
    private var tv_optionTow: TextView?=null
    private var tv_optionThree: TextView?=null
    private var tv_optionFour: TextView?=null

    private var answerPressed: Boolean = false

    private var wrongAnswer: Int = 0

    private var mWrongAnswer1: ImageView?=null
    private var mWrongAnswer2: ImageView?=null
    private var mWrongAnswer3: ImageView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advanced_quiz)

        mUserName = intent.getStringExtra(Contacts.USER_NAME)

        tv_question = findViewById(R.id.qustion)
        iv_flag = findViewById(R.id.iv_image)
        pg_progressBar = findViewById(R.id.pBar)
        tv_pb = findViewById(R.id.tv_progress)
        btn_submit = findViewById(R.id.btn_submit)

        tv_optionOne = findViewById(R.id.opt_1)
        tv_optionTow = findViewById(R.id.opt_2)
        tv_optionThree = findViewById(R.id.opt_3)
        tv_optionFour = findViewById(R.id.opt_4)


        mQouestionsList = Contacts.getQuestionsProfessional()

        mWrongAnswer1 = findViewById(R.id.wrongAnswer1)
        mWrongAnswer2 = findViewById(R.id.wrongAnswer2)
        mWrongAnswer3 = findViewById(R.id.wrongAnswer3)

        setQuestion()

        tv_optionOne?.setOnClickListener(this)
        tv_optionTow?.setOnClickListener(this)
        tv_optionThree?.setOnClickListener(this)
        tv_optionFour?.setOnClickListener(this)
        btn_submit?.setOnClickListener(this)


    }


    private fun setQuestion() {

        val question: Questions = mQouestionsList!![mCurrentPosition - 1]
        defaultOptionsView()

        if (mCurrentPosition == mQouestionsList!!.size) {

            Contacts.QuizLevel = Contacts.QuizLevel!! +1

            btn_submit?.text = "FINISH"
        } else {
            btn_submit?.text = "SUBMIT"
        }
        pg_progressBar?.max=20
        pg_progressBar?.progress = mCurrentPosition
        tv_pb?.text = " ${mCurrentPosition}/${pg_progressBar?.max}"

        tv_optionOne?.text = question.optionOne
        tv_optionTow?.text = question.optionTwo
        tv_optionThree?.text = question.optionThree
        tv_optionFour?.text = question.optionFour
        tv_question?.text = question.questions
        iv_flag?.setImageResource(question.image)

        answerPressed = false

    }
    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()

        tv_optionOne?.let {
            options.add(0,it)}

        tv_optionTow?.let {
            options.add(1,it)}

        tv_optionThree?.let {
            options.add(2,it)}

        tv_optionFour?.let {
            options.add(3,it)}

        for( option in options){
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bgg
            )

        }

    }





    private fun selectOptionView(textView: TextView, selectedOptionNum: Int){
        defaultOptionsView()
        println("option")

        mSelectedOptionPosition = selectedOptionNum
        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this,
            R.drawable.gg
        )
    }


    override fun onClick(view: View?) {
        when(view?.id){
            R.id.opt_1-> {
                println("click")
                tv_optionOne?.let {

                    answerPressed=true
                    selectOptionView(it, 1)
                }
            }
            R.id.opt_2->{
                tv_optionTow?.let {

                    answerPressed=true
                    selectOptionView(it,2)
                }
            }
            R.id.opt_3->{
                tv_optionThree?.let {

                    answerPressed=true
                    selectOptionView(it,3)
                }
            }
            R.id.opt_4->{
                tv_optionFour?.let {

                    answerPressed=true
                    selectOptionView(it,4)
                }
            }
            R.id.btn_submit->{

                if(mSelectedOptionPosition == 0){

                    //if (answerPressed == true) {
                        mCurrentPosition++
                    //}
                    when{

                        mCurrentPosition <= mQouestionsList!!.size ->{

                            setQuestion()

                        }else->{
                        val intent = Intent(this, ReasultActivity::class.java)
                        intent.putExtra(Contacts.USER_NAME, mUserName)
                        intent.putExtra(Contacts.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(Contacts.TOTAL_QUESTIONS, mQouestionsList?.size)
                        startActivity(intent)
                        finish()
                    }
                    }
                }else{
                    val question = mQouestionsList?.get(mCurrentPosition -1)

                    if (question!!.correctAnswer != mSelectedOptionPosition){

                        wrongAnswer++
                        setWrongAnswer()

                        answerView(mSelectedOptionPosition,R.drawable.wrong_color)
                    }else{
                        mCorrectAnswers = mCorrectAnswers+1
                    }
                    println("click")

                    answerView(question.correctAnswer,R.drawable.right_color)

                    if (mCurrentPosition == mQouestionsList!!.size){
                        btn_submit?.text = "FINISH"

                    }else{
                        btn_submit?.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }

            }
        }

    }

    private fun setWrongAnswer() {
        if (wrongAnswer==1){
            mWrongAnswer1?.background  = ContextCompat.getDrawable(this,R.drawable.oval)
        }
        else if (wrongAnswer == 2){
            mWrongAnswer2?.background  = ContextCompat.getDrawable(this,R.drawable.oval)

        }
        else if (wrongAnswer == 3){
            mWrongAnswer3?.background  = ContextCompat.getDrawable(this,R.drawable.oval)

            val intent = Intent(this, failQuiz_Activity::class.java)
            startActivity(intent)

        }
    }


    private fun answerView(answer: Int,drawableView: Int){
        when(answer){
            1 ->{
                println("click")

                tv_optionOne?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            2 ->{
                tv_optionTow?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            3 ->{
                tv_optionThree?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            4 ->{
                tv_optionFour?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }

        }
    }
}


