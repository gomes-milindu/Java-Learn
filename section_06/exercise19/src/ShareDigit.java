public class ShareDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        int last1;
        int last2;
        if ((num1 > 10 && num1 < 99) && (num2 > 10 && num2 < 99)) {

            for (int i = 1; i <= 2; i++) {
                do {
                    last1 = num1 % 10;
                    num1 /= 10;
                    System.out.println("Num1 : " + num1);
                } while (num1 != 0);
                //System.out.println("Last1 :" + last1);
                for (int j = 1; j <= 2; j++) {
                    do {
                        last2 = num2 % 10;
                        num2 /= 10;
                        System.out.println("Num2 :" + num2);
                    } while (num2 != 0);
                    //System.out.println("Last 2  :"+  last2);
                    if (last1 == last2) {
                        System.out.println("Equal");

                    } else {

                    }
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
