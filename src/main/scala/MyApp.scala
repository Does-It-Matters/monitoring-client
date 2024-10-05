package monitoring.client

import javafx.application.Application
import javafx.stage.{Screen, Stage}
import javafx.geometry.Rectangle2D

import core.presentation.Start
import logmanager.presentation.LogViewNavigator

object Main extends App {
  Application.launch(classOf[MyApp], args: _*)
}

class MyApp extends Application {
  override def start(primaryStage: Stage): Unit = {
    val screen: Rectangle2D = Screen.getPrimary.getVisualBounds
    val unitWidth = (screen.getWidth / 12).toInt
    val unitHeight = (screen.getHeight / 12).toInt
    val width = unitWidth * 5
    val height = unitHeight * 5
    val right = width + 10
    val down = height + 50

    start(new LogViewNavigator, primaryStage, unitWidth, unitHeight, width, height)
    start(new LogViewNavigator, new Stage(), unitWidth + right, unitHeight, width, height)
    start(new LogViewNavigator, new Stage(), unitWidth + right, unitHeight + down, width, height)
  }

  private def start(navigator: Start, stage: Stage, startX: Int, startY: Int, width: Int, height: Int): Unit = {
    navigator.start(stage, startX, startY, width, height)
  }
}