package set1

case class Task6() {
  def tupleIncomingArgumentFunction(inputTuple: (String, Double, Int)): Unit ={
    println(inputTuple)
  }

  object Constant {
    val TupleExampleStringDoubleInt: (String, Double, Int) = ("String", 1.1, 1)
  }
}
