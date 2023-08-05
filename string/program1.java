import java.util.*;
class Demo{
	public static void main(String args[]){
		String str = "Shivani";
		String gtr = "Raut";
		Scanner sc = new Scanner(System.in);
		//String str = sc.next();
		//String str = sc.nextLine();
		System.out.println(str);
		
		int len = str.length();		//length()
		System.out.println(len);
		
		for(int i=0; i<str.length();i++){
			char s = str.charAt(i);		//charAt
			System.out.print(s+" ");
		}
		System.out.println();
		//System.out.println(s);
		
		System.out.println(str.indexOf('i'));   //indexOf

		System.out.println(str.compareTo(gtr));		// compareTo --> str == gtr -> 0, str>gtr -> 1, str<gtr -> -1

		System.out.println(str.contains("van"));	// contains

		System.out.println(str.startsWith("Shiv"));	//startsWith
	
		System.out.println(str.endsWith("ani"));	//endsWith

		System.out.println(str.toUpperCase());		//toUpperCase

		System.out.println(str.toLowerCase());		//toLowerCase

		System.out.println(str.concat(gtr));		//concat

		System.out.println(str.lastIndexOf("i"));	
		
		}
}

