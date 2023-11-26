package lab_one;

public class Question_3 {
    public boolean isMultiple (long m,long n){
        if (m % n == 0 && n <= m){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
     Question_3 x =new Question_3();
        System.out.println(x.isMultiple(6,3));
    }
}
