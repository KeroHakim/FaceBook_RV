package adapters

import Models.PostsData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.route.rvassignment.R

class PostAdapter(private val postList:List<PostsData>) : RecyclerView.Adapter<PostAdapter.postViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): postViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_items,parent,false)
        return postViewHolder(view)
    }

    override fun getItemCount(): Int = postList.size

    override fun onBindViewHolder(holder: postViewHolder, position: Int) {
        val post = postList[position]
        holder.bind(post)
    }

    inner class postViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        private val postTime = itemView.findViewById<TextView>(R.id.txt_time)
        private val postText = itemView.findViewById<TextView>(R.id.txt_post)
        private val postPic = itemView.findViewById<ImageView>(R.id.img_post)

        fun bind(post : PostsData){
            postTime.text = post.time
            postText.text = post.postTxt
            postPic.setImageResource(post.picResource)
        }
    }
}