package application;



import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT); // Instanciamento do construtor CONSTRUTOR , COM O DATE E O ENUM COMO PARAMETRO
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;  
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1); // aqui passa o atributo do enum que vai ser impresso
		System.out.println(os2); // neste caso ser� impresso a string passada no valueOF
	}
}
