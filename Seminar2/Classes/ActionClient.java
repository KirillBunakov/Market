package Seminar2.Classes;

public class ActionClient extends Actor {
  private boolean isTakeOrder;
  private boolean isMakeOrder;
  private int clientId;
  public String actionName;

  public ActionClient(String name, int clientId, String actionName) {
    super(name);
    this.clientId = clientId;
    this.actionName = actionName;
  }

  // переопределяем методы
  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  // определяем геттеры и сеттеры
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
