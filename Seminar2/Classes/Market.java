package Seminar2.Classes;

import java.util.ArrayList;
import java.util.List;

import Seminar2.Interfaces.iActorBehaviour;
import Seminar2.Interfaces.iMarketBehaviour;
import Seminar2.Interfaces.iQueueBehaviour;
import Seminar2.Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {

  private List<iActorBehaviour> queue;

  // создаем новый экземпляр класса маркет
  public Market() {
    this.queue = new ArrayList<iActorBehaviour>();
  }

  // переопределяем методы
  @Override
  public void acceptToMarket(iActorBehaviour actor) {
    System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
    takeInQueue(actor);
  }

  @Override
  public void takeInQueue(iActorBehaviour actor) {
    this.queue.add(actor);
    System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
  }

  @Override
  public void releaseFromMarket(List<Actor> actors) {
    for (Actor actor : actors) {
      System.out.println(actor.getName() + " клиент ушел из магазина ");
      queue.remove(actor);
    }

  }

  @Override
  public void update() {
    takeOrder();
    giveOrder();
    returnOrder();
    releaseFromQueue();
  }

  @Override
  public void giveOrder() {
    for (iActorBehaviour actor : queue) {
      if (actor.getActor().isMakeOrder) {
        actor.setTakeOrder(true);
        System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
      }
    }
  }

  @Override
  public void releaseFromQueue() {
    List<Actor> releaseActors = new ArrayList<>();
    for (iActorBehaviour actor : queue) {
      if (actor.isTakeOrder()) {
        releaseActors.add(actor.getActor());
        System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
      }
    }
    releaseFromMarket(releaseActors);
  }

  @Override
  public void takeOrder() {
    for (iActorBehaviour actor : queue) {
      if (!actor.isMakeOrder()) {
        actor.setMakeOrder(true);
        System.out.println(actor.getActor().getName() + " клиент сделал заказ ");

      }
    }

  }

  @Override
  public void returnOrder() {
    for (iActorBehaviour actor : queue) {
      if (actor.getActor().isMakeOrder) {
        actor.setTakeOrder(true);
        System.out.println(actor.getActor().getName() + " клиент вернул свой заказ ");
      }
    }
  }
}