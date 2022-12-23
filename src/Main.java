
public class Main {

    public static void main(String[] args) {
        Player joel = new Player("Joel", "$");
        Dice dice1 = new Dice();

        Dice dice2 = new Dice();
  
     
        while (true) {
            if (joel.getPosition() == 63) {
                System.out.println("Hurray :" + joel.getName() + " won !!");
                break;
            } else {
                joel.rollDice(dice1.getRandom(), dice2.getRandom());
                if (joel.getPosition() == 0 && joel.getSum() == 9 && (dice1.getFace() == 6 || dice1.getFace() == 3)) {
                    joel.bonusMagic(26);
                } else if (joel.getPosition() == 0 && joel.getSum() == 9 && (dice1.getFace() == 5 || dice1.getFace() == 4)) {
                    joel.bonusMagic(53);
                } else if ((joel.getPosition() == 0 && joel.getSum() == 6))   {
                    joel.bonusMagic(12);
                } else {
                    joel.changePosition(joel.getSum());
                    if (joel.getPosition() > 63) {
                        int diff = joel.getPosition() - 63;
                        joel.setPosition(63 - diff);
                    }
                }

                Board(joel);
            }
        }
    }

    public static void Board(Player player) {
        for (int i = 0; i <= 63; i++) {
            System.out.print(i);

            if (i < 10) {
                System.out.print("  ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");

        for (int y = 0; y <= 63; y++) {
            if (player.getPosition() == y) {
                System.out.print(player.getSymbol());
            }
            System.out.print("   ");

        }

    }

}
