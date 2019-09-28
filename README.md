# LazyPreference

how to use

in Gradle Project Files, add this line
```
allprojects {
		repositories {
			...
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
    val token = pref.getString("TOKEN")
 }
```
  
