package com.ivanalvarado.lottiesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieDrawable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        play_button.setOnClickListener {
            filling_beer_animation.repeatCount = 0
            filling_beer_animation.playAnimation()
        }

        loop_button.setOnClickListener {
            filling_beer_animation.repeatCount = LottieDrawable.INFINITE
            filling_beer_animation.repeatMode = LottieDrawable.RESTART
            filling_beer_animation.playAnimation()
        }
    }
}
