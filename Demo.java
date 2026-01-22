import java.util.Scanner;

public class Demo{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    println("Hello world!");
    sleep(2000);
    print("What is your name: ");
    String name=input(input);
    println("Hi! "+name); //newline
  }

  public static void print(Object x){
    System.out.print(x);
  }

  public static void println(Object y){
    System.out.println(y);
  }

  public static String input(Scanner input){
    return input.nextLine();
  }
  
  public static void sleep(int ms){
    try{
      Thread.sleep(ms);
    }catch(InterruptedException e){
      System.exit(0);
    }
  }
}
