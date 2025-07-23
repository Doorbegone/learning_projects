import java.util.Scanner;
//import java.lang;
//import java.math;
//import java.net;
//import java.io;

public class ThirdOne {
    String x;
    String y;
    //boolean z;
    double dub;
    Main newObjThing;

    public ThirdOne(String[] args){
        x = args[0];
        y = args[1];
        //z = y.equals(x);
        dub = 0;
        newObjThing = new Main();
    }

    public void thirdcal(String[] args){
        String[] input = new String[2];
        input[0] = args[0];
        input[1] = args[1];
        int len1 = input[0].length();
        int len2 = input[1].length();
        char temp;
        for (int i = 0; i < len1; i++) {
            temp = input[0].charAt(i);
            dub += (int)temp;
        }
        for (int i = 0; i < len2; i++) {
            temp = input[1].charAt(i);
            dub += (int)temp;
        }
        System.out.println("Words evaluated to: " + dub);
        dub = 0;
    }

    public static void main(String[] args) {
        /*
        Scanner newIn = new Scanner(System.in);
        System.out.println("Enter two words. First:");
        String first_word = newIn.nextLine();
        System.out.println("Second Word:");
        String second_word = newIn.nextLine();
        String[] Combined = new String[2];
        Combined[0] = first_word;
        Combined[1] = second_word;
        */
        thirdcal(args);


        

    }
}
