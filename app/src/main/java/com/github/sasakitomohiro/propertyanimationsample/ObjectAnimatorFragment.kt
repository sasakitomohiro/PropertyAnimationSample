package com.github.sasakitomohiro.propertyanimationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.sasakitomohiro.propertyanimationsample.databinding.FragmentObjectAnimatorBinding

class ObjectAnimatorFragment : Fragment(R.layout.fragment_object_animator) {
    private var _binding: FragmentObjectAnimatorBinding? = null
    private val binding: FragmentObjectAnimatorBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentObjectAnimatorBinding.bind(view)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
