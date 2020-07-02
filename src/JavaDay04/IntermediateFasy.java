package JavaDay04;
import java.util.Scanner;

public class IntermediateFasy {

    public static void main(String[] args) {

//A3. Write a program that asks the user for the first number and the last number and
//then prints odd numbers between those two.

        int[] numbersArray = new int[100];

        for(int i = 0; i < 100; i++){
            numbersArray[i] = i+1;
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter Start value: ");
        int start = in.nextInt();
        System.out.print("Please enter End value: ");
        int end = in.nextInt();

        for (int j = start-1; j < end-1; j++){
            if (numbersArray[j] %2 !=0){
                System.out.println(numbersArray[j]);
            }
        }
//A4. Write a program that calculates the sum 1+2+3+…+n where n is a number entered
//by the user.
        System.out.println("---------------------------------------------------------");
        System.out.print("Please enter a Number to be summed up: ");
        float n = in.nextFloat();
        System.out.println((int)((n/2f + 0.5f) * n));

    }
}
