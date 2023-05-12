/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.projektkezkousce;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author novos
 */
public class ProjektKeZkousce {
    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in,"windows-1250");
    ArrayList<Pojistenec> pojistenciList = new ArrayList<>();
     SpravaPojistenych spravaPojistenych = new SpravaPojistenych();

    boolean exit = false;
    while(!exit){
        System.out.println("---------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("---------------------");
        System.out.println();
        System.out.println("vyberte si akci:");
        
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
        System.out.println();   
         
      
        int volba; 
        volba = Integer.parseInt( sc.nextLine());
        
      
        switch (volba){
            case 1:
                Pojistenec pojistenec = spravaPojistenych.pridatPojistence();
                System.out.println();
                System.out.println("Data byla uložena, pokračujte libovolnou klávesou...");
                if (pojistenciList.indexOf(pojistenec) != -1){
                    System.out.println("Pojištenec již existuje");
                }else{
                    pojistenciList.add(pojistenec);
                }
                 break;
            case 2:
                spravaPojistenych.vypisPojistence(pojistenciList);
                break;
            case 3 :
                spravaPojistenych.VyhledejPojisteneho(pojistenciList);
                break;
            case 4:
                exit = true;
                return;
                
            default:
                break;
        }
    }
        return;
    }
    
    
    
}
