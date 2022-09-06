package com.example.canvaspaint

data class ViewState(
    val toolsList: List<ToolItem.ToolModel>,
    val colorList: List<ToolItem.ColorModel>,
    val sizeList: List<ToolItem.SizeModel>,
    val canvasViewState: CanvasViewState,
    val isPaletteVisible: Boolean,
    val isBrushSizeChangerVisible: Boolean,
    val isToolsVisible: Boolean
)



sealed class UIEvent: Event {
    data class OnPaletteClicked(val index: Int): UIEvent()
    data class OnColorClicked(val index: Int): UIEvent()
    data class OnSizeClicked(val index: Int): UIEvent()
    data class OnToolsClicked(val index: Int): UIEvent()
    object OnDrawViewClicked: UIEvent()
    object OnToolbarClicked: UIEvent()

}