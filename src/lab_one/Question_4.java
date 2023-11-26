package lab_one;

public class Question_4 {
    public boolean isEven(int i){
        int number = (byte)i ;
        if ((number & 1)==0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Question_4  N = new Question_4();
        System.out.println(N.isEven(3));
    }
}
