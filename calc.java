import java.io.*;

class CalcApp {
    public static void main(String[] args) {
        int num1=0; int num2=0; int num3=0;
        String line1=null; String line2=null;
 
        System.out.print("Enter a number: ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            line1 = is.readLine();
            num1 = Integer.parseInt(line1);
        } catch (NumberFormatException ex) {
            System.err.println("Not a valid number: " + line1);
        } catch (IOException e) {
            System.err.println("Unexpected IO ERROR: " + e);
        }
        System.out.print("Enter a second number: ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            line2 = is.readLine();
            num2 = Integer.parseInt(line2);
        } catch (NumberFormatException ex) {
            System.err.println("Not a valid number: " + line2);
        } catch (IOException e) {
            System.err.println("Unexpected IO ERROR: " + e);
        }
        num3 = num2 + num1;
        System.out.print(num3 + "\n");
    }
}