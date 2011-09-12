class FizzBuzz {

    public static void main (String[] args) {
        for (int i=1; i<100; i++) {
            String printstring="";
            if (i%3 != 0 && i%5 != 0) {
                printstring += Integer.toString(i);
            } else {
                if (i%3 == 0) {
                    printstring += "Fizz";
                }
                if (i%5 == 0) {
                    printstring += "Buzz";
                }
            }
            System.out.println(printstring);
        }
    }
}
            