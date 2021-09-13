package Strings;

public class IntegerToRoman {
    public static void main(String[] args) {
          int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
         String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

            int number=19+10;
            String s="";

            for (int i = 0; i < values.length; i++) {
                while (number >= values[i]) {
                    number -= values[i];
                    s+=(romanLiterals[i]);
                }
            }
            System.out.println(s);
        }
    }

