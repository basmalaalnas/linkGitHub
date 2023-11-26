package lab_one;

import java.util.Scanner;

public class Question_1 {

    public void inpoutAllBaseTypes (){

        Scanner x = new Scanner(System.in);
        System.out.println("enter name of bank: ");
        x.nextLine();
        System.out.println("enter ID of employee: ");
        x.nextInt();
        System.out.println("enter creidt card of employee: ");
        x.nextDouble();
        System.out.println("enter salary of employee: ");
        x.nextFloat();
        System.out.println("enter short number : ");
        x.nextShort();
        System.out.println("enter long number : ");
        x.nextLong();
        System.out.println(" Are you present ? ");
        x.nextBoolean();
        System.out.println("enter byte number : ");
        x.nextByte();


    }
    public static void main(String[] args) {
       Question_1 x = new Question_1();
       x.inpoutAllBaseTypes();
    }
}
