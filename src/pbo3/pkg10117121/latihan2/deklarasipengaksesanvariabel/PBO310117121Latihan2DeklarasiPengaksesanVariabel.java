/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan2.deklarasipengaksesanvariabel;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program ini berisi program untuk menampilkan deklarasi 
 * & pengaksesan variabel
 */
public class PBO310117121Latihan2DeklarasiPengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // Menampilkan Hasil
        System.out.println();
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi variabel PHI = " + PHI);
        System.out.println("Isi variabel Logika = " + nilaiLogika);
        System.out.println("Isi variabel Karakter = " + nilaiKarakter);
    }
    
}
