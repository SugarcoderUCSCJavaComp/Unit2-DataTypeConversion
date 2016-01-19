/**
 * Created by Sugarcoder on 1/14/2016.
 */

public class DataTypeConversion {

    public static void main(String[] args) {
        byte code;
        int row = 157;
        double bankAccount = 323.152;

        System.out.println("Narrowing conversion from int to byte");
        code = (byte) row;    // casting

        System.out.println("row: " + row + " code: " + code);

        System.out.println("Converting double to int");
        row = (int) bankAccount;
        System.out.println("row: " + row);

        code = (byte) bankAccount;
        System.out.println("bank accont: " + bankAccount + " code: " + code);

        process("Amy", 1,3,5,2,8,6,7,9);

    }


    static void process(String name, int...args) {      // ... = pass in the next few integers
        System.out.println("# of args: " + args.length);     // find out how many numbers are in the array
    }
}

