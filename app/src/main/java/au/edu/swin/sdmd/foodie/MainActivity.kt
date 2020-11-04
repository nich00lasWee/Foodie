package au.edu.swin.sdmd.foodie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: FoodAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvFood = findViewById<RecyclerView>(R.id.food_list)

        linearLayoutManager = LinearLayoutManager(this)
        rvFood.layoutManager = linearLayoutManager

        val data = foodList()

        adapter = FoodAdapter(data)
        rvFood.adapter = adapter
    }

    private fun foodList() : List<Food> {
        val foodList = mutableListOf<Food>()
        foodList.add(Food(R.drawable.pizza, "Pizza", "Cheesy Family-style Pepperoni Pizza",2,45))
        foodList.add(Food(R.drawable.carbonara, "Carbonara", "Tasty Carbonara Pasta Topped with Mozarella Cheese",1,30))
        foodList.add(Food(R.drawable.fish_and_chips, "Fish & Chips", "Classic British-style Fish and Chips",1,45))
        foodList.add(Food(R.drawable.dumplings, "Dumplings", "Steaming-hot Shrimp Dumplings",1,15))
        return foodList
    }
}