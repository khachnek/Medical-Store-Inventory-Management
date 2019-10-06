/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author garvit
 */
public class CartList {
    String MedName,exp,batchno;
    int Quantity,wholesale_rate,MedPrice,gst,sgst;
    
    public CartList(String MedName,int Quantity,int MedPrice){
    this.MedName = MedName; 
    this.Quantity=Quantity;
    this.MedPrice=MedPrice;
    
   
    }
    
    public String getName(){
       return MedName;
    }
    public int getQuantity(){
       return Quantity;
    }
    public int getMRP(){
       return MedPrice;
    }
   
}
