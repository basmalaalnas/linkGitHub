package lab_one;

import java.util.ArrayList;
import java.util.Arrays;
public class Question_8 {

        public int Vowels (String x){
            ArrayList<Character> vowel =new ArrayList<>(Arrays.asList('a','o','e','u','i','A','O','E','U','I'));
            int count = 0 ;
            for (int i = 0; i < x.length(); i++) {
                char y = x.charAt(i);
                if (Character.isLetter(y) && vowel.contains(y) ){
                    count++;
                }

            }
            return count;
        }
        public static void main(String[] args) {
            Question_8 a = new Question_8();
            System.out.println(a.Vowels("Basmalah"));

        }

    }






