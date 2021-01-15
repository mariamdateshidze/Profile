package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_profile.*

class profileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        init()
    }
    private fun init(){
        Glide.with(this)
            .load("https://i.pinimg.com/originals/49/59/50/495950c8df400cba935efa5c571de70f.jpg")
            .placeholder(R.mipmap.ic_launcher)
            .error(R.mipmap.ic_launcher)
            .into(coverpic);

        Glide.with(this)
            .load("https://thumbs.dreamstime.com/b/half-body-mother-avatar-vector-long-haired-illustration-95945810.jpg")
            .placeholder(R.mipmap.ic_launcher)
            .error(R.mipmap.ic_launcher)
            .into(profilepic);

    }
}