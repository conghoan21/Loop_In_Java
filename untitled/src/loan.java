import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        // Khai báo 3 biến
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        // Tạo đối tượng input thuộc lớp Scanner
        Scanner input = new Scanner(System.in);
        // Nhập số tiền gửi
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        // Nhập số tháng gửi
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        // Nhập lãi xuất
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = input.nextDouble();
        // Tính lãi xuất nhận được
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset += money * (interset_rate / 100) / 12 * month;
            // In ra lãi xuất
            System.out.println("Total of interset: " + total_interset);
        }
    }
}
