/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author garvit
 */
class InventoryList {
    String Name,exp,batchno;
    int Quantity,wholesale_rate,MRP,gst,sgst;
    
    public InventoryList(String Name,int Quantity,int MRP,int wholesale_rate,String exp,String batchno,int gst,int sgst){
    this.Name = Name; 
    this.Quantity=Quantity;
    this.MRP=MRP;
    this.wholesale_rate = wholesale_rate;
    this.exp=exp;
    this.batchno= batchno;
    this.gst= gst;
    this.sgst = sgst;
    }
    
    public String getName(){
       return Name;
    }
    public int getQuantity(){
       return Quantity;
    }
    public int getMRP(){
       return MRP;
    }
    public int getwholesale_rate(){
       return wholesale_rate;
    }
    public String getExp(){
       return exp;
    }
    public String getBatchNo(){
       return batchno;
    }
    public int getGST(){
       return gst;
    }
    public int getSGST(){
       return sgst;
    }
    
}
