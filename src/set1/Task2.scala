package set1

case class Task2() {
  def createComaSeparatedValueStringFromListUsingRecursion(inputList: List[String]): String = {
    if (inputList.isEmpty) {
      ""
    } else {
      inputList.head + "," + createComaSeparatedValueStringFromListUsingRecursion(inputList.tail)
    }
  }

  def createComaSeparatedValueStringFromListUsingRecursionBack(inputList: List[String]): String = {
    if (inputList.isEmpty) {
      ""
    } else {
      inputList.last + "," + createComaSeparatedValueStringFromListUsingRecursionBack(inputList.dropRight(1))
    }
  }
}
