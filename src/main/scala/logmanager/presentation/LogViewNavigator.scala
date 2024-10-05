package monitoring.client
package logmanager.presentation

import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.stage.Stage

import core.presentation.Start

class LogViewNavigator extends Start {
  override def start(stage: Stage, startX: Int, startY: Int, width: Int, height: Int): Unit = {
    val root = new StackPane()
    val scene = new Scene(root, width, height)

    stage.setTitle("Log view")
    stage.setScene(scene)
    stage.setX(startX)
    stage.setY(startY)
    stage.show()
  }
}
