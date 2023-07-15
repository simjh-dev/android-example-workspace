package com.example.pedometeruiappsampling.activity

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pedometeruiappsampling.R
import com.example.pedometeruiappsampling.databinding.ActivitySettingBinding
import com.example.pedometeruiappsampling.util.DEFAULT_GOAL
import java.lang.Exception

class SettingActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.etGoal.setText(
            getSharedPreferences(resources.getString(R.string.text_goal), Context.MODE_PRIVATE).getInt(
                resources.getString(R.string.text_goal),
                DEFAULT_GOAL
            ).toString()
        )
    }

    override fun onResume() {
        super.onResume()
        setClickEvent()
    }

    private fun setClickEvent() {
        binding.btnConfirm.setOnClickListener {
            if (isValidate()) {
                getSharedPreferences(resources.getString(R.string.text_goal), Context.MODE_PRIVATE).edit()
                    .putInt(resources.getString(R.string.text_goal), binding.etGoal.text.toString().toInt()).apply()
                finish()
            } else {
                Toast.makeText(this, resources.getString(R.string.text_edit_text_fail_validate), Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun isValidate(): Boolean {

        return if (binding.etGoal.text != null) {
            val value = binding.etGoal.text.toString()
            if (value.isNotEmpty()) {
                try {
                    value.toInt()
                } catch (e: Exception) {
                    false
                }
                true
            } else {
                false
            }
        } else
            false
    }
}