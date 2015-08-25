package engine

abstract class GameObject {
  def step(): Unit

  def draw(drawingContext: DrawingContext): Unit
}

abstract class PhysicalGameObject extends GameObject {
  val position: Point2D
}

abst
