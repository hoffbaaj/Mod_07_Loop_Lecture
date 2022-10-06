import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean done = false;
        int age = 0;
        String trash = "";
        int favNum = 0;
        double itemPrice = 0;
        double totalPrice = 0;
        double average = 0;
        int numItems = 0;
        String respYN;

        double grade = -1; // Valid grades are 0 to 100
        double totalGrade = 0;
        double aveGrade = 0;
        int numGrade = 0;
        final double SENTINAL = -1;


        // Do while loop use every time for input
        // try to get the input
        // repeat until we get it

        /*

        do
        {

        }while(condition);

        boolean done = false;
        do
        {

        }while(!done);

         */

        // Existing age code from M6_Lecture

        done = false;
        do {
            System.out.print("\nEnter your age: ");
            if (in.hasNextInt()) {
                age = in.nextInt();
                in.nextLine(); // Have to clear the buffer after reading a number
                System.out.println("You said your age is " + age);
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }while(!done);

        done = false;
        do {
            System.out.print("Enter your fav num [1 - 10]: ");
            if (in.hasNextLine())
            {
                favNum = in.nextInt();
                in.nextLine();
                if (favNum >= 1 && favNum <= 10)
                {
                    System.out.println("\nYou said your favorite number was " + favNum);
                    done = true;
                }
                else
                {
                    System.out.println("You said your fav num is " + favNum + " but that is out of range");
                }
            }
            else // did not have an int
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number");
            }
        }while(!done);


        // Get the data
        done = false;

        do {
            System.out.print("Enter the price of your item ");
            if (in.hasNextDouble()) {
                itemPrice = in.nextDouble();
                in.nextLine(); // Clear the new line from the buffer

                // Add your price to the total
                totalPrice += itemPrice; // totalPrice = totalPrice + itemPrice
                numItems++; // numItems = numItems + 1
            } else {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + " must be a valid price!");
            }

            System.out.print("Do you have another item [Y/N] ");
            respYN = in.nextLine();
            if (respYN.equalsIgnoreCase("N")) {
                done = true;
            }

        } while (!done);

        average = totalPrice / numItems;

        System.out.println("Number of items is: " + numItems);
        System.out.println("The total of the items is: " + totalPrice);
        System.out.println("The average is: " + average);

        done = false;

        // Grade book example of sentinel input

        do{
            System.out.print("Enter the grade [0-100] or -1 to quit: ");
            if (in.hasNextDouble())
            {
                grade = in.nextDouble();
                in.nextLine(); // Clear the new line from the buffer

                if(grade != SENTINAL)
                {
                    if(grade >= 0 && grade <= 100 )
                    {
                        // Add your grade to the total
                        totalGrade += grade;
                        numGrade++;
                    }
                    else
                    {
                        System.out.println("Grade must be in range [0-100]: You entered " + grade);
                    }
                }
                else
                {
                    done = true;
                }
            }
                else
            {
                trash = in.nextLine();
                System.out.println("You entered: " + trash + " must be a valid grade!");
            }
        }while(!done);

        aveGrade = totalGrade / numGrade;

        System.out.println("Number of grades is: " + numGrade);
        System.out.println("The total of the grade is: " + totalGrade);
        System.out.println("The average is: " + aveGrade);


    }
}