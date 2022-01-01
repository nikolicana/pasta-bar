package order_and_pick_up;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {
		
		
		
		String[] ing = { "Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina", "Piletina",
				"4 sira", "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke",
				"Kutija" };
		int[] price = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		String[] numbersVip = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };
		int cena = 0;
		System.out.println("Izvolite!!!");
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite sastojak za pastu: ");
		String ingridient = s.nextLine();

		while (!(ingridient.equals("Poruci"))) {
            
			
			System.out.println("Unesite sastojak za pastu: ");
			ingridient = s.nextLine();
			int index = findIng(ing, ingridient);
             cena=cena+price[index];
		}
		System.out.println("Unesite broj telefona: ");
		String number = s.next();
		
		
		if (findVip(numbersVip, number)) {
           cena=cena-cena*10/100;
           System.out.println("Vaša pasta iznosi " + cena + " rsd");
           System.out.println("Prijatno!!!");
			
		} else {
			System.out.println("Vaša pasta iznosi " + cena + " rsd");
			System.out.println("Prijatno!!!");
		}
		
		
		
	 
		

	}

	public static int findIng( String []ing, String nameIng) {
		int index=0;
		for (int i=0;i<ing.length;i++) {
			if(nameIng.equals(ing[i])){
				index=i;
			}
		}return index;
	}
	
	
	public static boolean findVip(String [] numbersVip, String number) {
		boolean vip=false;
		for (int i =0;i<numbersVip.length;i++) {
			if (number.equals(numbersVip[i])) {
				 vip=true;
			}
		}return vip;
	}
}
