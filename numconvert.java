import java.util.Scanner;
import java.util.Collections;
import java.lang.Exception;

class ConvertNum {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The hard limit is base 36. You run into weird ascii territory beyond that");
	int from = ConvertNum.getInt(scan, "Convert from base: ");
        int to=ConvertNum.getInt(scan, "Convert to base: ");
        int decequiv=ConvertNum.convertToDec(scan, "Number to convert: ", from, to);
        String realequiv="";
        while (decequiv != 0) {
            if (decequiv%to < 10) {
                realequiv = Integer.toString(decequiv%to) + realequiv;
            } else {
                char tempthing = (char)(decequiv%to + 87);
                realequiv = tempthing + realequiv;
            }
            decequiv /= to;
        }
        System.out.println(realequiv);
    }

    static int getInt (Scanner scan, String msg) {
	int genericInteger=0;
	int except=1;
	while (except == 1) {
	    try {
		System.out.print(msg);
		genericInteger=Integer.parseInt(scan.next());
		except=0;
	    } catch (Exception e) { 
		// LOL no need to catch it.
	    }
	}
	return genericInteger;
    }

    static int convertToDec (Scanner scan, String msg, int from, int to) {
        int decequiv=0;
        System.out.print(msg);
        String conv=scan.next().toLowerCase();
        String[] splitconv=conv.split("");
        int[] revconv = new int[splitconv.length-1];
        int j=0;
        for (int i=splitconv.length-1;0<i;i--) {
            int k=0;
            try {
                k = Integer.parseInt(splitconv[i]);
            } catch (Exception e) {
                k = (int)(splitconv[i].charAt(0)) - 87;
            }
            revconv[j] = k;
            j++;
        }
        for (int i=0;i<revconv.length;i++) {
            decequiv = decequiv + revconv[i]*(int)Math.pow(from,i);
        }
        return decequiv;
    }
}