import java.util.Scanner;

/**
 * Created by Sugarcoder on 1/19/2016.
 */
public class Reverse {
    public static void main(String[] args) {
        // String test = "I am Bob";

//        if(args.length != 1) {
//            System.out.println("Please enter a string");
//            System.exit(-1);
//        }
        // String test = args[0];

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please pass in a string");
        String test = scanner.nextLine();


        String [] tokens = test.split(" ");

        for(int i = tokens.length-1; i>=0; i--) {
            System.out.print(tokens[i] + " ");
        }


    }



}
