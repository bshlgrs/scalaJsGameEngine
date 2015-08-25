package webapp

import scala.scalajs.js._
import scala.scalajs.js.annotation.JSExport
import package_one.Thingy
import org.scalajs.jquery.jQuery

@JSExport
object WebInterface extends JSApp {
  @JSExport
  def main(): Unit = {
    jQuery("#main-button").on("click", (_:Any) => {
      val thing = new Thingy

      println(thing.getString)
      println(JsInterface.getString)
    })
  }
}
