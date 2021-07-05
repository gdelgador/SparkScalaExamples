package BasicExamples

import scala.io.StdIn._

object Mario extends App {

  // One line function
  val p = (n:Int) => '*'.toString * n

  val x = (n:Int) => ' '.toString * n

  // solicitar un numero
  val number = readLine("Introduce un numero: ").toInt

  for (i <- 1 to number){
    // println('*'.toString * i)

    println( p(i) )

  }

  for (i <- 1 to number){
    println( x(number - i).concat(p(i)) )
  }





}
