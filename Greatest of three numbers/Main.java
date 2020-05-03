import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner n = new Scanner(System.in);
      int n1,n2,n3;
      n1 = n.nextInt();
      n2 = n.nextInt();
      n3 = n.nextInt();
      if(n1>n2)
      {
        if(n1>n3)
          System.out.println(n1);
        else
          System.out.println(n3);
      }
      else if(n2>n3)
        System.out.println(n2);
      else
        System.out.println(n3);
    }
}