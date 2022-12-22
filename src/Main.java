public class Main {
    public static void main(String[] args) {
        Player player = new Player("User1",1,false);
        Dice dice1 = new Dice();
        System.out.println(dice1.getRandom());
    }
}