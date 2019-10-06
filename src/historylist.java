/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author garvit
 */
class historylist {
    String DateTime,MedName,customername;
    int MedPrice,Quantity;
    long phone;
    
    public historylist(String DateTime,String MedName,int MedPrice,int Quantity,String customername,long phone){
    this.DateTime = DateTime; 
    this.MedName = MedName;
    this.MedPrice=MedPrice;
    this.Quantity= Quantity;
    this.customername= customername;
    this.phone= phone;

    }
    
    public String getDateTime(){
       return DateTime;
    }
    public String getMedName(){
       return MedName;
    }
    public int getMedPrice(){
       return MedPrice;
    }
    public int getQuantity(){
       return Quantity;
    }
     public String getcustomername(){
       return customername;
    }
     public long getphone(){
       return phone;
    }
    
}
