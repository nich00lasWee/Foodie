package au.edu.swin.sdmd.foodie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter (private val data : List<Food>) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.item_row, parent, false) as View

        return ViewHolder(view)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    inner class ViewHolder(private val v : View) : RecyclerView.ViewHolder(v) {
        private val image = v.findViewById<ImageView>(R.id.food_image)
        private val title = v.findViewById<TextView>(R.id.food_title)
        private val description = v.findViewById<TextView>(R.id.food_desc)
        private val servings = v.findViewById<TextView>(R.id.food_servings)
        private val icon = v.findViewById<ImageView>(R.id.food_timer_icon)
        private val duration = v.findViewById<TextView>(R.id.food_duration)

        fun bind(item : Food) {
            image.setImageResource(item.imageResource)
            title.text = item.title
            description.text = item.description
            icon.setImageResource(R.drawable.ic_schedule_black_24dp)
            servings.text = "Servings: ${item.servings}"
            duration.text = "${item.duration} mins"
        }
    }
}