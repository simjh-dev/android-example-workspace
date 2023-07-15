package com.example.fragmentinfragmentsampling

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SettingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_setting, container, false)

        return view
    }

    companion object {
        private var instance: SettingFragment? = null

        fun getInstance() : SettingFragment {
            if(instance == null) {
                instance = SettingFragment()
            }
            return instance!!
        }

    }


}