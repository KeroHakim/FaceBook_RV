package adapters

import Models.StoriesData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.route.rvassignment.R

class StoryAdapter(private val storiesLis : List<StoriesData>) : RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {

    inner class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val profileName = itemView.findViewById<TextView>(R.id.StoryAuthor)
        fun bind (story : StoriesData){
            profileName.text = story.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.story_item,parent,false)
        return StoryViewHolder(view)
    }

    override fun getItemCount(): Int = storiesLis.size


    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val stories = storiesLis[position]
        holder.bind(stories)
    }

}