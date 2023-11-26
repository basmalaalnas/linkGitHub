package lab_one;

public class Question_6 {
    public int positive_odd (int n){
        int sum =0;
        for (int i = 0; i <= n; i++) {
            int x =i;
            if (x%2 == 1){
                sum += x;}
        }
        return sum;

    }

    public static void main(String[] args) {
        Question_6 a = new Question_6();
        System.out.println(a.positive_odd(3));
    }
}
