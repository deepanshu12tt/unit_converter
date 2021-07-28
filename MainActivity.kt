package com.example.unit_converter

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity(), Parcelable {
 //   private lateinit var input: EditText
   // private lateinit var miles: Button
    //private lateinit var centimetre: Button
    //private lateinit var metre: Button
    //private lateinit var feet: Button
    //private lateinit var output: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // input = findViewById(R.id.input)
        //miles = findViewById(R.id.miles)
        //tempout = findViewById(R.id.tempout)
        //centimetre = findViewById(R.id.centimetre)
        //metre = findViewById(R.id.metre)
        //feet = findViewById(R.id.feet)


    }

 //   fun Nextpage(view: View) {
   //     val intent=Intent(this,temp_converter::class.java)
    //    startActivity(intent)
    //}



    fun milesconvert(view: View) {
        val num:String=input.editableText.toString()
        val number:Double=num.toDouble()
        val res:Double=(number*0.62137)
   //     Toast.makeText(this,res,Toast.LENGTH_LONG).show()
        tempout.setText(String.format("%.3f",res))
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("Not yet implemented")
    }

    fun centimetreconvert(view: View) {
        val num:String=input.editableText.toString()
        val number:Double=num.toDouble()
        val res:Double=(number*100000)
        tempout.setText(String.format("%.3f",res))
    }

    fun metreconvert(view: View) {
        val num:String=input.editableText.toString()
        val number:Double=num.toDouble()
        val res:Double=(number*1000)
        tempout.setText(String.format("%.3f",res))

    }

    fun feetconvert(view: View) {
        val num:String=input.editableText.toString()
        val number:Double=num.toDouble()
        val res:Double=(number*3280.84)
        tempout.setText(String.format("%.3f",res))
    }


}


