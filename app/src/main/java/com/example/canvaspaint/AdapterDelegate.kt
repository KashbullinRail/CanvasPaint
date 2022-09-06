package com.example.canvaspaint

import android.graphics.PorterDuff
import android.view.View
import android.widget.ImageView
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateLayoutContainer

fun colorAdapterDelegate(
    onClick: (Int) -> Unit
): AdapterDelegate<List<Item>> =
    adapterDelegateLayoutContainer<ToolItem.ColorModel, Item>(R.layout.item_palette) {
        val color:ImageView = findViewById(R.id.color)
        itemView.setOnClickListener { onClick(adapterPosition) }
        bind { list ->
            color.setColorFilter(
                context.resources.getColor(item.color, null),
                PorterDuff.Mode.SRC_IN
            )

        }
    }

//fun sizeChangeAdapterDelegate(
//    onSizeClick: (Int) -> Unit
//): AdapterDelegate<List<Item>> =
//    adapterDelegateLayoutContainer<ToolItem.SizeModel, Item>(R.layout.item_size) {
//        bind { list ->
//            itemView.tvToolSize.text = item.size.toString()
//            itemView.setOnClickListener {
//                onSizeClick(adapterPosition)
//            }
//        }
//    }
//
//fun toolsAdapterDelegate(
//    onToolsClick: (Int) -> Unit
//): AdapterDelegate<List<Item>> =
//    adapterDelegateLayoutContainer<ToolItem.ToolModel, Item>(R.layout.item_tools) {
//        bind { list ->
//            itemView.ivTool.setImageResource(item.type.value)
//
//            if (item.tvToolsText.visibility == View.VISIBLE) {
//                item.tvToolsText.visibility = View.GONE
//            }
//
//        }
//    }