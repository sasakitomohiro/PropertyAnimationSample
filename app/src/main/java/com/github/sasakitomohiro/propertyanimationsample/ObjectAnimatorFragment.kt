package com.github.sasakitomohiro.propertyanimationsample

import android.animation.ObjectAnimator
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

        val objectAnimator = ObjectAnimator.ofFloat(binding.image, "translationX", 0f, 200f)
        objectAnimator.duration = 3000
        objectAnimator.start()
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
