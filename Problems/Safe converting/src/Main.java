import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        if(val == null) {
            return 0;
        } else if(val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if(val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            int i = val.intValue();
            return i;
        }

        Long val = new Long("4321");
        Long val = 4321L;
        Long val = Long.parseLong("4321");
        Long val = new Long(4321);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}