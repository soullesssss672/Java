public class department extends store {
    //setting value in attributes
    private String Productname;
    private double Markedprice;
    private double Sellingprice;
    private boolean isInsales;
     //constructor for corresponding value
public department(int storeID,String storeName,String location,String openinghours,double totalsales,double totaldiscount,String Productname,double Markedprice)
{
        super(storeID,storeName,location,openinghours);
        super.settotalsales(totalsales);
        super.settotaldiscount(totaldiscount); 
        this.Productname = Productname;
        this.Markedprice = Markedprice;
        this.Sellingprice= 0;
        this.isInsales= true;
}
  //Accessor method 
  public String getProductname(){
      return  this.Productname;
  }
  public double getMarkedprice(){
      return this.Markedprice;
  }
   public double getSellingprice(){
       return this.Sellingprice;
   }
   //using setter method for Markdprice
   public void setMarkedprice(double Markedprice)
   {
       this.Markedprice=Markedprice;
   }
   //
   public void calculatediscountprice(boolean isInsale,double Markedprice)
 {
   double discount=0.0;
    if(Markedprice>=5000){
        discount=0.2;
   }
   else if (Markedprice >=3000 && Markedprice<5000){
       discount=0.1;
   }else if (Markedprice>=1000 && Markedprice<3000){
       discount=0.05;
   }
   Sellingprice=Markedprice -(Markedprice * discount);
   settotaldiscount(Markedprice * discount);
   settotalsales(Sellingprice);
   this.isInsales=false;
   this.Markedprice=Markedprice;
   
 }

public void display()
 {
    super.display();
    if(isInsales)
  {
     System.out.println("Productname:"+ Productname);
     System.out.println("Sellingprice:"+Sellingprice);
  }
 }
}


