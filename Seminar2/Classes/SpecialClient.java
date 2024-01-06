package Seminar2.Classes;

public class SpecialClient extends Actor {
  // включаем новые поля в класс
  private int vipId;

  public SpecialClient(String name, int vipId) {
    super(name);
    this.vipId = vipId;
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
  public int getVipId() {
    return vipId;
  }

  public void setVipId(int vipId) {
    this.vipId = vipId;
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