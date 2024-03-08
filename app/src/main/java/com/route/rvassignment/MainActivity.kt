package com.route.rvassignment

import Models.PostsData
import Models.StoriesData
import adapters.PostAdapter
import adapters.StoryAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.rvassignment.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var postList = mutableListOf<PostsData>()
    private var storyList = mutableListOf<StoriesData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillPostData()
        fillStoryData()
        binding.rvPosts.adapter = PostAdapter(postList)
        binding.rvStories.adapter = StoryAdapter(storyList)
    }

    private fun fillPostData() {
        val randomTime = Random.nextInt(1, 61)
        for(i in 1..10){
            val p1 = postList.add(PostsData("My new design",R.drawable.post_image,"$randomTime m ."))
            val p2 = postList.add(PostsData("My vehicle design",R.drawable.baseline_agriculture_24,"$randomTime m ."))
        }
    }
    private fun fillStoryData() {
        for(i in 1..10){
            val s1 = storyList.add(StoriesData("Kirolos"))
            val s2 = storyList.add(StoriesData("Mina"))
            val s3 = storyList.add(StoriesData("Hakim"))
        }
    }
}