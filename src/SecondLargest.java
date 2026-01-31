import java.util.Scanner;
public class SecondLargest {
   public static void main(String[] args){
	System.out.print("enter the size");
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int[]arr= new int[size];
	int max =0;
	int temp =0;
	int flag =0;
	
	for(int i =0;i<size;i++){
            System.out.print("enter the elmt");
            arr[i] = sc.nextInt();
        }
        
	max = arr[0];
	for(int i =0;i<size;i++){
            if(arr[i]>max){
		//System.out.print("???");
		//System.out.println(max);
		//System.out.println(arr[i]);
        max = arr[i];
	//	
		temp = i; 
	     }
		 	
	}
	max = arr[0];
	for(int i =0;i<size;i++){
        if(i == temp){
            //System.out.println(temp);
			continue;	
	    }
		else if(arr[i]>max) {
	//	System.out.println(max);
		//System.out.println(arr[i]);
        max = arr[i];
		
		}
	}
	System.out.println(max);
   }
}
