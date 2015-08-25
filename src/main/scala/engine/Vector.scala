package engine

case class Vector(dx: Double, dy: Double) {
  lazy val size = Math.sqrt(dx * dx + dy * dy)
  lazy val isZero = dx == 0 && dy == 0
  lazy val isVertical = dy == 0

  def scalarMultiply(k: Double) = Vector(k * dx, k * dy)

  def +(other: Vector) = Vector(dx + other.dx, dy + other.dy)
}
