package Seminar2.Classes;

// Новый класс наследует класс Actor
public class OrdinaryClient extends Actor {
  // включаем новые поля в класс
  private int number;

  public OrdinaryClient(String name, int number) {
    super(name);
    this.number = number;
  }

  // переопределяем методы базового класса
  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  // определяем геттеры и сеттеры
  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public boolean isTakeOrder() {
    return super.isTakeOrder;
  }

  public boolean isMakeOrder() {
    return super.isMakeOrder;
  }

  public void setTakeOrder(boolean val) {
    super.isTakeOrder = val;
  }

  public void setMakeOrder(boolean val) {
    super.isMakeOrder = val;
  }

  public Actor getActor() {
    return this;
  }
}