import java.util.Scanner;
public class flipcoin {
        public static void main(String[] args) { 
        	int counttail=0;
        	int counthead=0;
        	System.out.println("Who are you?");
        	Scanner sc = new Scanner(System.in);
        	String user= sc.next();
        	System.out.println("Hello, " +user +"!");
        	System.out.println("Tossing a coin...");
        	for(int i =1;i<=3;i++) {
                if (Math.random() < 0.5){
                        System.out.println("Round" +i+ ": Heads");
                        counthead++;
                }else{
                        System.out.println("Round"+i+ ": Tails");
                        counttail++;
                }
                
        }
        	System.out.println("Heads: " +counthead + " Tails: "+counttail);}
}