public class bai1 {
    public static void main(String[] args) {
        int count = 0; // Đếm số lượng số nguyên tố đã tìm thấy
        int number = 2; // Bắt đầu kiểm tra từ số 2

        System.out.println("20 số nguyên tố đầu tiên là:");
        while (count < 20) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Phương thức kiểm tra xem một số có phải là số nguyên tố hay không
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
