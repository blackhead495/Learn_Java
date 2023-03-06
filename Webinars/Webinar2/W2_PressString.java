

package Webinars.Webinar2;

import java.util.Scanner;

public class W2_PressString {
    public static void main (String[] args) {
        String arr = "aaaabbbcccde";
        char[] ch = arr.toCharArray();
        int count = 1;

        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < arr.length()-1; i++) {
            if (ch[i] == ch[i+1]) {
                count++;
            } else {
                String countString = String.valueOf(count);
                //newText.append(ch[i] + countString);
                count = 1;
            }
        }
        newText.append(ch[ch.length - 1] + String.valueOf(count));
        System.out.println(newText);

    }
}
