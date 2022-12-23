
public class Player {

    private String name;
    private int position;
    private String symbol;
    private int sum;
    private Boolean canPlay;
    //private int index;

    Player(String name, String symbol) {
        this.name = name;
        this.position = 0;
        this.symbol = symbol;
        
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getSum() {
        return sum;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int rollDice(int firstDice, int secondDice) {
        sum = firstDice + secondDice;
        System.out.println(firstDice + " " + secondDice);
        return sum;
    }

    public int changePosition(int changedValue) {
        position += changedValue;
        return changedValue;
    }

    public int bonusMagic(int combo) {
        position = combo;
        return combo;
    }
    
    

}
