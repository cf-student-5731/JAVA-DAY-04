package JavaDay04;
import java.util.*;

public class AdvancedLoopsFasy {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

//A5. Find all occurrences of X in a number array
//        1. Creates an array of 10 items and fills it with various numbers, for example: 3, 10, 42, 12, ....
//        2. User can enter a number and ask to find it in the array
//        3. The program loops through the array and counts the number of found item(s)
//        4. If nothing is found - do not display 0, instead display “Nothing found”.
//        5. If at least one item is found - display the number of found items.


        System.out.print("How many elements should be in the array? ");
        int[] numberArray = new int[in.nextInt()];
        System.out.print("What should be the highest random number in the array? ");
        int maxNumber = in.nextInt();

        for (int i = 0; i < numberArray.length; i++){
            numberArray[i]= rand.nextInt(maxNumber);
            if(i == 0){
                System.out.println("The generated Array: ");
            }
            System.out.print(numberArray[i]);
            if(i < numberArray.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Which number to be searched for? ");
        int searchNumber = in.nextInt();
        int counter = 0;
        for (int i = 0; i < numberArray.length; i++){
            if (numberArray[i] == searchNumber){
                counter++;
            }
        }
        if(counter == 0){
            System.out.println("Nothing found!");
        }
        else{
            System.out.println(counter + " Items found in the Array");
        }

    }

}
