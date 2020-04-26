package perulangan;
import java.util.Scanner;

public class perulangan {
    public static void main(String[] args){
        double bunga, waktu;
        double saldo, saldo_bunga;
        String jawab = " ";
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Masukan Saldo    = ");
            saldo = scanner.nextDouble();
            System.out.print("Masukan Bunga(%) = ");
            bunga = scanner.nextDouble();
            System.out.print("Masukan Waktu    = ");
            waktu = scanner.nextDouble();

            for(int i=1 ; i<=waktu ; i++){
                saldo_bunga = ((bunga/100)*saldo)+saldo;
                saldo = saldo_bunga;
                System.out.println("Saldo Bunga Ke "+ i + "= Rp. "+saldo);
            }
            System.out.print("Hitung Lagi [Y/T] = ");
            jawab = scanner.next();
        }while(jawab.equalsIgnoreCase("Y"));
    }
}
