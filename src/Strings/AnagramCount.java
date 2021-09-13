package Strings;

import java.util.Arrays;

public class AnagramCount {
    public static void main(String[] args) {
//        String[] array = {"abc","def","dgf"};
        String[] array={"cat","dog","tac","god","act"};
        String[] sort = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            char[] temp = array[i].toCharArray();
            for (int k = 0; k < temp.length; k++) {
                for (int j = 0; j < temp.length - 1; j++) {
                    if (temp[j] > temp[j + 1]) {
                        char temp1 = temp[j];
                        temp[j] = temp[j + 1];
                        temp[j + 1] = temp1;
                    }
                }
            }
            sort[i] = new String(temp);
        }
        System.out.println(Arrays.toString(sort));

        for (int i = 0; i < sort.length; i++) {
            if (!(array[i].equals("000"))) {
                for (int k = 0; k < sort.length; k++) {
                    if (sort[i].equals(sort[k])) {
                        System.out.print(array[k] + " ");
                        array[k] = "000";
                    }
                }
                System.out.println();
            }
        }
    }
}