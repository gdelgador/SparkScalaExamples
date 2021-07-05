package BasicExamples

object factorial extends App{

  def factorialNumber(number:Int):Int ={
    var factorial:Int = 1
    for(i <- 1 to number){
      factorial = factorial * i
    }
    return factorial
  }

  def factorialRecursivo(number:Int):Int={
    if(number == 1)
      return 1
    else
      return factorialRecursivo(number - 1 ) * number
  }


  println("write a number ..")
  val number=scala.io.StdIn.readInt()
  println(s"the fac of ${number} is ${factorialRecursivo(number)}")



}
