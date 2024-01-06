package Seminar2.Interfaces;

import java.util.List;
import Seminar2.Classes.Actor;

// Создаем интерфейс и его методы
public interface iMarketBehaviour {
  public void acceptToMarket(iActorBehaviour actor);

  public void releaseFromMarket(List<Actor> list);

  public void update();
}
