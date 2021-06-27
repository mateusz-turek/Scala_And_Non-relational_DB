package set2

class Osoba2 ( val name: String, val surname: String) extends Student with Pracownik with Nauczyciel {
  var tax: Double = 0

  override def calculateTaxForStudent(): Unit = this.tax = 0

  override def calculateTaxForWorker(): Unit = this.tax = 0.2

  override def calculateTaxForTeacher(): Unit =this.tax = 0.1
}

trait Student  {
  def calculateTaxForStudent()
}

trait Nauczyciel {
  def calculateTaxForTeacher()
}

trait Pracownik {
  def calculateTaxForWorker()
}


