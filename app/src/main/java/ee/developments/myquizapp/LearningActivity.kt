package ee.developments.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import ee.developments.myquizapp.databinding.ActivityLearningBinding


class LearningActivity : AppCompatActivity() {

    private var binding: ActivityLearningBinding? = null

    private var  flagLearningAdapter: FlagLearningAdapter? = null
    private var mquestionsList: ArrayList<Questions>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLearningBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolBarLearning)


        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        binding?.toolBarLearning?.setNavigationOnClickListener {
            onBackPressed()
        }

        mquestionsList = Contacts.getQuestions()
        setUpStatusRecylcerView()
    }

    private fun setUpStatusRecylcerView() {
        binding?.recyclerView?.layoutManager =
            GridLayoutManager(applicationContext,2)

        flagLearningAdapter = FlagLearningAdapter(mquestionsList!!)
        binding?.recyclerView?.adapter = flagLearningAdapter
        flagLearningAdapter!!.setDataList(mquestionsList!!)
    }
}