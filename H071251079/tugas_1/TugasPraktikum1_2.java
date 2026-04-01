import java.util.Scanner;

public class TugasPraktikum1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String tanggal = input.nextLine();
        System.out.println(formatTanggal(tanggal));

        input.close();
    }

    private static String formatTanggal(String tanggal) {
        String[] tanggalArr = tanggal.split("-");
        int hari = Integer.parseInt(tanggalArr[0]);
        String bulan = tanggalArr[1];
        String tahun = tanggalArr[2];

        switch (bulan) {
            case "01":
                bulan = "Januari";
                break;
            case "02":
                bulan = "Februari";
                break;
            case "03":
                bulan = "Maret";
                break;
            case "04":
                bulan = "April";
                break;
            case "05":
                bulan = "Mei";
                break;
            case "06":
                bulan = "Juni";
                break;
            case "07":
                bulan = "Juli";
                break;
            case "08":
                bulan = "Agustus";
                break;
            case "09":
                bulan = "September";
                break;
            case "10":
                bulan = "Oktober";
                break;
            case "11":
                bulan = "November";
                break;
            case "12":
                bulan = "Desember";
                break;
            default:
                break;
        }

        String tahunFormat = Integer.parseInt(tahun) > 26 ? "19" + tahun : "20" + tahun;  

        return hari + " " + bulan + " " + tahunFormat;
    }
}
