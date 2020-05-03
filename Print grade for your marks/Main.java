import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner n = new Scanner(System.in);
int n1 = n.nextInt();
if(n1>=85)
  System.out.println("A");
else if(n1<85 && n1>=75)
   System.out.println("B");
else if(n1<75 && n1>=65)
   System.out.println("C");
else if(n1<65 && n1>=55)
   System.out.println("D");
else if(n1<55 && n1>=45)
   System.out.println("E");
else 
   System.out.println("Fail");
    }
}