package com.github.sasakitomohiro.propertyanimationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.sasakitomohiro.propertyanimationsample.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding = _binding!!

    private val propertyAnimationAdapter = PropertyAnimationAdapter(::navigate)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        with(binding.recycler) {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = propertyAnimationAdapter
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    private fun navigate(type: AnimationType) {
        val directions = when (type) {
            AnimationType.OBJECT_ANIMATOR -> MainFragmentDirections.navigateToObjectAnimatorFromMain()
        }
        findNavController().navigate(directions)
    }
}
