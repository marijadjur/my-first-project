package lv.acodemy.classroom;

import java.util.Arrays;
import java.util.List;

public class VariablesDataTypes {
    public static void main(String[] args) {
        byte myCurrentAge = 30;
        System.out.println(myCurrentAge);

        //short data type
        short salaryPerMonth = 10000;
        System.out.println(salaryPerMonth);

        //char short data type
        char firstNameLetter = 110; // 'm'
        System.out.println(firstNameLetter);

        // int data type
        int dateOfBirth = 150792;
        System.out.println(dateOfBirth);

        //long data type
        long populationOfLatvia = 1800000;
        System.out.println(populationOfLatvia);

        //float data type
        float lapTime = 32.30f;
        System.out.println(lapTime);

        //double data type
        double weight= 60.2;
        System.out.println(weight);

        //booloan is;has;
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApplea = true;

        //String
        String name = "Marija";
        String surname = "Djura";

        //Concatenation
        String fullName= name + " " + surname;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;
        //System.out.println("Marija Djura30");
        //Marija Djura30

        System.out.printf("My full name is: %s. I am %d years old. %n%n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.", fullName, myCurrentAge);

        //*
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);

        // / division
        double result = (double) a / b;
        System.out.println(result);

        // incorrect result = 0 , should be 0.5, so we need to change to double. see above
        c = a / b;
        System.out.println(c);

        // % residual amount from division
        int number = 10 % 9;
        System.out.println(number);

        //choose from massive
        int[] numbers = {0, 1, 2, 3, 4 ,5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));

        for(int i = 0; i < numbers. length; i++) {
            if (numbers[i] %2 ==0) {
                System.out.println("This is even number:" + numbers);

            }
        }





    }
}
