package engine

abstract class DrawingContext {
  def drawCircle(center: Point2D, radius: Double, color: Color)

  def drawBox(center: Point2D, radius: Double)

  def drawLine(start: Point2D, end: Point2D)
}

