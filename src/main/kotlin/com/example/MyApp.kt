package com.example

import com.example.view.MainView
import javafx.scene.image.Image
import javafx.stage.Stage
import tornadofx.App

class MyApp: App(MainView::class) {
    override fun start(stage: Stage) {
        super.start(stage)
        stage.minWidth = if (stage.width > 400) stage.width else 400.0
        stage.minHeight = if (stage.height > 300) stage.height else 300.0
    }
}