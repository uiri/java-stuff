import java.util.Scanner;
import java.util.Collections;

class ConvertNum {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Convert from base: ");
        int from=scan.nextInt();
        System.out.print("Convert to base: ");
        int to=scan.nextInt();
        System.out.print("Number to convert: ");
        String conv=scan.next();
        //        Pattern splitpatt = Pattern.compile(".");
        String[] splitconv=conv.split("");
        System.out.print(Integer.toString(from) + "," + Integer.toString(to) + ",");
        String[] revconv = new String[splitconv.length-1];
        int j=0;
        for (int i=splitconv.length-1;0<i;i--) {
            revconv[j] = splitconv[i];
            j++;
        }
        int decequiv=0;
        String realequiv="";
        for (int i=0;i<revconv.length;i++) {
            decequiv = decequiv + Integer.parseInt(revconv[i])*(int)Math.pow(from,i);
        }
        while (decequiv != 0) {
            realequiv = Integer.toString(decequiv%to) + realequiv;
            decequiv /= to;
        }
        System.out.println(realequiv);
    }
}