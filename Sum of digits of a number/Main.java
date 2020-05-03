import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner( System.in );
      int n = in.nextInt();
      int count = n % 10;
      while ( n > 0 )
      {
        n = n / 10;
        
        count = count + (n % 10);
      }
      System.out.println(count);
	}
}