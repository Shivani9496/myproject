class Demo{
	public static void main(String args[]){
		String str ="Shivani";
		str = str + "raut";
		str += "raut";
		str += 't';
		str += 9496;
		
		System.out.println(str);

		System.out.println("Shiv"+94+96);
		System.out.println("Shiv"+(94+96));
		System.out.println(94+96+"Shiv");
		
		
		/*for(int i=0; i<str.length();i++){
			for (int j=0; j<str.length(); j++){
				System.out.println(str.substring(i,j));
			}
			System.out.println();
		}*/
		for(int i=0; i<str.length() ;i++){
		System.out.println(str.substring(i));
		}
		
		String str1 =""; 
		for(int i=0; i<=10; i++){
			System.out.print(str1+i);
		}
	}
}

