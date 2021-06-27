package set2

case class Task5() {
  def createOsoba2(): Unit = {
    val student = new Osoba2("name","surname") with Student
    student.calculateTaxForStudent()
    println(student.tax)

    val pracownik = new Osoba2("name","surname") with Pracownik
    pracownik.calculateTaxForWorker()
    println(pracownik.tax)

    val nauczyciel = new Osoba2("name","surname") with Nauczyciel
    nauczyciel.calculateTaxForTeacher()
    println(nauczyciel.tax)
  }
}
