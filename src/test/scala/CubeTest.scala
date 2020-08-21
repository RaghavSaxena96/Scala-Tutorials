import org.scalatest.FunSuite
import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._

class CubeTest extends FunSuite {

  test("CubeCal.cube")
  {
    assert(CubeCal.cube(4)===64)
    assert(CubeCal.cube(3)=== 27)
  }

  test("Square Test")
  {
    assert(CubeCal.square(3) == 9)
  }

}
