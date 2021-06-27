package set1

case class Task10() {

  def getPositiveDigitsInsideMinusFiveToTwelveSection(inputList: List[Double]): List[Double] = {
    val multiplyNegativeValueInListByMinusOne = (x: List[Double]) => {
      val array = new Array[Double](x.length)
      var counter = 0
      for (n <- x) {
        if (n < 0) {
          val tempNum = n.*(-1)
          array.update(counter, tempNum)
          counter = counter + 1
        } else {
          array.update(counter, n)
          counter = counter + 1
        }
      }
      array.toList
    }
    val tempList = inputList.filter(_ >= -5).filter(_ <= 12)
    multiplyNegativeValueInListByMinusOne.apply(tempList)
  }

  object Constants {
    val doubleList = List(-10.0, -9.0, -8.0, -7.0, -6.0, -5.0, -4.0, -3.0, -2.0, -1.0,
      0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0)
  }

}
