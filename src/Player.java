public class Player {
    public String name;
    public int position;
    public Boolean hasPlayed;

    public int sum;

    Player(String name,int position,Boolean hasPlayed){
    this.name=name;
    this.position=position;
    this.hasPlayed=hasPlayed;

    }

    public int rollDice(int a, int b){
        sum= a+b;
        System.out.println(a+" "+b);
        return sum;
    }

    public int changePosition(int c){
        position+=c;
        return c;
    }

    public int bonusMagic(int d ){
        position = d;
        return d;
    }


}
