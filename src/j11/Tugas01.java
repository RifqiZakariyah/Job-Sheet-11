/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j11;
import java.util.Locale;
public class Tugas01 {
    public static void main(String[] args)
    {
        String identitas = "M. Rifqi Zakariyah / X RPL 3 / No. 20";
        System.out.println("Identitas : " + identitas);
        
        String x = "Operasi";
        System.out.println("Isi Variable x : " + x);
        System.out.println("\"" + x + "\" panjang karakter = " + x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi Variable y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("");
        
        System.out.println("Isi x sama dengan y :" + x.equals(y));
        String z = "Operasi";
        System.out.println("Isis variable z : " + z);
        System.out.println("Isi x sama dengan z (Case Sensitive) :" 
                + x.equals(z));
        
        String r = "Operasi";
        System.out.println("Isis variable z : " + z);
        System.out.println("Isi x sama dengan z (Case Sensitive) :" 
                + x.equals(r));
        System.out.println("Isis variabel r (Not Case Sensitive) : "
                + x.equalsIgnoreCase(r));
        
        System.out.println("");
        
    }
}