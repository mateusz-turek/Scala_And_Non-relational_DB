package set2

class Osoba(val imie: String, val nazwisko : String) {

  def osobaIntroduce (osoba: Osoba) : Unit = {
    osoba.imie match {
      case Constants.osoba1.imie => osoba.nazwisko match {
        case Constants.osoba1.nazwisko => println(Constants.osoba1Introduce)
      }
      case Constants.osoba2.imie => if (osoba.nazwisko.equals(Constants.osoba2.nazwisko)){
        println(Constants.osoba2Introduce)
      }
      case Constants.osoba3.imie => osoba.nazwisko match {
        case Constants.osoba3.nazwisko => println(Constants.osoba3Introduce)
      }
      case _ => println("idk")
    }
  }

  object Constants {
    val osoba1 = new Osoba("sampleName1", "SampleLastName1")
    val osoba2 = new Osoba("sampleName2", "SampleLastName2")
    val osoba3 = new Osoba("sampleName3", "SampleLastName3")

    val osoba1Introduce = "Hi I am Mr. osoba1"
    val osoba2Introduce = "Yo, osoba2 here"
    val osoba3Introduce = "Morning Fellas, osoba3"
  }
}

