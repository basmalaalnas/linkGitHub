import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*----------------حل السؤال الاول---------------*/
        System.out.println("Hello World Program");
        System.out.println("---------------------------------------------------------------------------");


        /*----------------حل السؤال الثاني---------------*/
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);}
        System.out.println("---------------------------------------------------------------------------");


        /*----------------حل السؤال الثالث---------------*/
        int Array_print[] = {1,2,3,4,5,6,7,8,9,10} ;
        for (int i = 0; i < Array_print.length; i++) {
            System.out.println(Array_print[i]);}
        System.out.println("---------------------------------------------------------------------------");


        /*----------------حل السؤال الرابع---------------*/
        int[] Array_intput = new int[5] ;
        Scanner ARRAY = new Scanner(System.in) ;
        System.out.println("please. enter number to Array ");
        for (int i = 0; i < Array_intput.length; i++) {
            int A = ARRAY.nextInt() ;
            Array_intput[i] = A ;       }
        for (int Numbers:Array_intput){
            System.out.println(Numbers);}
        System.out.println("---------------------------------------------------------------------------");}




        /*----------------حل السؤال الخامس---------------*/
    private static int[] Array_print = {1,2,3,4,5,6,7,8,9,10} ;
    public static void printNumber(){
        for (int ARRAY : Array_print){
            System.out.println(ARRAY);}}







}
