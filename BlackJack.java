
/**
 * Get to 21 without going over 
 * 
 *
 * @author Jacinto Garcia
 * @version 9.10.18
 */

import java.lang.Math;
import java.util.Scanner;
public class BlackJack
{
    public static void main(){
        boolean stop = false;
        Hand player = new Hand(0,0,0);
        Hand dealer = new Hand(0,0,0);
        player.setCard1();
        player.hit();
        while(stop == false && player.getTotal() < 21){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Would you like a hit? (enter '1' for a hit and '2' to stop) ");
            int input = scanner.nextInt();
            if(input == 1){
                player.hit();

            }
            else if(input == 2){
                stop = true;
                System.out.println("You stop playing and it is the dealers turn now.");
            }

        }    
    }
}