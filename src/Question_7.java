public class Question_7 {
    public int positive_square (int n){
        int sum =0;
        for (int i = 0; i <= n; i++) {
            int x =i*i;

                sum += x;
        }
        return sum;

    }

    public static void main(String[] args) {
        Question_7 a = new Question_7();
        System.out.println(a.positive_square(3));
    }

}
