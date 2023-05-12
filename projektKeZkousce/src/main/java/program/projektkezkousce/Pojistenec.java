/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.projektkezkousce;

import java.util.Objects;

/**
 *
 * @author novos
 */
public class Pojistenec  {
    
    
    private int vek;
    private int telCislo;
    private String jmeno;
    private String prijmeni;
    
   
    
    
    public Pojistenec(String jmeno,String prijmeni,int vek, int telCislo){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telCislo = telCislo;
        this.vek = vek;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getTelCislo() {
        return telCislo;
    }

    public void setTelCislo(int telCislo) {
        this.telCislo = telCislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    
    
    
    @Override
    public String toString(){
    return jmeno + "      " + prijmeni + "     " + vek + "      " + telCislo ;
    }
       
    @Override
    public boolean equals(Object jinyPojistenec){
        if (jinyPojistenec == null){
            return false;
        }
        if (jinyPojistenec.getClass() != this.getClass()){
            return false;
        }
        if (this.jmeno == null || this.prijmeni == null){
            return false;
        }
        
        return ((Pojistenec)jinyPojistenec).jmeno.equals(this.jmeno) && ((Pojistenec)jinyPojistenec).prijmeni.equals(this.prijmeni);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.jmeno);
        hash = 97 * hash + Objects.hashCode(this.prijmeni);
        return hash;
    }
    
}
