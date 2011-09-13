import java.util.Scanner;
import java.util.Collections;
import java.lang.Exception;

class ConvertNum {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
	int from = ConvertNum.getInt(scan, "Convert from base: ");
        int to=ConvertNum.getInt(scan, "Convert to base: ");
        System.out.print("Number to convert: ");
        String conv=scan.next();
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

    static int getInt (Scanner scan, String msg) {
	int genericInteger=0;
	int except=1;
	while (except == 1) {
	    try {
		System.out.print(msg);
		genericInteger=Integer.parseInt(scan.next());
		except=0;
	    } catch (Exception e) { 
		//stuff
	    }
	}
	return genericInteger;
    }
}