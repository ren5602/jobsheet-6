import java.util.Scanner;
public class Pemilihan2Percobaan119v2 {
    public static void main(String[] args) {
    Scanner input19 = new Scanner(System.in);
    System.out.print("Masukkan Tahun : ");
    int tahun = input19.nextInt();
    if ((tahun % 4) == 0){
        if ((tahun % 100) ==0){
                if ((tahun % 400) ==0){
                        System.out.println("Tahun Kabisat");
                        }else {
                                System.out.println("bukan Tahun Kabisat");
                        } 
                        }else {
                                System.out.println("tahun Kabisat");
                        }
                        }else {
                                System.out.println("bukan Tahun Kabisat");
                        }
                }
        }

