
/**
 * Get to 21 without going over 
 * 
 *
 * @author Jacinto Garcia
 * @version 9.14.18
 */

import java.lang.Math;
import java.util.Scanner;
public class BlackJack
{
    public static void main(){
        boolean stop = false;
        Hand player = new Hand(0,0,0);
        Hand dealer = new Hand(0,0,0);

        dealer.setCard1();
        System.out.println("The dealer is showing a(n) " + dealer.getCard1());

        player.setCard1();
        System.out.println("Your first card is " + player.getCard1());

        player.setCard2();
        System.out.println("Your second card is " + player.getCard2());
        System.out.println("Your total is: " + player.getTotal());
        while(stop == false && player.getTotal() < 21){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like to hit? (enter '1' to hit and '2' to stop) ");
            int input = scanner.nextInt();
            if(input == 1){
                player.hit();
                System.out.println("Your total is: " + player.getTotal());
            }
            else if(input == 2){
                stop = true;
                System.out.println("You stop playing and it is the dealers turn now.");
            }
            System.out.println("");
        }    
        if(player.getTotal() > 21){
            System.out.println("YOU WENT OVER 21: THE DEALER WINS");
        }else{
            System.out.println("Your final total is: " + player.getTotal());
            System.out.println("");
            while(dealer.getTotal() < 17){
                System.out.println("The dealer draws");
                dealer.hit();
                System.out.println("");
                System.out.println("The dealer's total is: " + dealer.getTotal());
            }
            if(player.getTotal() > dealer.getTotal()){
                System.out.println("You win");
            }else if(dealer.getTotal() > 21){
                System.out.println("The dealer is over 21. You win");
            }else if(player.getTotal() < dealer.getTotal()){
                System.out.println("Dealer Wins");
            }else{
                System.out.println("You and the dealer draw, no one wins.");
            }
        }
    }
}