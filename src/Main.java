import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);

        System.out.println("Adinizi daxil edin: ");
        String ad = input.nextLine();

        System.out.println("Bal daxil edin: ");
        int bal = input.nextInt();

        String qiymet = qiymetHesabla(bal);

        System.out.println(ad + ", aldiginiz bal " + qiymet);
    }

    public static String qiymetHesabla(int bal) {
        if (91 <= bal && bal <= 100) {
            return "A qiymeti";
        } else if (81 <= bal && bal <= 90) {
            return "B qiymeti";
        } else if (71 <= bal && bal <= 80) {
            return "C qiymeti";
        } else if (61 <= bal && bal <= 70) {
            return "D qiymeti";
        } else if (51 <= bal && bal <= 60) {
            return "E qiymeti";
        } else if (0 <= bal && bal <= 50) {
            return "F qiymeti";
        } else {
            return "Duzgun bal daxil edin (0-100 araliginda)";
        }
    }
}



