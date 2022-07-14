public class flipcoin {
        public static void main(String[] args) { 
        	int counttail=0;
        	int counthead=0;
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