import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Player joel = new Player("Joel",1,false);
        Dice dice1 = new Dice();

        Dice dice2 = new Dice();
        joel.rollDice(dice1.getRandom(),dice2.getRandom());
        System.out.println(joel.sum);
    }


}