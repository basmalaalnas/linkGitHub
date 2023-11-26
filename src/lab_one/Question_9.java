package lab_one;

import java.util.ArrayList;

public class Question_9 {
    public String punctuations (String x){
        ArrayList<Character> punctuation =new ArrayList<>();
        punctuation.add('.');
        punctuation.add(':');
        punctuation.add(';');
        punctuation.add(',');
        punctuation.add('?');
        punctuation.add('!');
        punctuation.add('\'');
        punctuation.add('"');
        punctuation.add('’');
        StringBuilder z = new StringBuilder();

        for (char y : x.toCharArray()) {
            if (!punctuation.contains(y)){
                z.append(y);
            }

        }
        return z.toString();
        }

    public static void main(String[] args) {
        Question_9 A = new Question_9();

        System.out.println(A.punctuations("Let’s try, Mike!"));
    }
    }

