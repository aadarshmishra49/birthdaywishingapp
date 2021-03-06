package com.example.birthdaywishing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*
import com.example.birthdaywishing.BirthdayGreetingActivity.Companion.NAME_EXTRA as NAME_EXTRA

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val  NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
        val name= intent.getStringExtra(NAME_EXTRA)
        birthdaygreeting.text="HAPPY BIRTHDAY \n$name"

    }
}