package Seminar2.Interfaces;

import Seminar2.Classes.Actor;

// Создаем интерфейс и его методы
public interface iActorBehaviour {
  public boolean isTakeOrder();

  public boolean isMakeOrder();

  public void setTakeOrder(boolean val);

  public void setMakeOrder(boolean val);

  public Actor getActor();
}
