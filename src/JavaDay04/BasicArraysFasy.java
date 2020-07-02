package JavaDay04;
import java.util.*;


public class BasicArraysFasy {

    public static void main(String[] args) {

/*A6. Fill and Print an array
Write a program that stores 10 integers in an array. Once they are all read in, print them to the screen with a loop.*/
        Scanner in = new Scanner(System.in);
        int[] numbersArray= new int[10];
        for(int i = 0; i < numbersArray.length; i++){
            System.out.print("Please the the Number: " + (i+1) + "/10: ");
            numbersArray[i] = in.nextInt();
        }

        System.out.println();
        System.out.print("You entered: ");
        for (int i = 0; i< numbersArray.length; i++){
            System.out.print(numbersArray[i]);
            if(i < numbersArray.length - 1){
                System.out.print(", ");
            }
        }
//A7. Read in 10 integers from the keyboard storing them in an array. Then print out the same integers in reverse order of input.

        System.out.println();
        System.out.println("Now in reverse order");
        System.out.print(":deretne uoY ");
        for (int i = 0; i< numbersArray.length; i++){
            System.out.print(numbersArray[numbersArray.length - 1 - i]);
            if(i < numbersArray.length - 1){
                System.out.print(", ");
            }
        }

//A8. Write a Java program to calculate the average value of array elements.
        System.out.println();
        int average = 0;
        for(int i : numbersArray){
            average += i;
        }
        average /= numbersArray.length;
        System.out.println("The average value of the entered numbers is " + average);

//A9. Write a Java program to find the index of an array element.
        System.out.println();
        System.out.print("Which number to be searched for? ");
        int searchNumber = in.nextInt();
        String index = "";
        for (int i = 0; i < numbersArray.length; i++){
            if (numbersArray[i] == searchNumber){
                index += String.valueOf(i + 1) + " ";
            }
        }
        if(index.length() == 0){
            System.out.println("Nothing found!");
        }
        else{
            System.out.println("Found on position(s) " + index + " ");
        }

        //myStr.indexOf only finds the first element

//A10. Write a Java program to remove a specific element from an array.

        System.out.print("Which element should be removed? Enter Index#: ");
        int removeIndex;
        removeIndex = in.nextInt();

        //length of array???



//A11. Write a Java program to find the duplicate values of an array of integer values.

        System.out.println("Removing Duplicates--------------------");
        System.out.println("Duplicates: ");
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[i] == (numbersArray[j])) {
                    System.out.println("Duplicate found on " + i + " and " + j);
                }
            }
        }

        }
    }
