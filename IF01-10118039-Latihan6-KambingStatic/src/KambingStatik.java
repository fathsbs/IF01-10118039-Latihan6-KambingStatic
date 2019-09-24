/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program yang digunakan untuk pembelajaran variabel  statik  
 */


public class KambingStatik{

    //NAMA-KAMBING SEBAGAI KONSTANTA
    public static final String NAMA_KAMBING = "MIDUN";

    public static void main(String[] args) {
 
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING+" memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }

}
