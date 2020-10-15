package 자구1과제;
import java.util.*;
public class 백준1874 {
	 public static void main(String[] args) {
		 
	        Scanner sc = new Scanner(System.in);
	        int top = -1;
	        System.out.println("수열길이를 입력하세요");
	        int n = sc.nextInt(); 
	        char cal[] = new char [1000];
	        int[] arr= new int[n+1]; 
	        int stack[] = new int[1000];
	        char cal1[] = new char [1000]; 
	        
	        for(int i=0; i<n;i++) {
	            arr[i] = sc.nextInt();
	        } 
	        int x=0;
	        int y=0;
	        for (int i=1;i<=n;i++) {
	           stack[++top]=i;
	           cal1[y]='+';
	           y++;
	           while(!(top==-1)&&stack[top]==arr[x]) {
	              cal1[y]='-';
	              y++;
	              x++;
	              top--;
	           }
	        }
	        
	        if(top==-1) System.out.println(cal1);
	        else  System.out.println("NO");
	              

	     
	}
}

