package com.example.canvaspaint

class CanvasViewModel : BaseViewModel<ViewState>() {
    override fun initialViewState(): ViewState =
        ViewState(colorList = enumValues<COLOR>().map { ToolItem.ColorModel(it.value) })


    override fun reduce(event: Event, previousState: ViewState): ViewState? {
        return null
    }

}