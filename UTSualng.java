/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsualng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UTSualng {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        String Username, inputusername ;
        String Password, inputpassword;
        ArrayList<Listuang> Matauang = new ArrayList<>();
        Scanner pilihObj = new Scanner(System.in);
        
        Username = "123";
        Password = "123";
        
        do{
           System.out.println("*****LOGIN******");
           Scanner inputlogin = new Scanner(System.in);
           System.out.println("Masukkan Username : ");
           inputusername = inputlogin.nextLine();
           
           System.out.println("Masukkan Password : ");
           inputpassword = inputlogin.nextLine();
        
        }while (!inputusername.equals(Username) && !inputpassword.equals(Password));
        
        do{
            System.out.println("===============================");
            System.out.println("      Dua Kertas      ");
            System.out.println("===============================");
            System.out.println("1. Pendataan Nilai Tukar Mata Uang");
            System.out.println("2. Pendataan Transaksi Penukaran");
            System.out.println("3. Menampilakn data transaksi penukaran");
            System.out.println("4. Logout");
            System.out.println("===============================");
            System.out.println("Pilihan : ");
            pilih = pilihObj.nextInt();
           switch (pilih) {
                case 1:
                    listmatauang(Matauang);
                    break;
                case 2:
                    transaksi(Matauang);
                    break;
                case 3 :
                    tampil(Matauang);
            }
        
        }while (pilih !=4);
    }
    
    private static void listmatauang( ArrayList<Listuang> Matauang)
     {
          String nama,pilih;
          int jumlahuang,jumlahtukar,beli;
          
          
          List<JenisUang> mu = new ArrayList<>();
          
          Scanner add = new Scanner(System.in);
          
        do{
       
        System.out.print("Masukan Nama mata uang   : ");
        nama = add.nextLine();
        System.out.print("Masukan jumlah harga jual: ");
        jumlahtukar = add.nextInt(); 
        System.out.print("Masukan jumlah harga beli: ");
        beli = add.nextInt(); 
        
        jumlahuang = add.nextInt();
        add.nextLine(); 
        
        System.out.println(nama);
        System.out.println(jumlahtukar);
        System.out.println(beli);
        if(jumlahuang > 5){
            pilih = "no";
        }else{
            mu.add(new JenisUang(jumlahuang));//masih error disini----sudah benar!!
            System.out.println("Apakah ada Matauang lain Lain? (yes/no)");
            pilih = add.nextLine();
        }
        
       } while (pilih.equals("yes"));
        Matauang.add(new Listuang(nama,jumlahtukar,beli,mu));
     }
     private static void transaksi( ArrayList<Listuang> Matauang)
     {
        String nama,pilih;
        Scanner show = new Scanner(System.in);
        int jenismatauang,uang,jumlahtukar=0,beli;
        List<JenisUang> mu = new ArrayList<>();
        
        
        Scanner add = new Scanner(System.in);
  
        int jumlahuang,total;
        int i = 0 ;
      
        do{
       
        System.out.print("Masukan Nama : ");
               nama = add.nextLine();
               System.out.print("Masukan Nomor telpon : ");
               nama = add.nextLine();
               System.out.print("Masukan Matauang : ");
               nama = add.nextLine();
               System.out.print("Masukan jumlahh  : "+Matauang.get(i).jumlahtukar);
               nama = add.nextLine();
               System.out.print("Jumlah Dapat : "+Integer.sum(jumlahtukar, i));
               jumlahuang = add.nextInt();
               add.nextLine();
 
        if(jumlahuang > 5){
            pilih = "no";
        }else{
            System.out.println("Apakah ada Transaksi lain? (yes/no)");
            pilih = add.nextLine();
        }
        
       } while (pilih.equals("yes"));
  
     }
    private static void tampil( ArrayList<Listuang> Matauang)
     {
        String nama, Namatauang, jumlahtukar, uangdapat, beli,pilih;
        Scanner show = new Scanner(System.in);
        transaksi (Matauang);
        int jenismatauang,uang;
        uang = show.nextInt()-1;
        Listuang m = Matauang.get(uang);
        System.out.print("Tanggal: ");
        System.out.print("Mata uang krus jual : ");
        
        System.out.print("jumlah kurs jual; : "+m.jumlahtukar);
        
        System.out.print("mata uang kurs beli : "+m.nama);
        
        System.out.print("jumlah kurs beli : "+m.beli);
        
     }
}
