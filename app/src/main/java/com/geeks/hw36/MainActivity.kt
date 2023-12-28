package com.geeks.hw36



// YourActivity.kt
import YourAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.geeks.Binding.ActivityMainBinding
import kotlin.Unit
import kotlin.Unit as Unit1

private var Any.adapter: Unit
    get() = Unit1
    set(s) {}
private var Any.layoutManager: LinearLayoutManager
    get() {
        TODO("Not yet implemented")
    }
    set(c) {}

class YourActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: YourAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView()

        val itemList = listOf(
            YourItemModel("Item 1"),
            YourItemModel("Item 2"),
            // Добавьте больше элементов, если необходимо
        )


    }

    private fun setContentView() {
        TODO("Not yet implemented")
    }
}
