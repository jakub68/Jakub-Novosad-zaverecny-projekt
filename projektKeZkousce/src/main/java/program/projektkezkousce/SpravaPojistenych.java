/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.projektkezkousce;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author novos
 */
public class SpravaPojistenych {
Scanner sc = new Scanner(System.in,"windows-1250");
     
        
        
    public Pojistenec pridatPojistence(){
          
             
         String jmeno;
         String prijmeni;
         int vek;
         int telCislo;
    
        System.out.println("Zadejte jméno");
        jmeno = sc.nextLine();
        
        System.out.println("Zadejte příjmení");
        prijmeni = sc.nextLine();
        
        System.out.println("Zadejte věk");
        vek = Integer.parseInt(sc.nextLine());
        
        System.out.println("Zadejte telefonní číslo");
        telCislo = Integer.parseInt(sc.nextLine());
        
        return new Pojistenec( jmeno, prijmeni, vek,  telCislo);
        }
    
        
    
    public void vypisPojistence(ArrayList<Pojistenec> list){
        System.out.println(list.size());
        for(Pojistenec pojistenec : list ){ 
            System.out.println("Pojištenec");
            System.out.println(pojistenec.toString());
        }
    }
    
    
    public void VyhledejPojisteneho(ArrayList<Pojistenec> list){
    
        
         String jmeno;
         String prijmeni;
         int vek;
         int telCislo;
        
        System.out.println("Zadejte jméno:\n");
         jmeno = sc.nextLine();
        System.out.println("Zadejte příjmení: \n");
         prijmeni = sc.nextLine();
         int index = list.indexOf(new Pojistenec (jmeno,prijmeni,0,0));
         if (index >= 0){
             System.out.println(list.get(index));
         } else {
             System.out.println("nenalezeno");
         }
}
}