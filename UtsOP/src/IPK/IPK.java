/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IPK;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class IPK {
    public static void main(String[]args){
   
        Scanner scanner = new Scanner (System.in);
        
        System.out.print ("Nama : ");
        String nama = scanner.next();
        System.out.print ("Semester : ");
        String semester = scanner.next();
        System.out.print ("Jurusan : ");
        String jurusan = scanner.next();
        System.out.print ("Nilai OOP : ");
        int nilaioop = scanner.nextInt();
        System.out.print ("Nilai Basis Data : ");
        int nilaibd = scanner.nextInt();
        System.out.print ("Nilai Jaringan Komputer : ");
        int nilaijk= scanner.nextByte();
        
        int ip, totalnilaimk;
        totalnilaimk = nilaioop + nilaibd + nilaijk;
        ip = totalnilaimk / 3;
        
        System.out.println ("=============================================");
        System.out.println ("Nama : " + nama);
        System.out.println  ("Semester : " + semester);
        System.out.println  ("Jurusan : " + jurusan);
        System.out.println  ("Nilai OOP : " + nilaioop);
        System.out.println  ("Nilai Basis Data : " + nilaibd);
        System.out.println  ("Nilai Jaringan Komputer : " + nilaijk);
        System.out.println  ("Total Nilai Mata Kuliah : " + totalnilaimk);
        System.out.println  ("Indeks Prstasi : " + ip);
        
        String predikat;
        if (ip > 81 && ip < 100){
            predikat = "B";
        }
        else if (ip > 61 &&  ip < 80){
             predikat = "B";
        }                  
                
        else{
              predikat = "C";
        }
        System.out.println ("PREDIKAT.ANDA : " + predikat);
        
    }
    
    }

