/**
 *
 * @author Rifki Maulana
 */

public class Bank {
    public static void main (String args []) {
        Bank saldo = new Bank(100000);
       
        saldo.getSaldo();
        saldo.simpanUang(50000);
        saldo.ambilUang(1500000);
    }


    int Mysaldo;
    int total;
    Bank(int saldo) {
        Mysaldo = saldo;
    }
    
    void getSaldo(){
        System.out.println("Selamat datang di BANK SAYA");
        System.out.println("Saldo saat ini : IDR. " + Mysaldo);
    }
    
    void simpanUang(int simpan) {
        total = simpan + Mysaldo;
        System.out.println("Simpan uang : " + simpan);
        System.out.println("Saldo saat ini : IDR. " + total);
        System.out.println("==============================");
    }
    
    void ambilUang(int ambil) {
        if (ambil < Mysaldo) {
            Mysaldo -= ambil;
            System.out.println("Ambil uang : " + ambil);
            System.out.println("Saldo saat ini : "+"IDR." + Mysaldo);
            System.out.println("==========================");
        } else {
            System.out.println("Anda tidak dapat mengambil uang karena saldo anda kurang");
        }
    }
}
