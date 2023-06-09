package start.java;

import java.util.Random;
class dice{
    public static void main(String args[]){
        System.out.println("Rolling dice...");
        Random r = new Random();
        int num,i,sum = 0;
        for(i = 1; i <= 2; i++){
            num = r.nextInt(6) + 1;
            System.out.println("Die" + i + ": " + num);
            sum += num;
        }
        System.out.println("Total value: " + sum);
        if(sum > 7){
            System.out.println("You won");
            }  else {
                System.out.println("You lost");
            }
    }
}
