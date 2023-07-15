package com.example.pedometeruiappsampling.fragment.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.pedometeruiappsampling.databinding.FragmentSettingPrivacySecurityBinding

class SettingPrivacySecurityFragment : SettingChildBaseFragment() {

    private var _binding: FragmentSettingPrivacySecurityBinding? = null
    private val binding get() = _binding!!
    private val TAG = this::class.java.simpleName

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSettingPrivacySecurityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // This callback will only be called when MyFragment is at least Started.
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true /* enabled by default */) {
                override fun handleOnBackPressed() {
                    // Handle the back button event
                    Navigation.findNavController(requireView()).navigateUp()
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)
    }

    override fun onResume() {
        super.onResume()
        setClickEvent()
    }

    private fun setClickEvent() {
        binding.btnBack.setOnClickListener {
            Navigation.findNavController(requireView()).navigateUp()
        }
    }


    companion object {
        private var instance: SettingChildBaseFragment? = null

        fun getInstance(): SettingChildBaseFragment {
            if (instance == null) {
                instance = SettingPrivacySecurityFragment()
            }
            return instance!!
        }
    }
}