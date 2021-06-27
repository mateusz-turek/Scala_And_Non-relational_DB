package set1

case class Task8() {
  def removeZerosFromListWithRecursion(inputIntegerList: List[Int]): List[Int] = {
    if (!inputIntegerList.contains(0)){
       inputIntegerList
    }else{
      if (inputIntegerList.head.equals(0)){
        removeZerosFromListWithRecursion(inputIntegerList.tail)
      }else {
        val array = inputIntegerList.toArray
        val array2 = new Array[Int](array.length + 1)
        array.copyToArray(array2)
        array2.update(array.length,array.head)
        removeZerosFromListWithRecursion(array2.toList.drop(1))
      }
    }
  }
  object Constants {
    val integerList = List(0,1,2,3,4,5,6,7,8)
    val integerList2 = List(1,2,3,4,0,0,0,0,5,6,7,8,0,0,0,0,0,1,0)
    val integerList3 = List(0,1,2,3,4,0,0,0,0,5,6,7,8,0)
  }
}
