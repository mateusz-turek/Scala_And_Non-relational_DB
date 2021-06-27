package set1

case class Task1() {

  def createComaSeparatedValueStringFromList(inputList: List[String]): String = {
    var s = ""
    for (n <- inputList) {
      s +=n+","
    }
    s
  }

  def createComaSeparatedValueStringFromListOnlyWithP(inputList: List[String]): String = {
    var s = ""
    for (n <- inputList) {
      if (n.startsWith("P")) {
        s +=n+","
      }
    }
    s
  }

  def createComaSeparatedValueStringFromListWithWhileLoop(inputList: List[String]): String = {
    var s = ""
    var i = 0
    val size = inputList.size
    while (i < size) {
      s +=inputList(i)+","
      i += 1
    }
    s
  }

  def createComaSeparatedValueStringFromListWithWhileLoopOnlyWithP(inputList: List[String]): String = {
    var s = ""
    var i = 0
    val size = inputList.size
    while (i < size) {
      if (inputList(i).startsWith("P")) {
        s +=inputList(i)+","
      }
      i += 1
    }
    s
  }

  object Constants {
    val daysList = List("Poniedzialek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")
  }
}
