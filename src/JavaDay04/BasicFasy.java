package JavaDay04;

public class BasicFasy {
    public static void main(String[] args) {

//A1. Write a program, that prints integers (whole numbers) from 1 to 100. The
//program output should be:

        int[] oneToHundred = new int[100];

        for (int i=0; i<100; i++){
            oneToHundred[i] = i+1;
        }

        for (int j : oneToHundred){
            System.out.println(j);
        }

//A2. Write a program that prints all even numbers between 2 and 100. Example output:
        System.out.println("--------------------------------");

        for (int j : oneToHundred){
            if (j % 2 != 0){
                continue;
            }
            System.out.println(j);
        }
    }
}
