# Scroll view that can be scrolled in two axis at the same time

## Installation
```
dependencies {
    implementation 'com.github.gbksoft:double-axis-scrollview:v1.0.0'
}
```
## How to use
![](img/output.gif)

Add the scroll view to your layout XML, and place inside other views like in regular

```xml
<?xml version="1.0" encoding="utf-8"?>
<com.gbksoft.library.DoubleSideScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:contentDescription="@string/sample_car_image"
        android:src="@drawable/test" />

</com.gbksoft.library.DoubleSideScrollView>
```

# Let us know
We'd be very happy if you sent links to your projects where you use our component. Just send us email to [github@gbksoft.com](mailto:github@gbksoft.com)