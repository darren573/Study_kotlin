package com.darren.study_kotlin

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast
import com.darren.study_kotlin.adapter.ForecastListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.linearLayout
import javax.xml.datatype.Duration


class MainActivity : AppCompatActivity() {
    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sta 6/28 - TRAPPED IN WEATHERSTATION - 31/17",
            "Sun 6/29 - Sunny - 20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var forecastList=findViewById(R.id.forecast) as RecyclerView
        forecastList.layoutManager=LinearLayoutManager(this)
        forecastList.adapter=ForecastListAdapter(items)
    }

    fun Activity.toast(message:CharSequence,duration:Int= Toast.LENGTH_SHORT){
        Toast.makeText(this,message,duration).show()
    }

    override fun onResume() {
        super.onResume()

    }
}
