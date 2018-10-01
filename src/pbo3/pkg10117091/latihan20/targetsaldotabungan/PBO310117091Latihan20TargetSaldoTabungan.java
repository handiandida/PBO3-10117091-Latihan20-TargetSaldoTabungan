/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117091.latihan20.targetsaldotabungan;

/**
 *
 * @author Lenovo
 * Nama         : Dida Handian
 * Kelas        : IF-3 
 * Nim          : 10117091 
 * Deskripsi    : Program ini dapat menhitung lama tabungan sampai mencapai
 * saldo yang di targetkan
 */
public class PBO310117091Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int saldoAwal;
        int bunga;
        int jbunga;
        int saldoTarget;

        saldoAwal = 3500000;
        bunga = 8;
        saldoTarget = 6000000;
        
        i=1;
        while (saldoAwal <= saldoTarget) {
            //rumus 
            jbunga = saldoAwal*bunga/100;
            saldoAwal += jbunga;

            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    }
    
}
