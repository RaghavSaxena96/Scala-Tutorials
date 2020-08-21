trait MyTrait
{
  def pet
  def pet_color
}

// MyClass inherits trait
class MyClass extends MyTrait
{

  // Implementation of methods of MyTrait
  def pet()
  {
    println("Pet: Dog")
  }

  def pet_color()
  {
    println("Pet_color: White")
  }

  // Class method
  def pet_name()
  {
    println("Pet_name: Dollar")
  }
}
object Person{
  def main(args: Array[String]): Unit = {
    var obj = new MyClass()
    obj.pet()
    obj.pet_color()
    obj.pet_name()
  }
}