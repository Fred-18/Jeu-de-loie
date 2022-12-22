public class Dice {
    public int num;
    Dice(){
        this.num=num;
    }
    public int getRandom(){
        int min = 1;
        int max = 6;
        int range = (max - min +1);
        int rand = (int)(Math.random()*range) + min;
        return rand;
    }

}
