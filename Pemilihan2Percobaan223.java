import java.util.Scanner;

public class Pemilihan2Percobaan223{
    public static void main(String[] args){
        Scanner input23 = new Scanner(System.in);

        int s1,s2,s3,totalSudut;

        System.out.print("Masukkan sisi 1: ");
        s1 = input23.nextInt();

        System.out.print("Masukkan sisi 1: ");
        s2 = input23.nextInt();

        System.out.print("Masukkan sisi 1: ");
        s3 = input23.nextInt();

        totalSudut = s1 + s2 + s3;

        if(totalSudut == 180){
            if((s1 == 60) && (s2 == 60) && (s3 == 60))
            System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else
            System.out.println("Segitiga tersebut bukan segitiga sama sisi");
        } else
            System.out.println("Bukan segitiga");
    }
}