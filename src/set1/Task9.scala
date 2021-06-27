package set1

case class Task9() {

  def incrementEveryIntegerInListByOne(inputList: List[Int]): List[Int] = {
    inputList map (_ + 1)
  }

  object Constants {
    val integerList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  }

}
