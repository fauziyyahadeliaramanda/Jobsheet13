import java.util.Scanner;
    public class Percobaan610 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int p, l, t, L, vol;

                System.out.println("Masukkan panjang");
                p=input.nextInt();
                System.out.println("Masukkan lebar");
                l=input.nextInt();
                System.out.println("Masukkan tinggi");
                t=input.nextInt();

                L=hitungLuas(p, l);
                System.out.println("Luas Persegi panjang adalah " + L);
                
                vol=hitungVoluume(t, p, l);
                System.out.println("Volume balok adalah "+vol);
                }
                static int hitungLuas (int pjg, int lb){
                    int Luas = pjg*lb;
                    return Luas;
                }
                static int hitungVoluume (int tinggi, int a, int b){
                    int volume = hitungLuas(a, b)*tinggi;
                    return volume;
        }
}