import java.util.Scanner;

public class TugasPraktikum1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            int angka = input.nextInt();
            int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
            };
            System.out.println(cariAngkaArray2D(angka, nums));
        } catch (Exception e) {
            System.err.println("Pesan Error: " + e);
        }

        input.close();
    }

    public static String cariAngkaArray2D(int angka, int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == angka) {
                    return "Found " + angka + " at [" + i + "][" + j + "]";
                } 
            }
        }
        return "Not Found " + angka;
    }
}
