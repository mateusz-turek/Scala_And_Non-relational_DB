package set2

class BankAccount {

  private var _accountState: Double = 0;

  def accountState: Double = _accountState

  def this (initAccountState : Double){
    this()
    this._accountState = initAccountState
  }

  def wplata (incomingAmount : Double): Unit ={
    this._accountState = this._accountState + incomingAmount
  }

  def wyplata (jakasNazwa : Double): Unit ={
    this._accountState = this._accountState - jakasNazwa
  }
}


