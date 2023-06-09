package start.java;

import java.util.Random;
import java.util.Scanner;
class dice{
    public static void main(String args[]){
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?");
        name = sc.next();
        System.out.println("Hello, " + name + "!");
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
