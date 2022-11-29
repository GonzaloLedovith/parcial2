package parcial2;

import java.util.LinkedList;
import java.util.Scanner;







class Main {

	public static void main(String[] args) {
		
		Encargado encargado = new Encargado("juan", "martinez", "45455457", 23);
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("hubo una venta? poner 1 para si y 0 para no");
		int res;
		res= entrada.nextInt();
		while (res!=0) {
			
			
		
		LinkedList<Venta> ventas = new LinkedList<Venta>();
		
	
		cargarventas(ventas, 0, null, 0, null, 0, null);
		
		System.out.println("quiere cargar otra venta ? si no quiere significa que se termino el dia, respona 0 para no y 1 para si");
		res= entrada.nextInt();
		for (int i = 0; i < ventas.size(); i++) {
			System.out.println("lista"+ ventas.get(i));
	}
		}
		
	
			
		

		
	}
	
	
	public static void cargarventas(LinkedList<Venta> ventas, int id, String cafe, int cantidad, String tarjetasocio, double preciotot, Venta venta ) {
		Venta venta1 = new Venta(1, "latt", 1, "si", 1);
		double precio;
		precio=0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("id de la venta?");
		id= entrada.nextInt();
		System.out.println("cafe vendido? responda con el numero que corresponda: \n1=Latte \n2=Flat White  \n3=Lagrima   \n4=Expresso");
		int op;
		op=0;
		op= entrada.nextInt();
		switch (op) {
		case 1:
			cafe = "Latte";
			precio = 1.50;
			break;
			
		case 2:
			cafe = "Flat White";
			precio = 2.50;
			break;
			
		case 3:
			cafe = "Lagrima";
			precio = 1.30;
			break;
			
		case 4:
			cafe = "Expresso";
			precio = 1.00;
			break;

		default:
			System.out.println("la opcion ingresada no es valida");
			break;
		}
		System.out.println("cantidad?");
		cantidad= entrada.nextInt();
		preciotot=cantidad*precio;
		System.out.println("tenia tarjeta de socio el cliente?");
		String res;
		res=entrada.next();
		if (res.equalsIgnoreCase("si")) {
			preciotot=preciotot*0.85;
			System.out.println("el precio que queda gracias al descuento de socio es: " + preciotot);
			for (int i = 0; i < ventas.size(); i++) {
				System.out.println("lista"+ ventas.get(i).getCafe());
		}
		} else {
System.out.println("el precio total es: " + preciotot);
		}
		
	System.out.println(ventas);
	}

	
}
