/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectenkapsulasi.pkg4c;
import javax.swing.JOptionPane;

/**
 *
 * @author K E L O M P O K  4
 */
public class SewaBukuEnkapsulasi {
    private String nama;
    private String kode;
    private int tgl;
    private int jml;
    private String status;
    private int Bulan;
    private int Tahun;
    private String bln;
    private int denda;

    public int getDenda() {
        return denda;
    }

    public void setDenda() {
        int blan = getBulan();
        int tagl = getTgl();
        int a = 27;
        int b = 10;
        int c = 10-blan;
        int d=30-tagl;
        int e = 0;
        
        
        if (c==0){
            if (a-tagl<=14){
                e = 0;
            }else if(a-tagl>=14){
                e = (a-tagl)*1000;
            }
        }else if(c==1){
            e=(d+a-14)*1000;
        }else{
            int bulan = (c-1)*30;
            e=(bulan+d+a-14)*1000;
        }
        this.denda = e;
    }
    

    public String getBln() {
        return bln;
    }

    public void setBln() {
        String b [][]={{"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"}};
        this.bln = b[0][getBulan()-1];
    }

    public int getBulan() {
        return Bulan;
    }

    public void setBulan() {
        this.Bulan = Integer.parseInt(JOptionPane.showInputDialog(null, "Bulan Ke - ","Perpustakaan Kutu Buku",JOptionPane.INFORMATION_MESSAGE));
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun() {
        this.Tahun = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Tahun Meminjam ","Perpustakaan Kutu Buku",JOptionPane.INFORMATION_MESSAGE));
    }

    public String getNama() {
        return nama;
    }

    public void setNama() {
        this.nama = JOptionPane.showInputDialog(null, "Masukkan Nama Peminjam","Perpustakaan Kutu Buku",JOptionPane.INFORMATION_MESSAGE);
    }

    public String getKode() {
        return kode;
    }

    public void setKode() {
        String a = null;
        int code =Integer.parseInt(JOptionPane.showInputDialog(null, "Judul Buku : \n1.Bulan by Tere Liye\n2.Harry Potter & Batu Bertuah by J.K Rowling\n3.TeenLit : Pintu Harmonika by Clar Ng, Icha Rahmanti\n4.Does My Head Look Big in This? by Randa Abdel-Fattah\n5.Dua Garis Biru by Lucia P & Gina S\n6.Loving the Wounded Soul by Regis Machdy\n7.The Alpha Girls Guide by Henry M\n8.Laskar Pelangi by Andrea Hirata\n9.Cinta Brontosaurus by Raditya Dika\n10.Sepatu Dahlan by Khrisna Pabichara","Perpustakaan Kutu Buku",JOptionPane.INFORMATION_MESSAGE));
        switch (code){
            case 1:
                a = "Judul Buku : Bulan \nPengarang : Tere Liye\nKode : 666.69 ";
                break;
            case 2 :
                a = "Judul Buku : Harry Potter dan Batu Bertuah \nPengarang : J.K Rowling\nKode : 888.12 ";
                break;
            case 3 :
                a = "Judul Buku : Pintu Harmonika \nPengarang : Clar Ng, Icha Rahmanti\nKode : 777.34 ";
                break;
            case 4 :
                a = "Judul Buku : Does My Head Look Big in This? \nPengarang : Randa Abdel-Fattah\nKode : 888.99 ";
                break;
            case 5 :
                a = "Judul Buku : Dua Garis Biru \nPengarang :Lucia P & Gina \nKode : 232.62 ";
                break;
            case 6 :
                a = "Judul Buku : Loving the Wounded Soul \nPengarang :  Regis Machdy \nKode : 555.99 ";
                break;
            case 7 :
                 a = "Judul Buku : The Alpha Girls Guide \nPengarang :  Henry \nKode : 377.00 ";
                break;
            case 8 :
                 a = "Judul Buku : Laskar Pelangi \nPengarang :  Andrea Hirata \nKode : 555.88 ";
                break;
            case 9 :
                 a = "Judul Buku : Cinta Brontosaurus \nPengarang :  Raditya Dika \nKode : 111.69 ";
                break;
            case 10 :
                a = "Judul Buku :  Sepatu Dahlan \nPengarang :  Khrisna Pabichara \nKode : 444.69 ";
                break;
        
        }
        this.kode = a;
    }

    public int getTgl() {
        return tgl;
    }

    public void setTgl() {
        this.tgl = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Tanggal Meminjam (1-31)","Perpustakaan Kutu Buku",JOptionPane.INFORMATION_MESSAGE));
        
    }

    public int getJml() {
        return jml;
    }

    public void setJml() {
        this.jml = jml;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        String status = null;
       int dialogButton = JOptionPane.showConfirmDialog (null, "Apakah peminjam terdaftar sebagai anggota Perpustakaan?","Perpustakaan Kutu Buku",JOptionPane.YES_NO_OPTION);

        if(dialogButton == JOptionPane.YES_OPTION) {
            status = "Terdaftar Sebagai Anggota Perpustakaan Kutu Buku";
        }else{
            status ="Tidak Terdaftar Sebagai Anggota Perpustakaan Kutu Buku";
        }
        this.status = status;
    }
    
}
    

