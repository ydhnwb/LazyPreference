package com.ydhnwb.lazy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ydhnwb.lazypreference.LazyPreference

class MainActivity : AppCompatActivity() {
    private var pref = LazyPreference.Builder(this@MainActivity, "USER").build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pref.setString("STRING", "example")
        pref.setBoolean("BOOLEAN", false)
        pref.setFloat("FLOAT", 0.5F)
        pref.setInt("INT", 666)
        pref.setLong("LONG", 0.9.toLong())
        pref.setStringSet("STRING_SET", setOf("spontan", "uhuy"))


        println(pref.getInt("INT", 0))
        println(pref.getString("STRING"))
        println(pref.getBoolean("BOOLEAN", true))
        println(pref.getFloat("FLOAT", 0.0F))
        println(pref.getLong("LONG", 0.0.toLong()))
        println(pref.getSetString("STRING_SET"))
    }
}
