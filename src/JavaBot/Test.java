package JavaBot;

import java.util.Scanner;

public class Test {
    private static final Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        People[] siswa;
        siswa = new People[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i+1) + " : ");
            siswa[i].name = inp.nextLine();
            System.out.print("Masukkan umur siswa ke-" + (i+1) + " : ");
            siswa[i].age = inp.nextInt();
            System.out.print("Masukkan nilai siswa ke-" + (i+1) + " : ");
            siswa[i].result = inp.nextInt();
        }
        System.out.println("Nama \t Umur \t Nilai ");
        for (People people : siswa) {
            System.out.println(people.name + "\t" + people.age + "\t" + people.result);
        }
    }
}
