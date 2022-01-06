import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String a = scanner.nextLine();
        System.out.print("Nhập vào ký tự cần đếm: ");
        char b = scanner.next().charAt(0);

        int count = checkString(a, b);
        System.out.println("Số lần xuất hiện của kí tự " + b + " trong chuỗi " + a + " là: " + count);
    }

    public static int checkString(String a, char b) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b) {
                count++;
            }
        }
        return count;
    }
}
