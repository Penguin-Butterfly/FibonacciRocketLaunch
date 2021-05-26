package edu.sla;

import java.util.ArrayList;

public class Sequence implements Fibonacci {
    // Fields
    int amountofNumbersInSequence = 0;
    int number1 = 0;
    int number2 = 0;
    public static ArrayList FibSequence;


    //Constructor

    Sequence(int amount, int num1, int num2){
        amountofNumbersInSequence = amount/2;
        number1 = num1;
        number2 = num2;
    }


    // Methods
    public void run(){
        FibSequence = new ArrayList();
        System.out.print("Sequence:  ");

        /*
        System.out.println(number1);
        System.out.println(number2);

        int prev1 = 0;
        int prev2 = 0;
        int newNum = number1;

        prev1 = number1;
        prev2 = number2;
        newNum = prev1 + prev2;
        System.out.println(newNum);
        */

        for (int i =0; i < amountofNumbersInSequence; i++){

            //add numbers to arraylist
            FibSequence.add(number1);
            FibSequence.add(number2);

            //print numbers
            //System.out.println(number1);
            //System.out.println(number2);

            //operations
            number1 = number1 + number2;
            number2 = number1 + number2;

            /*
            newNum = prev1 + prev2;
            System.out.println(newNum);
            prev1 = number2;
            prev2 = number1 + number2;
            */
        }

        System.out.println(FibSequence);
    }
}
