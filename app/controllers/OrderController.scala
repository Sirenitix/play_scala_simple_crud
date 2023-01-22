package controllers

import model.Order
import play.api.libs.json.{Json, OFormat}
import play.api.mvc._

import javax.inject._

@Singleton
class OrderController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  implicit val orderFormat: OFormat[Order] = Json.format[Order]

  def getAllOrders: Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    val inMemoryOrder = Order(1, "XBOX", 899)
    Ok(Json.toJson(inMemoryOrder))
  }
}
