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

    }
}

