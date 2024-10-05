package monitoring.client
package core.presentation

import javafx.stage.Stage

trait Start {
  def start(stage: Stage, startX: Int, startY: Int, width: Int, height: Int): Unit
}
