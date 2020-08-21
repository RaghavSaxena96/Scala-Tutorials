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
import akka.actor.typed.{ ActorRef, ActorSystem, Behavior }




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


}
