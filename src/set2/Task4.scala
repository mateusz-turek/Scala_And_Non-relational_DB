package set2

case class Task4() {
  def tripleFunctionUsage(integer: Integer, function: (Int) => Int): Int = {
    function.apply(function.apply(function.apply(integer)))
  }

  object Constants {
    val sumNumberWithItself = (number : Int) => {
      number+number
    }
  }
}
