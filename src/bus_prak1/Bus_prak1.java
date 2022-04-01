/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus_prak1;

/**
 *
 * @author SENJU
 */
public class Bus_prak1 {
    private double counter,penumpang,maxpenumpang;
 
 // konstruktor
 public Bus_prak1(int maxpenumpang){
 this.maxpenumpang=maxpenumpang;
 penumpang = 0;
 }
 
 //method mutator
 public void pluspenumpang(int penumpang){
 double temp;
 temp=this.penumpang+penumpang;
 if (temp>=maxpenumpang){
 System.out.println("Overload penumpang");
 }
 else {
 this.penumpang=temp;
 }
 }
 
 public void getaverage(){
     counter = penumpang/maxpenumpang;
     System.out.println("Rata rata = "+counter);
 }
 
 public void getPassword(int password){
 if (password==90){
 System.out.println("password benar");
 }
 else{
 System.out.println("pass salah");
 }
 }
 public void cetak(){
 System.out.println("Penumpang sekarang = "+penumpang);
 System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
 }
}

