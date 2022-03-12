/////////////////// exercise 01 ///////////////////////////////////////////
/*
Initialize an object of the class Person, to null and try to
invoke the isOlderAge() method through that object. Then wrap the code
with a try-catch clause to test the new exception to be handled.
*/

package exercise_01;

public class Main {
    public static void main(String[] args) {

        Person myPerson = new Person();
        myPerson = null;   // <----- The error is here.
        try{
            myPerson.isOlderAge();
        }catch(NullPointerException e){
            System.err.println("The following exception occurs: " + e.getClass().getSimpleName());
            System.out.println("This exception can appear when an objet is not initialized.");
        }finally {
            System.out.println("Finalized.");
        }







    }
}
