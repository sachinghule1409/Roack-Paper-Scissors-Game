package com.company;
import java.util.Random;
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(3);
        System.out.println("Enter the choice for 1)Scissor 2)Rock 3)Paper:");
        int a = sc.nextInt();
        if(x==a)
        {
            System.out.println("Match is Tied");
        }
        else if(x==0)
        {
            if(a==1)
            {
                System.out.println("You Loose");
            }
            else
            {
                System.out.println("You Win");
            }
        }
        else if(x==1)
        {
            if(a==2)
            {
                System.out.println("You Loose");
            }
            else
            {
                System.out.println("You Win");
            }
        }
        else if(x==2)
        {
            if(a==1)
            {
                System.out.println("You Loose");
            }
            else
            {
                System.out.println("You Win");
            }
        }

    }
}
