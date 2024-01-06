package Seminar2.Classes;

import Seminar2.Interfaces.iActorBehaviour;

// Абстрактный класс имплиментурует интерфейс
public abstract class Actor implements iActorBehaviour {
  // включаем новые поля в класс
  protected String name;
  protected boolean isTakeOrder;
  protected boolean isMakeOrder;

  public Actor(String name) {
    this.name = name;
  }

  // объявляем новые методы
  public abstract String getName();

  public abstract void setName(String name);
}
