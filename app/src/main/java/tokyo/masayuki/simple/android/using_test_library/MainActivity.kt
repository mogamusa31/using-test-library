package tokyo.masayuki.simple.android.using_test_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tokyo.masayuki.simple.android.mylibrary.MyUtilities

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(MyUtilities.testStr("hello world"))
    }
}
