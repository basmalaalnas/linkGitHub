public class Question_5 {
    public int positive (int n){
        int sum =0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;

    }

    public static void main(String[] args) {
        Question_5 a = new Question_5();
        System.out.println(a.positive(3));
    }
}
