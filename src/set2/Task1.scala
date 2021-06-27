package set2

case class Task1(){
  def workOrWeekend(s : String): String = {
    s match {
      case "Poniedzialek" => Constants.PRACA
      case "Wtorek" => Constants.PRACA
      case "Sroda" => Constants.PRACA
      case "Czwartek" => Constants.PRACA
      case "Piatek" => Constants.PRACA
      case "Sobota" => Constants.WEEKEND
      case "Niedziela" => Constants.WEEKEND
      case _ => Constants.NIE_MA_TAKIEGO_DNIA_TYGODNIA
    }
  }

  def determineWorkOrWeekendInDaysList(inputList : List[String]): Unit = {
    for (day <- inputList){
      println(workOrWeekend(day))
    }
  }

  object Constants {
    val PRACA = "praca"
    val WEEKEND = "weekend"
    val NIE_MA_TAKIEGO_DNIA_TYGODNIA = "nie ma takiego dnia tygodnia"
  }
}
