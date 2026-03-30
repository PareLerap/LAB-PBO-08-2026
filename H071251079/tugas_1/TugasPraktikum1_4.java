import java.util.Scanner;

public class TugasPraktikum1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();
        System.out.println(faktorialkan(angka));

        input.close();
    }   

    public static int faktorialkan(int angka) {
        if (angka == 0) {
            return 1;
        } else {
            return angka * faktorialkan(angka - 1);
        }
    }
}
