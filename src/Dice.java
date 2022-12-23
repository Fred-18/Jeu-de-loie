
public class Dice {
    private int face;

    public int getRandom() {
        int min = 1;
        int max = 6;
        int range = (max - min + 1);
        int rand = (int) (Math.random() * range) + min;
        face = rand;
        return rand;
    }
    
    public int getFace(){
        return face;
    }
}
