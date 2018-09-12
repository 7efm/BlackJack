
/**
 * Write a description of class Hand here.
 *
 * @author Jacinto 
 * @version 9.12.18
 */
import java.lang.Math;
public class Hand
{
    private int total;
    private int card1;
    private int card2;
    public Hand(int tot, int c1, int c2){
        total = tot;
        card1 = c1;
        card2 = c2;
    }

    public int hit(){
        card2 = (int)(Math.random()*11)+1;
        this.total = total + card2;
        System.out.println("You get a(n) " + card2);
        System.out.println("Your total is: " + total);
        return total;
    }

    public int getTotal(){
        return total;
    }

    public void setTotal(int card2){
        this.total = total + card2;
    }
    public int setCard1(){
        this.card1 = (int)(Math.random()*11)+1;
        this.total = card1 + total;
        System.out.println("Your first cards are ");
        System.out.println(card1);
        return card1;
    }
}
