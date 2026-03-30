import java.util.Scanner;

public class TugasPraktikum1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan password: ");
        String password = input.next();

        boolean apakahValid = validasiPw(password);
        if (apakahValid) {
            System.out.println("Password valid");
        } else {
            System.out.println("Password tidak valid");
        }

        input.close();
    }

    public static boolean validasiPw(String password) {
        boolean apakahMinimal8 = false;
        boolean apakahHurufBesar = false;
        boolean apakahHurufKecil = false;
        boolean apakahAngka = false;

        if (password.length() <= 8) {
            apakahMinimal8 = true;
        }

        for (char pw : password.toCharArray()) {
            if (Character.isUpperCase(pw)) apakahHurufBesar = true;
            if (Character.isLowerCase(pw)) apakahHurufKecil = true;
            if (Character.isDigit(pw)) apakahAngka = true;
        }

        if (apakahMinimal8 && apakahHurufBesar && apakahHurufKecil && apakahAngka) {
            return true;
        } else {
            return false;
        }
    }
}
