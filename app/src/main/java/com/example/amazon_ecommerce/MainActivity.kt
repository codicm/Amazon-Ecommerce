package com.example.amazon_ecommerce

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.text.style.TypefaceSpan
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textViewzapos:TextView
    private lateinit var textViewforgotpassword:TextView
    private lateinit var checkBox2:CheckBox
    private lateinit var textViewcoditions:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        secondtext()
        forgotpasswordtext()
        checkBox2text()
        textViewcoditionstext()
    }
    private fun secondtext(){
        textViewzapos=findViewById(R.id.textViewzapo)
        val spannableString=SpannableString("Sign in to Zappos.com using our Amazon")
        val stylespan= StyleSpan(Typeface.BOLD)
        spannableString.setSpan(stylespan,11,20,Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        textViewzapos.text=spannableString
    }
    private  fun forgotpasswordtext(){
        textViewforgotpassword=findViewById((R.id.textViewforgotpassword))
        val spannableString=SpannableString("Forgot password?")
        val fcolor=ForegroundColorSpan(Color.BLUE)
        spannableString.setSpan(fcolor,0,16,Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        textViewforgotpassword.text=spannableString
    }
    private  fun checkBox2text(){
        checkBox2=findViewById((R.id.checkBox2))
        val spannableString=SpannableString("Keep me signed in. Details")
        val fcolor=ForegroundColorSpan(Color.BLUE)
        spannableString.setSpan(fcolor,19,26,Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        checkBox2.text=spannableString
    }

    private  fun textViewcoditionstext(){
        textViewcoditions=findViewById((R.id.textViewcoditions))
        val spannableString=SpannableString("Conditions of Use Privacy Notice")
        val fcolor=ForegroundColorSpan(Color.BLUE)
        spannableString.setSpan(fcolor,0,32,Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
        textViewcoditions.text=spannableString
    }
}