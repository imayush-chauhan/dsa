package Strings;

public class reverse {

    static void reverse(char[] s){

        int k = s.length;

        for (int i = 0; i < k/2; i++) {
            char t = s[i];
            s[i] = s[k - 1 - i];
            s[k - 1 - i] = t;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    public static void main(String[] args) {

        char[] s = {'e','l','l','o','w'};

        reverse(s);


    }
}
