# Lottie
A simple Android app that displays an animation with [Lottie](https://airbnb.io/lottie/#/README).

![app gif](https://github.com/ivanalvarado/lottie/blob/master/lottie_sample.gif)

## Installation
In your module level gradle file:
```gradle
dependencies {
    ...
    implementation "com.airbnb.android:lottie:$lottieVersion"
    ...
}
```

## Usage
You can find public animations at [lottiefiles.com](https://lottiefiles.com/)

[Load an animation](https://airbnb.io/lottie/#/android?id=loading-an-animation) in your `src/main/assets` folder.

![assets file structure](https://github.com/ivanalvarado/lottie/blob/master/assets_file_structure.png)

In your layout file, add a `LottieAnimationView` that references your animation file via `app:lottie_filename`
```xml
<com.airbnb.lottie.LottieAnimationView
    android:id="@+id/filling_beer_animation"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:lottie_fileName="filling_beer.json" />
```

Then, in your Activity/Fragment simply `playAnimation()`.
```kotlin
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    
        filling_beer_animation.playAnimation()
    }
}
```
