import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String one = scanner.nextLine().replaceAll(" ", "").trim();
        String two = scanner.nextLine().replaceAll(" ", "").trim();

        System.out.println(one.equalsIgnoreCase(two));
    }
}