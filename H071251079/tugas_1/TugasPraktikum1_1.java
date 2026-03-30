import java.util.Scanner;

public class TugasPraktikum1_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Judul Film : ");
        String kalimat = s.nextLine();
        String hasil = Kapital(kalimat);
        System.out.print(hasil);

        s.close();
    }

    public static String Kapital(String k) {
        String[] kalimat = k.split(" ");
        String hasilnya = "";
        for (String kata : kalimat) {
            String hurufPertama = kata.substring(0,1).toUpperCase();
            String hurufKedua = kata.substring(1).toLowerCase();
            hasilnya += hurufPertama + hurufKedua + " ";
        }
        return hasilnya;
    }
}

