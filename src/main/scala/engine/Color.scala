package engine

case class Color(r: Int, g: Int, b: Int, alpha: Double = 1) {
  def withOpacity(newAlpha: Double) = this.copy(alpha = newAlpha)
}

object Color {
  val red = Color(255, 0, 0)
  val black = Color(0, 0, 0)
  val white = Color(255, 255, 255)
}
