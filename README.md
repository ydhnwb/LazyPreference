# LazyPreference

how to use

in Gradle Project Files, add this line
```
allprojects {
	repositories {	
		maven { url 'https://jitpack.io' }
	}
}
```

and the in Gradle App

```
  implementation "com.github.ydhnwb:lazypreference:0.0.1"
```


use it in your activity / fragment

```
 private val pref = LazyPreference(this@MainActivity, "USER").build()
 
 onCreate(....){
 	//this is just an example
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
```
  
