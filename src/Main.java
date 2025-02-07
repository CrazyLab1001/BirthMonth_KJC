import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthMonth = 0;
        String trash = "";
        System.out.println("What is your birth month (1-12)? ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt())
        { birthMonth = in.nextInt(); }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input! Try running the program again and entering a number, 1-12. :)");
            return;
        }
        if ((12 >= birthMonth) & (birthMonth >= 1))
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println(birthMonth + " is not a valid number! Try running the program again and entering a number, 1-12. :)");
            return;
        }

    }
}