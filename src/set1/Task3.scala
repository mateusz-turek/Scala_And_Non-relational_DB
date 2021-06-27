package set1

import scala.annotation.tailrec

case class Task3() {

  def createComaSeparatedValueStringFromListUsingTailRecursion(inputList: List[String]): String = {
    @tailrec
    def tailRec(innerInputList: List[String], day: String): String = {
      if (innerInputList.isEmpty) {
        day
      } else {
        tailRec(innerInputList.tail, day + innerInputList.head + ",")
      }
    }

    tailRec(inputList, "")
  }
}
