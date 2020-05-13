import java.util.Scanner;
class Main{
  public static void main(String[] args) {
   Scanner var = new Scanner(System.in);
    int n1 = var.nextInt();
  
    int sol= (n1/10)%10;
    System.out.println(sol);
  }
}