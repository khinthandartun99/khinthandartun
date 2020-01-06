package com.example.databindingcal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingcal.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

     lateinit var binding: ActivityMainBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

//        bindin
        // binding.txtName.text="khin"
        //binding.myName = person

        binding.btnSum.setOnClickListener {
            var num1=binding.editNum1.text.toString().toInt()
            var num2=binding.editNum2.text.toString().toInt()
            var result1=num1+num2
            var person:Calculate= Calculate(num1,num2,result=result1.toString())
            binding.myCal = person
        }

        binding.btnSub.setOnClickListener {
            var num1=binding.editNum1.text.toString().toInt()
            var num2=binding.editNum2.text.toString().toInt()
            var result1=num1-num2
            var person:Calculate= Calculate(num1,num2,result=result1.toString())
            binding.myCal = person
        }

        binding.btnMul.setOnClickListener {
            var num1=binding.editNum1.text.toString().toInt()
            var num2=binding.editNum2.text.toString().toInt()
            var result1=num1*num2
            var person:Calculate= Calculate(num1,num2,result=result1.toString())
            binding.myCal = person
        }

        binding.btnDiv.setOnClickListener {
            var num1=binding.editNum1.text.toString().toInt()
            var num2=binding.editNum2.text.toString().toInt()
            var result1=num1/num2
            var person:Calculate= Calculate(num1,num2,result=result1.toString())
            binding.myCal = person
        }
    }
}
