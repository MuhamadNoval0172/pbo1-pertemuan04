package array;

import java.util.Scanner;

public class penerapanArray {
    public static void main(String[] args){
        int jumlah;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Jumlah Data : ");
        jumlah = scanner.nextInt();
        int id[];
        id = new int[jumlah];

        String nama[];
        nama = new String[jumlah];

        int npm[];
        npm = new int[jumlah];

        String[] mataKuliah;
        mataKuliah = new String[jumlah];

        System.out.println("===Input Data===");
        for(int i=0; i<jumlah;i++){
            System.out.println(" ");

            System.out.print("ID " + i + " : ");
            id[i] = scanner.nextInt();

            System.out.print("Nama " + i + " : ");
            nama[i] = scanner.nextLine();
            nama[i] = scanner.nextLine();

            System.out.print("NPM " + i + " : ");
            npm[i] = scanner.nextInt();

            System.out.print("Mata Kuliah " + i + " : ");
            mataKuliah[i] = scanner.nextLine();
            mataKuliah[i] = scanner.nextLine();
        }
        for(int i=0; i<jumlah;i++){
            System.out.println();
            System.out.println("===Data Yang Terinput===");
            System.out.println("ID " + i +"          : "+id[i]);
            System.out.println("Nama " + i +"        : "+nama[i]);
            System.out.println("NPM " + i +"         : "+npm[i]);
            System.out.println("Mata Kuliah " + i +" : "+mataKuliah[i]);
        }

    }
}
