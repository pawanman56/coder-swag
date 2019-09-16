package pawan.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pawan.example.coderswag.R
import pawan.example.coderswag.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
