// Raghav Saxena Aug 21,2020

import scala.collection.mutable.ListBuffer
import scala.io._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.Random
import scala.util.{Failure, Success}
import scala.util.Try

// Akka Actor Examples
import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.LoggerOps
import akka.actor.typed.{ ActorRef, Behavior }
import akka.actor.{Actor,Props,ActorLogging,ActorSystem}


case class CallConnect(id: Int , number : String)


class Supervisor extends Actor with ActorLogging
{
  override def preStart():Unit = log.info("Application Start")
  override  def postStop():Unit = log.info("Application Stopped")

  var lastmsg: String = _

  override def receive: Receive = {
    case x: String  => {
      println("I am inside Actor Raghav")
      lastmsg = x
    }
  }
}

class Supervisor2 extends Actor with ActorLogging
{
   override  def preStart(): Unit = log.info("Application2 Started")
   override  def postStop(): Unit = log.info("Application2 Stopped")

    override  def receive: Receive = {
      case x: CallConnect => {
        println(s"Sending call to ${x} to flow control")
      }

    }

}


case class User(
                 id: Int,
                 name: String,
                 mobile: Long,
                 address: String,
                 email: String)

case class Employee(empId: Int,Name: String)


object CubeCal extends App // As you extended App ypu cannot create main function
{
  // Test Cases see CubeTest.scala in test

  def cube(x: Int)= {
    x*x*x
  }

  def square(x: Int): Int  ={
    x*x
  }

  // Defining Variables

  var cal = {
    println("Hi this is my first Scala Project")
    "Raghav Saxena"
  }


  // Creating Pojo's or Constructors



  var emp1 = new Employee(23,"Tharak")

  println(emp1)


  // pattern matching

  def matchTest(x: Int): String = x match{
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case 4 => "Four"
    case _ => "Not Defined"
  }

  println(matchTest(3))

  // Traits Examples

  trait  Users {
    def name: String
    def score: Int
  }

  // Closures Functions

  var multiplier = (x: Int) => x*3

  println(multiplier(3))


  // Exception Handling in Scala with scala.util.Try

  Try {
    var re = 10/0
  }

  // Handling Null values with Option

  val values: Option[String] = Some("Raghav")
  val values2:Option[Int] = None

  println(values2.getOrElse(0))

  println(values.get)


  val user1 = Map( 1-> User(1,"Raghav",8126640811L,"raghav@gmail.com","xyz NY,USA"))

  def findbyId(x: Int) :Option[User] = user1.get(x)

  println(findbyId(0))

 // Futures as thread in Java with Constant Thread pool


  val values3 = Future {
    42
  }


  values3.onComplete
  {
  case Success(value) => println(s"Got the callback, value = $value")
  case Failure(e) => e.printStackTrace
 }

  // Scala List and for loop iteration

  var values4: List[String] = List("raghav" , "saxena","december")

  for( i <- values4) {
    println(i)
  }

  // List Buffer in Scala

  var listbuf = ListBuffer[String]()

  listbuf+= "name"
  listbuf+="mobile"
  listbuf+="home address"

  println(listbuf)

for (i <- listbuf) {
  println(i)


}

  // Actor Examples is given here

  val system = ActorSystem("my-first-actor")

  val superer = system.actorOf(Props(new Supervisor),name= "my-superer")

  superer ! "Hello"
   system.terminate()


  val system2 = ActorSystem("my-second-actor")

  val superer2 = system2.actorOf(Props(new Supervisor2),name= "my-superer2")

  superer2 ! CallConnect(123,"2345667")

  system2.terminate()



}
