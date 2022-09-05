package codepath.demos.helloworlddemo

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.Button
import android.widget.Toast
import codepath.demos.helloworlddemo.R

class HelloWorldActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
        Log.v("Helloworld,", "Button Clicked!")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun findViewById() {}
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.activity_hello_world, menu)
        return true
    }
}