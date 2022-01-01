package order_and_pick_up;

public class PastaBar {

	public static void main(String[] args) {
		
		
		
		String [] ing= {"Makarone", "Spagete", "Bolognese", "Curetina", "Govedja prsuta", "Slanina", "Piletina", "4 sira",
				        "Dimljeni sir", "Parmezan", "Pavlaka", "Pesto sos", "Napolitana", "Povrce mix", "Pecurke", "Kutija"};
		int [] price= {50,60,120,120,140,100,100,100,80,50,80,80,80,50,50,20};
	
		String [] numbersVip= {"0631111111", "063222222","063333333","064444444","065555555","066666666"};
				
  
		

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
