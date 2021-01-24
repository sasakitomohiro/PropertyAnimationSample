package com.github.sasakitomohiro.propertyanimationsample

import android.view.View
import com.github.sasakitomohiro.propertyanimationsample.databinding.ItemPropertyAnimationBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.viewbinding.BindableItem

class PropertyAnimationAdapter(
    navigate: (AnimationType) -> Unit
) : GroupAdapter<GroupieViewHolder>() {
    init {
        update(
            AnimationType
                .values()
                .map { PropertyAnimationItem(it, navigate) }
        )
    }
}

class PropertyAnimationItem(
    private val animationType: AnimationType,
    private val navigate: (AnimationType) -> Unit
) : BindableItem<ItemPropertyAnimationBinding>() {
    override fun getLayout(): Int = R.layout.item_property_animation

    override fun initializeViewBinding(view: View): ItemPropertyAnimationBinding =
        ItemPropertyAnimationBinding.bind(view)

    override fun bind(viewBinding: ItemPropertyAnimationBinding, position: Int) {
        viewBinding.title.text = animationType.name
        viewBinding.root.setOnClickListener {
            navigate(animationType)
        }
    }
}
