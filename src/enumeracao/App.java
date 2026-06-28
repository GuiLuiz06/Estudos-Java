package enumeracao;

import java.sql.SQLOutput;
import java.util.Date;

public class App {
    public static void main(String[] args) {

        Order ord = new Order(1080, new Date(), OrderStatus.PENDING_PAGAMENT);

        System.out.println(ord);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);

    }
}
