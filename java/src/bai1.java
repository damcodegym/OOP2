public class bai1 {
    public static void main(String[] args) {
        int menu = 0;
        int main = 2;

        System.out.println("20 số nguyên tố đầu tiên là:");
        while (menu< 20) {
            if (isPrime(main)) {
                System.out.print(main + " ");

                menu++;
            }
            main++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
