import java.util.*;
class c2w{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("n = ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			
		}

		System.out.print("x = ");
		int x = sc.nextInt();

		for(int i=0; i<n; i++){
			
			if(arr[i] == x){
			System.out.println(i);
			}
		}
		

	}
}
