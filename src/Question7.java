/*----------------حل السؤال السابع---------------*/
public class Question7 {

        private String name ;

    public Question7(String name) {
        this.name = name;
    }

        @Override
        public String toString() {
        return "Lab_1.Q7{" +
                "name='" + name + '\'' +
                '}';
    }

        public static void main(String[] args) {
            Question7 stu1 = new Question7("Ayh");
            Question7 stu2 =new Question7("Basmala");
            Question7[] student =new Question7[2];
            student[0]=stu1;
            student[1]=stu2;
            for (int i = 0; i < student.length; i++) {
                    System.out.println(student[i]);

        }

    }

}
