import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        double totalInterest = 0;

        System.out.println("Nhập số tiền cho vay : ");
        money = scanner.nextDouble();

        System.out.println("Nhập số tháng vay : ");
        month = scanner.nextInt();

        System.out.println("Nhập lãi suất vay : ");
        interestRate = scanner.nextDouble();

        for (int i = 0; i < month; i++) {
            totalInterest += money * ((interestRate / 100) / 12) * month;
        }

        System.out.println("Tổng tiền lãi = " + totalInterest);
    }

}
