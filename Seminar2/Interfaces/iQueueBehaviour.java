package Seminar2.Interfaces;

// Создаем интерфейс и его методы
public interface iQueueBehaviour {
  public void takeInQueue(iActorBehaviour actor);

  public void releaseFromQueue();

  public void takeOrder();

  public void giveOrder();
}