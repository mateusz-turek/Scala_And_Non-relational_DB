package set1

case class Task4() {
  def createStringFromListWithFoldl(inputList: List[String]): String = {
    val string = inputList.foldLeft("") { (a, b) =>
      a + b.concat(",")
    }
    string
  }

  def createStringFromListWithFoldr(inputList: List[String]): String = {
    val string = inputList.foldRight("") { (a, b) =>
      a.concat(",") + b
    }
    string
  }

  def createStringFromListWithFoldlOnlyP(inputList: List[String]): String = {
    inputList.foldLeft("") { (a, b) =>
      if (b.startsWith("P")) {
        a.concat(b) + ","
      }
      else a
    }
  }
}
