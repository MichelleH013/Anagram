import java.util.*;
public class Anagram {
	public static void main (String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Geben Sie ihr Wort ein: ");
		String wort1=sc.nextLine();
		int laenge1=wort1.length();
		System.out.println("Geben Sie ihr zweites Wort ein: ");
		String wort2=sc.nextLine();
		int laenge2=wort2.length();
		int s=0; 	//schleifenzähler
		char c;
		int z=0; 	//übereinstimmungszähler
		wort1=wort1.toLowerCase();
		wort2=wort2.toLowerCase();
		String copy2 = new String(wort2);
	   	if (laenge1!=laenge2){			//falls Länge unterschiedlich:
            		System.out.println(wort1+" und "+ wort2+" sind Kein Anagram!");    }
        	else{
			while(s<laenge1){		//durchgehen jedes Buchstaben in Wort 1
				c=wort1.charAt(s);	
				if (copy2.indexOf(c) != -1) { //Überprüfung ob Buchstabe im Wort enthalten ist
					z+=1;			//wenn ja übereinstimmungszähler wird hochgezählt
					copy2 = copy2.substring(0, copy2.indexOf(c)) + copy2.substring(copy2.indexOf(c)+1); //Herausnehmen des chars
				} else {			//Falls Buchstabe nicht vorhanden ist:
					System.out.println(wort1+" und "+ wort2+" sind kein Anagram!");
				    	break;
				}
				s++;
		    	}
			if (z == laenge1) {			//übereinstimmungszähler = länge des ersten Wortes
				System.out.println(wort1+" und "+ wort2+" sind ein Anagram");
			}
		}      
		sc.close();			
	}					//Arbeitszeit:ca. 2 Stunden 
}
