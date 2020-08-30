# Scala-Tutorials



Scala Docs for referencing

Use Docs online on Scala website and Akka Website Lightbend Opensource

# Hello World

println("Hello World")

# Declaring Variables in Scala

vals are immutable values there values remian constant

val x: Int = 42   
val h : Long  = 234533222111L
val r : Boolean = true
val d : String = "Immutable String"


vars are mutable variables

var e : Char = 'a' 

e = 'r'

var t  :String = "Raghav Saxena"

var y :Int = 34

y = 32  


println(x) <br>
println(y) <br>
println(t) <br>

-------------------------------------------------------------------------
Output -

42 <br>
32 <br>
Raghav Saxena <br> 

--------------------------------------------------------------------------


# Expressions in Scala

val y: Int = 2+3

val t : Int = if(1==1) 3 else 5

printlnt(t)

---------------------------------------------------------------------------

Output - 

3 

---------------------------------------------------------------------------


Other expressions

== >= <= != +=

# Everything in scala is a Expression

val r : String  = {

val x = 4
val z = x + 3 

if(z>6) "More" else "Less"

}

println(r)

---------------------------------------------------------------------------

Output - 

More

---------------------------------------------------------------------------

# Defining Funcions in Scala

def func (a: Int, b: Int ) : Int = {
  a+b
}

def recur ( n : Int) : Int = { <br>
   if(n==1) 1 else n+recur(n-1)   <br>
}

println(recur(3))

---------------------------------------------------------------------------

Output - 

6

---------------------------------------------------------------------------

  
# Object Oriented Programming in Scala



object Work extends App{ <br>
  val p = new Person(22,"Raghav")
  
  p.greet()
  
}


class Person(n: Int , name :String) {

def greet(): Unit {
println(" Hi I am Raghav")
}

}

  
  
# Scala does not have class level functionality ("static") 

Scala do have object , objects do not receive parameter , scala object is a singleton instances and class and object can have same name.
