/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectenkapsulasi.pkg4c;
import javax.swing.JOptionPane;
/**
 *
 * @author K E L O M P O K  4
 */
public class SewaBukuObj {
    public static void main(String[] args){
        SewaBukuEnkapsulasi b = new SewaBukuEnkapsulasi();
        Object[] options1 = {"Meminjam",
                 "Mengembalikan",
                 "Keluar"};

        int pilihan = JOptionPane.showOptionDialog(null,"Selamat Datang di Perpustakaan Kutu Buku !!","Perpustakaan Kutu Buku",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options1,null);
           if( pilihan ==JOptionPane.YES_OPTION){
               b.setNama();
               b.setKode();
               b.setStatus();
               
               JOptionPane.showMessageDialog(null,"Data Peminjaman Buku : \nNama : "+b.getNama()+"\n"+b.getKode()+"\nTanggal : 27 Oktober 2022\nStatus : "+b.getStatus()+"\nBatas Waktu Peminjaman Buku adalah 2 minggu","Perpustakaan Kutu Buku",JOptionPane.INFORMATION_MESSAGE);
               
           }else if (pilihan == JOptionPane.NO_OPTION){
               b.setNama();
               b.setKode();
               b.setTgl();
               b.setBulan();
               b.setTahun();
               b.setStatus();
               b.setDenda();
               JOptionPane.showMessageDialog(null,"Data Peminjaman Buku : \n Nama : "+b.getNama()+"\n"+b.getKode()+"\nTanggal :"+b.getTgl()+" "+b.getBln()+" "+b.getTahun()+"\nStatus : "+b.getStatus()+"\nDenda :"+b.getDenda(),"Perpustakaan Kutu Buku",JOptionPane.INFORMATION_MESSAGE);
           }
        }
    }

