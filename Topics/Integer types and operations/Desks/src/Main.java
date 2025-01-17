import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        int desk1 = class1 % 2 == 0 ? class1 / 2 : (class1 / 2) + 1;
        int desk2 = class2 % 2 == 0 ? class2 / 2 : (class2 / 2) + 1;
        int desk3 = class3 % 2 == 0 ? class3 / 2 : (class3 / 2) + 1;

        int totalDeskCount = desk1 + desk2 + desk3;
        System.out.println(totalDeskCount);

        scanner.close();
    }
}