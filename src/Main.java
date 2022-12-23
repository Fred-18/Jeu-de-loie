import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Player joel = new Player("Joel",0,false);
        Dice dice1 = new Dice();

        Dice dice2 = new Dice();
        while(joel.sum<12){
            joel.rollDice(dice1.getRandom(),dice2.getRandom());
            System.out.println(joel.sum);
            joel.changePosition(joel.sum);
            Board(joel.position);
        }

     }
       public static void Board(int x){
        for (int i= 0;i<=63;i++){
            System.out.print(i);

          if (i<10) {
                System.out.print("  ");
            }
          else{
              System.out.print(" ");
          }
        }
        System.out.println("");

           for (int y=0;y<=63;y++){
               if (x==y){
                   System.out.print("z");
               }

                   System.out.print("   ");

               }

       }

       }





