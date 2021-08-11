package com.example.view

import com.example.Styles
import tornadofx.*

class MainView : View("Test Window") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}
