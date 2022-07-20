package by.academy;
import by.academy.Exceptions.NotBirdException;
import by.academy.Exceptions.NotDogException;
import by.academy.Exceptions.SecondException;

public class Main {
    public static void main(String[] args) {
        System.out.println(Animals("Dog"));
        System.out.println("------------------------------------");
        System.out.println(Animals("Penguin"));
        System.out.println("------------------------------------");
        System.out.println(Animals("Bird"));
        System.out.println("------------------------------------");
        System.out.println(Animals("Elephant"));
        System.out.println("------------------------------------");

        try {
            isNumber(4);
            isNumber(2);
            isNumber(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        } catch (SecondException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finally!!");
        }
        System.out.println("You are SUPERHEROES!");
        System.out.println("------------------------------------");
    }


    private static void isNumber(int number) throws SecondException {

        int array[] = {1, 2, 3, 4, 5};
        if (number == 2) {
            throw new SecondException("Element must not be second!");
        }
        System.out.println(number + " array element is : " + array[number]);
    }


    private static String Animals(String string) {

        try {
            if (string == "Dog") {
                throw new NotDogException("The animal cannot be a dog!!!");

            } else if (string == "Bird") {
                throw new NotBirdException("The animal cannot be a bird!!!");
            }
            System.out.println("This animal is: " + string);

        } catch (NotDogException e) {
            System.out.println(e.getMessage());

        } catch (NotBirdException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Finally!!!");
        }

        return "This is a ZOO";
    }
}
