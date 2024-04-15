import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("1. Hiện thị hình chữ nhật?");
        System.out.println("2. Hiển thị hình tam giác vuông?");
        System.out.println("3. Hiển thị tam giác cân?");
        System.out.println("4. Thoát.");
        System.out.println("Mời bạn chọn.");

        Scanner sc = new Scanner(System.in);
        
       int menu = sc.nextInt();
        
        switch (menu) {
            case 1:
                for (int i = 0; i < 4; i++){
                    for(int j = 0; j < 10; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i = 0; i < 5; i++){
                    for(int j = 0; j <= i; j++){
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <=7 ; i++){
                    for(int j = i; j < 7; j++){
                        System.out.print(" ");
                    }
                    for(int k = 1; k <= 2*i-1; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.exit(4);
        }
    }
}

