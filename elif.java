package projelerim;

import java.util.ArrayList;
import java.util.Scanner;

public class elif {
	public static void main(String[] args) {
		int lang, mal =1, sum =0,mal1 =1, sum1 =0,sum2,sum3 = 0,fark;
		Scanner scn = new Scanner(System.in);
		String intro ="";
		
		
		while (intro.length() != 12) {
			System.out.println("geben sie eine 12-stellige Nummer ein");
			intro = scn.nextLine();
		}
		
		ArrayList<Integer> ziffernliste = new ArrayList<>();
		
		for (int i = 0; i < intro.length(); i++) {
		ziffernliste.add(Integer.parseInt(intro.substring(i,i+1)));
		}
		System.out.println(ziffernliste);
		
		lang = intro.length();
		for(int i = 0; i < lang; i++) {
			int meinchar = ziffernliste.get(i);
			//System.out.println("Position " + i + " Charaktere: " + meinchar);
			if (i % 2 == 0) {
				mal = 1*meinchar;
				//System.out.println(mal);
				sum = sum + mal;
			} else {
				mal1 = 3*meinchar;
				//System.out.println(mal1);
				sum1 = sum1 + mal1;
			};
		}
		sum2 = sum + sum1;
		int k = 0;
		while(sum2%10!=0) {
			sum2 = sum2+1;
			
		}
		fark = sum2 - (sum + sum1);
		System.out.println(intro + fark +" " + sum+ " " +sum1 + " "+ sum2 + " " + fark );
		
	
		
		System.out.println(lang);
		if(lang<0 || lang>12) {
			System.out.println("sie müssen zwischen 0 und 12 eingeben");
			return;
		}
		
		
		
	}
}