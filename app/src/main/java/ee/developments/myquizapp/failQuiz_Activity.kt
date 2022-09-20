package ee.developments.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

private var mBack_to_choose_activity: Button? = null
class failQuiz_Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fail_quiz)

        mBack_to_choose_activity = findViewById(R.id.back_to_choose_activity)
        mBack_to_choose_activity?.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val intent = Intent(this, ChooseQuizActivity::class.java)
        startActivity(intent)
    }
}
