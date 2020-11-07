/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class TebakAngkaP2 {
    Random rnd = new Random ();
    Scanner Scn = new Scanner(System.in);
    int Jawaban = rnd.nextInt(100);
    int tebakan;
    int Skor = 100;
    int percobaan = 0;
    boolean jawab = false;
    
    void Tebak2() {
        while (jawab == false){
        System.out.println("Hai.. CobaTebak angka yang saya pilih dimulai dari angka 0 - 100 ");
        System.out.print("Tebakan Anda :");
        tebakan = Scn.nextInt();
        Scn.nextLine();
        
        if (Skor == 0){
            System.out.println("----------------------------------------------------------------");
            System.out.println("| Maaf kamu sudah tidak memiliki kesempatan untuk menjawab x_x |");
            System.out.println("----------------------------------------------------------------");
            break;
        }
        if (tebakan > Jawaban){
            System.out.println("Maaf Tebakan kamu terlalu Besar, ayo tebak lagi !!!");
            percobaan ++;
            Skor -=2;
        }
        else if (tebakan < Jawaban){
            System.out.println("Maaf Tebakan kamu terlalu kecil, ayo tebak lagi !!!");
            percobaan ++;
            Skor -=2;
        }
        else if (tebakan == Jawaban) {
            System.out.println("|---------------------------------|");
            System.out.println("Yeee... Tebakanmu Benar yaitu " +Jawaban );
            System.out.println("|---------------------------------|");
            jawab = true;
        }
        }
        System.out.println("Kamu berhasil menjawab pada percobaan ke " +percobaan);
        System.out.println("Skor Kamu Sekarang adalah : " +Skor);
        
        if (Skor != 0){
            if (percobaan <= 5){
                Skor += 50;
                System.out.println("Selamat kamu mendapat tambahan point 50");
                System.out.println("Karena kamu berhasil menebak angka kurang dari 5 kali percobaan ");
                System.out.println("Total Skor kamu sekarang : " +Skor);
            }
        }
    }
}
