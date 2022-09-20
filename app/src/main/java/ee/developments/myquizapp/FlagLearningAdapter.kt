package ee.developments.myquizapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FlagLearningAdapter(var context: ArrayList<Questions>) :
    RecyclerView.Adapter<FlagLearningAdapter.ViewHolder>() {

    var dataList = emptyList<Questions>()

    internal fun setDataList(dataList: List<Questions>) {
        this.dataList = dataList
    }

// Provide a direct reference to each of the views with data items

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView
        var title: TextView

        init {
            image = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.tvFlagName)
        }
    }








    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FlagLearningAdapter.ViewHolder {
        // Inflate the custom layout
        var view = LayoutInflater.from(parent.context).inflate(R.layout.lerning_flag_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlagLearningAdapter.ViewHolder, position: Int) {
        // Get the data model based on position
        var data = dataList[position]

        // Set item views based on your views and data model
        holder.title.text = data.flagName

        holder.image.setImageResource(data.image)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
