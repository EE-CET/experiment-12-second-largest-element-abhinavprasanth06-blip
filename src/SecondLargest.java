import java.util.Scanner;
public class LargestTwice {
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
		System.out.print("???");
		System.out.println(max);
		System.out.println(arr[i]);
                max = arr[i]; 
		
		System.out.println(max);
		temp = i; 
	     }
		 	
	}	
	for(int i =0;i<size;i++){
        if(2*arr[i]<=max){
		System.out.print("++");
                flag = 1;   	
	    }
		else if(size == 1){
			
			System.out.print(1);
		}
	    else{
		System.out.print(-1);
		flag =0;
		break;
	    }
	}
	if(flag==1){
		System.out.print(temp);
	}
   }
}
