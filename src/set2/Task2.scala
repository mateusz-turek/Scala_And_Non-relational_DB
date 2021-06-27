package set2

case class Task2(){

  def task2Demo() : Unit = {
    println("bank account with 1 parameter auxiliary constructor")
    val bankAccountConstructor = new BankAccount(20)
    println(bankAccountConstructor.accountState)
    bankAccountConstructor.wplata(10)
    println(bankAccountConstructor.accountState)
    bankAccountConstructor.wyplata(5)
    println(bankAccountConstructor.accountState)
    println("bank account with no args constructor")
    val bankAccountNoArgConstructor = new BankAccount()
    println(bankAccountNoArgConstructor.accountState)
    bankAccountNoArgConstructor.wplata(10)
    println(bankAccountNoArgConstructor.accountState)
    bankAccountNoArgConstructor.wyplata(5)
    println(bankAccountNoArgConstructor.accountState)
  }
}
