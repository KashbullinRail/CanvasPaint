package com.example.canvaspaint

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val module = module {
    viewModel {
        CanvasViewModel()
    }
}