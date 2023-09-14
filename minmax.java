import java.util.*;
class c2w{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("N = ");
		int n = sc.nextInt();

		int arr[] = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		for(int i=0; i<n; i++){
			if(min>arr[i]){
				min = arr[i];
			}
			else if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("Minimum is " +min+ " and maximum is "+max);
	}
}
			

			
