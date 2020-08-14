package com.enigma.exercise_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.enigma.exercise_fragment.view_model.CounterViewModel
import kotlinx.android.synthetic.main.fragment_counter_show.*


class CounterShowFragment(): Fragment() {
//    val counterViewModel : CounterViewModel by activityViewModels<CounterViewModel>()

    val counterViewModel : CounterViewModel by activityViewModels<CounterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter_show, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        counterTextView.text = counterViewModel.counter.value.toString()
        counterViewModel.counter.observe(viewLifecycleOwner, Observer { setCounterToText(it) })
    }
    fun setCounterToText(counter: Int){
        counterTextView.text = counter.toString()
    }

}
