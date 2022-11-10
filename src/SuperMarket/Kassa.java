package SuperMarket;

import java.util.ArrayDeque;
import java.util.Queue;

public class Kassa {

    private String market = "Малинка";
    private String buyer;

    private Queue<String> kassa1 = new ArrayDeque<>(5);
    private Queue<String> kassa2 = new ArrayDeque<>(5);

    public Kassa(String buyer) {
          this.buyer = buyer;
    }

    public String getBuyer() { return buyer;
    }
    public void setBuyer(String buyer) { this.buyer = buyer;
    }
    public String getMarket() {return market;
    }
    public static int sizeQueue () {
        return (int) Math.round(Math.random() * 5);
    }


    public boolean isСrowded () {

       for (int i = 0; i < 10; i++) {
           if (kassa1.size() < 5) {
               kassa1.offer(buyer);
           } else kassa2.offer(buyer);
       }
       return true;
    }

}
