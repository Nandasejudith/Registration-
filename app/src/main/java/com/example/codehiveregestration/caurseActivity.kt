package com.example.codehiveregestration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class caurseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caurse)

        var rvCourses=findViewById<RecyclerView>(R.id.rvCourses)
        var courseList = listOf(
            Caurse("MB101","Introduction to Android", "Mobile Developers", "John Ownar")
        )

        var Causes_Adapter =Causes_Adapter(courseList)
        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        rvCourses.adapter=Causes_Adapter
    }
}