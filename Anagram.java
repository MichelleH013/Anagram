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
		int s=0;
		char c;
		int z=0;
		wort1=wort1.toLowerCase();
		wort2=wort2.toLowerCase();
		String copy2 = new String(wort2);
	   	if (laenge1!=laenge2){
            		System.out.println(wort1+" und "+ wort2+" sind Kein Anagram!");    }
        	else{
			while(s<laenge1){
				c=wort1.charAt(s);
				if (copy2.indexOf(c) != -1) {
					z+=1;
					copy2 = copy2.substring(0, copy2.indexOf(c)) + copy2.substring(copy2.indexOf(c)+1);
				} else {
					System.out.println(wort1+" und "+ wort2+" sind kein Anagram!");
				    	break;
				}
				s++;
		    	}
			if (z == laenge1) {
				System.out.println(wort1+" und "+ wort2+" sind ein Anagram");
			}
		}      
		sc.close();			
	}
}
