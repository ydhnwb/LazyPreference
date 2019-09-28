package com.ydhnwb.lazypreference

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.os.Build


class LazyPreference(builder : LazyPreference.Builder) {
    private var parentKey : String = builder.parent_key!!
    private var context : Context = builder.context!!

    fun getString(key : String) : String? = context.getSharedPreferences(parentKey, MODE_PRIVATE).getString(key, null)

    fun getBoolean(key: String, default : Boolean) : Boolean = context.getSharedPreferences(parentKey, MODE_PRIVATE).getBoolean(key, default)

    fun getInt(key : String, default: Int) : Int = context.getSharedPreferences(parentKey, MODE_PRIVATE).getInt(key, default)

    fun getLong(key : String, default: Long) : Long = context.getSharedPreferences(parentKey, MODE_PRIVATE).getLong(key, default)

    fun getFloat(key : String, default : Float) : Float = context.getSharedPreferences(parentKey, MODE_PRIVATE).getFloat(key, default)

    fun getSetString(key: String) : Set<String>? = context.getSharedPreferences(parentKey, MODE_PRIVATE).getStringSet(key, null)

    fun setString(key: String, value : String){
        val pref = context.getSharedPreferences(parentKey, MODE_PRIVATE)
        pref.edit().apply {
            putString(key, value)
            apply()
        }
    }

    fun setInt(key: String, value : Int){
        val pref = context.getSharedPreferences(parentKey, MODE_PRIVATE)
        pref.edit().apply {
            putInt(key, value)
            apply()
        }
    }

    fun setBoolean(key : String, value : Boolean) {
        val pref = context.getSharedPreferences(parentKey, MODE_PRIVATE)
        pref.edit().apply {
            putBoolean(key, value)
            apply()
        }
    }

    fun setLong(key : String, value : Long) {
        val pref = context.getSharedPreferences(parentKey, MODE_PRIVATE)
        pref.edit().apply {
            putLong(key, value)
            apply()
        }
    }

    fun setFloat(key : String, value : Float) {
        val pref = context.getSharedPreferences(parentKey, MODE_PRIVATE)
        pref.edit().apply {
            putFloat(key, value)
            apply()
        }
    }


    fun setStringSet(key : String, value : Set<String>) {
        val pref = context.getSharedPreferences(parentKey, MODE_PRIVATE)
        pref.edit().apply {
            putStringSet(key, value)
            apply()
        }
    }

    fun clear() = context.getSharedPreferences(parentKey, MODE_PRIVATE).edit().clear().apply()

    data class Builder(var context : Context? = null, var parent_key : String? = null) {

        fun build() = LazyPreference(this)
    }
}