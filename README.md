# Scroll view that can be scrolled in two axis at the same time

## Installation
```
dependencies {
    implementation 'com.github.gbksoft:double-axis-scrollview:v1.0.0'
}
```
## How to use
![](img/output.gif)

What is the best way to get horizontal and vertical scrolling? You should get rid of the fact that scrollview can host only one direct child with wrap_content to deal with width, height and vertical orientation. You simply wrap the children inside another LinearLayout. Two directional scroll may easily be an original addition to some design projects.

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

What is the best way to get horizontal and vertical scrolling? You should get rid of the fact that scrollview can host only one direct child with wrap_content to deal with width, height and vertical orientation. You simply wrap the children inside another LinearLayout. Two directional scroll may easily be an original addition to some design projects.

I first considered making two directional scroll view when my designer partner was showing me a lot of pictures. Now, they contained a lot of details and so he zoomed them and moved the cursor to exhibit all the details. And I thought to myself “why not make X and Y scroll” ? So I started coding to make two-Dimension Scrollviews on Android possible. This library is a good example of why [scrolling](https://gbksoft.com/blog/top-5-design-myths/) matters and how it affects design. 


This android DoubleSideScrollView is perfect for dealing with huge pictures that require attentive and detailed look. To scroll both horizontally & vertically at the same time is especially convenient when working with a lot of high resolution pics that need a detailed check. Here’s how to make scrollview horizontal and vertical in android.

# Let us know
This scrollable view android adjustment is not our only original decision. Contact us by email [hello@gbksoft.com](hello@gbksoft.com) to find out more about our projects! Share your feedback and tell us about yourself. 
