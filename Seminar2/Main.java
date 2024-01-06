package Seminar2;

import Seminar2.Interfaces.iActorBehaviour;
import Seminar2.Classes.*;

public class Main {
  public static void main(String[] args) {
    Market magnit = new Market();
    // добавляем клиентов
    Actor client1 = new OrdinaryClient("Boris", 1);
    Actor client2 = new OrdinaryClient("Olga", 2);
    Actor client3 = new SpecialClient("Kirkorov", 1);
    iActorBehaviour client4 = new TaxInspector();
    Actor client5 = new ActionClient("Evgeny", 1, "Sousages1+1");
    // пускаем клиентов в магазин
    magnit.acceptToMarket(client1);
    magnit.acceptToMarket(client2);
    magnit.acceptToMarket(client3);
    magnit.acceptToMarket(client4);
    magnit.acceptToMarket(client5);
    // обновляем статус
    magnit.update();

  }
}
