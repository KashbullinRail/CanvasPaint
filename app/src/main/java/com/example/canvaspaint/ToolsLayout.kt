package com.example.canvaspaint
import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter

class ToolsLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
): CardView(context, attrs, defStyleAttr){

    private var onClick: (Int) -> Unit = {}

    private val toolsList:RecyclerView = findViewById(R.id.rvTools)

    private val adapterDelegate = ListDelegationAdapter(
        colorAdapterDelegate {
            onClick(it)
        }
    )

//    private val adapterDelegate = ListDelegationAdapter(
//        colorAdapterDelegete {
//            onClick(it)
//        },
//        sizeChangeAdapterDelegete {
//            onClick(it)
//        },
//        toolsAdapterDelegete {
//            onClick(it)
//        }
//    )

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        toolsList.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
        toolsList.setAdapterAndCleanupOnDetachFromWindow(adapterDelegate)
    }

    fun render(list: List<ToolItem>){
        adapterDelegate.setData(list)
    }

    fun setOnClickedListener(onClick: (Int) -> Unit){
        this.onClick = onClick
    }

}