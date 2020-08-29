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


println(x)
println(y)
println(t)

-------------------------------------------------------------------------
Output -

42
32
Raghav Saxena

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



