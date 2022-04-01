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
public class Ujibus {
    public static void main(String[] args) {
 // TODO code application logic here
Bus_prak1 busMini=new Bus_prak1(10);
 busMini.getPassword(40);
 busMini.getPassword(90);
 

 busMini.cetak();
 busMini.getaverage();
        System.out.println("=========");
        
 busMini.pluspenumpang(3);
 busMini.cetak();
 busMini.getaverage();
  System.out.println("=========");
  
 busMini.pluspenumpang(1);
 busMini.cetak();
 busMini.getaverage();
  System.out.println("=========");
  
 busMini.pluspenumpang(1);
 busMini.cetak();
 busMini.getaverage();
  System.out.println("=========");
  
 }
    
}
