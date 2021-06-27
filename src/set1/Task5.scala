package set1

import scala.collection.mutable

case class Task5() {
  def getProductToPriceMapWithTenPercentDiscount(inputProductToPriceMap: Map[String, Double]): Map[String, Double] = {
    val discountProductToPriceMap = new mutable.HashMap[String, Double]
    var tempInputPrice = 0.0
    for (inputProductToPriceMapKey <- inputProductToPriceMap.keySet) {
      tempInputPrice = inputProductToPriceMap(inputProductToPriceMapKey)
      tempInputPrice = tempInputPrice.*(0.9)
      discountProductToPriceMap.update(inputProductToPriceMapKey, tempInputPrice)
    }
    discountProductToPriceMap.toMap
  }


  object Constants {
    val PRODUCT_TO_PRICE_MAP = Map(
      "product1" -> 1.0,
      "product2" -> 2.0,
      "product3" -> 3.0,
      "product4" -> 4.0,
      "product5" -> 5.0,
      "product6" -> 6.0,
      "product7" -> 7.0,
      "product8" -> 8.0,
      "product9" -> 9.0,
      "product10" -> 10.0)
  }

}
