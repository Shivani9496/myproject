import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("n = ");
		int n = sc.nextInt();

		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		
		int larg = a[0];
		for(int i=0; i<n; i++){
			if(larg<a[i]){
				larg = a[i];
			}
		}
		System.out.println(larg);
	}
}
