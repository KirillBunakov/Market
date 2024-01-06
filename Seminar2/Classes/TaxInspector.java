package Seminar2.Classes;

import Seminar2.Interfaces.iActorBehaviour;

public class TaxInspector implements iActorBehaviour {
  // включаем новые поля в класс
  private String name;
  private boolean isTakeOrder;
  private boolean isMakeOrder;

  public TaxInspector() {
    this.name = "Налоговый инспектор";
  }

  // переопределяем методы базового класса
  @Override
  public boolean isTakeOrder() {
    return isTakeOrder;
  }

  @Override
  public boolean isMakeOrder() {
    return isMakeOrder;
  }

  @Override
  public void setTakeOrder(boolean val) {
    this.isTakeOrder = val;
  }

  @Override
  public void setMakeOrder(boolean val) {
    this.isMakeOrder = val;
  }

  @Override
  public Actor getActor() {
    return new OrdinaryClient("Тайный покупатель", 4);
  }

}
