package set2

case class Task3() {

  def intoduceOsobaObject (osoba: Osoba) : Unit = {
    osoba.osobaIntroduce(osoba)
  }


  object Constants {
    val osoba1 = new Osoba("sampleName1", "SampleLastName1")
    val osoba2 = new Osoba("sampleName2", "SampleLastName2")
    val osoba3 = new Osoba("sampleName3", "SampleLastName3")
    val osoba4 = new Osoba("xyz", "xyz")
  }
}
