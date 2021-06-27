package set1

case class Task7() {

  def optionMechanismOnProductPriceMap(inputProductToPriceMap: Map[String, Double]): Unit = {
    for (productKey <- inputProductToPriceMap.keySet) {
      val option = inputProductToPriceMap.get(productKey)
      println("this is my option[price] im trying to get price from Map with key:"+ productKey+ "and my option is: " + option)
      println("this is my price after unboxing option: " + option.get)
    }
  }

}
