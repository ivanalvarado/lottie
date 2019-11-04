# Lottie
A simple Android app that displays an animation with [Lottie](https://airbnb.io/lottie/#/README).

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



```xml
<com.airbnb.lottie.LottieAnimationView
        android:id="@+id/filling_beer_animation"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:lottie_fileName="filling_beer.json" />
```
