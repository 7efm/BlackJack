
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
        System.out.println("The card is a(n) " + card2);
        return total;
    }

    public int getTotal(){
        return total;
    }

    public int setCard1(){
        this.card1 = (int)(Math.random()*11)+1;
        this.total = card1 + total;
        return card1;
    }

    public int setCard2(){
        this.card2 = (int)(Math.random()*11)+1;
        this.total = card2 + total;
        return card2;
    }

    public int getCard1(){
        return card1;
    }

    public int getCard2(){
        return card2;
    }
}