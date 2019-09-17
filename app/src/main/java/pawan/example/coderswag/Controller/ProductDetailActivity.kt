package pawan.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product_detail.*
import pawan.example.coderswag.Model.Product
import pawan.example.coderswag.R
import pawan.example.coderswag.Utilities.EXTRA_PRODUCT

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productDetail = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(productDetail.image, "drawable", packageName)

        productDetailImage.setImageResource(resourceId)
        productDetailName.text = productDetail.title
        productDetailPrice.text = productDetail.price
        productDetailDescription.text = "This is the placeholder for the description."
    }
}
