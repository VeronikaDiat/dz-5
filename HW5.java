public class HW5 {


    public static void main(String[] args) {
        int first = 5;
        int sec = 5;
        int thr = 7;
        int fourth = 8;

        int a = first + sec;
        int b = thr + fourth;

        if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b greater than a");
        }

        int c = a + 1;
        int d = b - 2;
        System.out.println(c);
        System.out.println(d);

        String ex = (c > d) ? "true" : "false";
        System.out.println("c is greater than d:"+" "+ex);

        String odd  =((c % 2 != 0) || (d % 2 != 0)) ? "true" : "false";
        System.out.println("c or d is odd:"+" "+odd);



    }
    }

