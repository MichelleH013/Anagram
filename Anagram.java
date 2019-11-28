import java.util.*;
public class Anagram {
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Geben Sie ihr Wort ein: ");
	String wort1=sc.nextLine();
	System.out.println("Geben Sie ihr zweites Wort ein: ");
	String wort2=sc.nextLine();
	wort1=wort1.toLowerCase();	
	wort2=wort2.toLowerCase();
	   char[] c1= wort2.toCharArray();
	   char[] c2 = wort1.toCharArray();
	   Arrays.sort(c1);
	   Arrays.sort(c2);
	   	if(Arrays.equals( c1, c2 )){		   
		   System.out.println(wort1+" und "+ wort2+" sind ein Anagram"); 
	   			}
	   	else{
		   System.out.println(wort1+" und "+ wort2+" sind kein Anagram");
	   		}
	   sc.close();	   //Arbeitszeit ca. 5-10 min, wie konnte ich da nicht draufkommen????
}}
