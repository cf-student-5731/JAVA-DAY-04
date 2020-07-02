package JavaDay04;
import java.util.Scanner;

public class AdvancedArraysFasy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//A12 Calorie calculator
        String[] foodPortion = {"1dl  milk", "1 slice of bread", "100 gr chicken breast", "200gr salad"};
        int[] kcalPerPortion = {62, 74, 165, 33};

        int[] breakfast = {2, 3, 0, 0};
        int[] lunch = {1, 0, 2, 1};
        int[] dinner = {2, 3, 0, 0};

        int[] totalCalories = {0, 0, 0};

        System.out.println("BREAKFAST");
        for(int i = 0; i < breakfast.length; i++ ){
            if(breakfast[i] > 0){
                System.out.print(breakfast[i] + " x ");
                System.out.print(foodPortion[i] + " ==> ");
                System.out.println("Calories: " + kcalPerPortion[i]);
                totalCalories[0] += kcalPerPortion[i];
            }
        }
        System.out.println("Total Calories: " + totalCalories[0]);


        System.out.println("===========");
        System.out.println("LUNCH");
        for(int i = 0; i < lunch.length; i++ ){
            if(lunch[i] > 0){
                System.out.print(lunch[i] + " x ");
                System.out.print(foodPortion[i] + " ==> ");
                System.out.println("Calories: " + kcalPerPortion[i]);
                totalCalories[1] += kcalPerPortion[i];
            }
        }
        System.out.println("Total Calories: " + totalCalories[1]);

        System.out.println("===========");
        for(int i = 0; i < dinner.length; i++ ){
            if(dinner[i] > 0){
                System.out.print(dinner[i] + " x ");
                System.out.print(foodPortion[i] + " ==> ");
                System.out.println("Calories: " + kcalPerPortion[i]);
                totalCalories[2] += kcalPerPortion[i];
            }
        }
        System.out.println("Total Calories: " + totalCalories[2]);
        System.out.println("===========");
        int result = 0;
        for (int i : totalCalories){
            result += i;
        }
        System.out.println("TODAY you consumed: " + result + " Calories");

    }
}
