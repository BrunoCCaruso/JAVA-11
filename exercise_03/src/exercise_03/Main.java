/////////////////// exercise 03 /////////////////////////
/*
Define a class called DivisionNumber. In the main method use a Scanner to
read two numbers in string form. Then use the parseInt() method of the
class Integer, to convert strings to type int and store them in two variables of type
int. Finally, perform a division with the two numbers and display the result.
 */

package exercise_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        DivisionNumber division = new DivisionNumber();

        try{
            System.out.println("Enter two numbers: \na: ");
            String a = read.next();
            System.out.println("b: ");
            String b = read.next();

        System.out.println("a / b = "+division.divisionMethod(Integer.parseInt(a),Integer.parseInt(b)));

        }catch(ArithmeticException e){
            System.out.println("The following exception occurs: "+e.getClass().getSimpleName());
            System.out.println("This exception can appear when there is an arithmetic inconsistency.");
        }finally {
            System.out.println("Finalized.");
        }





    }
}
