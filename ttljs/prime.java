import java.util.*;
  
  public class prime{
  
  public static void main(String[] args)throws Exception{
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      for(int i = 0; i < t; i++){
          int n = scn.nextInt();
          int count = 0;
          for(int j = 2; j*j <= n; j++){
              if(n % j == 0){
                  count++;
              }
          }
          if(count > 0){
              System.out.println("not prime");
          }else{
              System.out.println("prime");
          }
      }
      scn.close();
   }
  }