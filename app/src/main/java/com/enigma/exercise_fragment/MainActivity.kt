package com.enigma.exercise_fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.enigma.exercise_fragment.view_model.CounterViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var counterFragment: CounterFragment
//    lateinit var counterShowFragment: CounterShowFragment
    val counterViewModel : CounterViewModel by viewModels<CounterViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        counterFragment = fragment as CounterFragment
//        counterShowFragment = fragment2 as CounterShowFragment
        println("MAIN_ACTIVITY this = $this")
    }



    fun toSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
//        counterViewModel.counter.observe(this,)
    }
}
