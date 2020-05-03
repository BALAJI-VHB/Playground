import java.util.Scanner;
class Main { 
	public static void main(String[] args){
      Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(int i = 1; i <= n; i++ )
      {
        if(i==2 || i==3 || i==6)
       {
          for(int j = 1 ; j <= i ; j++ )
          {
            if(j%2==0)
              System.out.print("*");
           else 
               System.out.print ("#");
          }
           System.out.println();
       }
         else
        {
          for(int j = 1; j <= i ; j++ )
          {
            if(j%2==0)
              System.out.print("#");
           else 
               System.out.print ("*");
        }
         System.out.println();
      }
   }
  		
    }
}