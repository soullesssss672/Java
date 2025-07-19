public class retailer extends store{
    private int vatInclusiveprice;
    private int loyaltypoint;
    private  boolean Ispaymentonline;
    private String purchasedyear;

 //constructor for corresponding value
  public retailer(int storeID,String storename,String location, String openinghour,double totalsales,double totaldiscount,
                   int vatInclusiveprice,boolean Ispaymentonline,String purchasedyear){
        super(storeID, storename,location,openinghour);
        super.settotalsales(totalsales);
        super.settotaldiscount(totaldiscount);
        this.vatInclusiveprice = vatInclusiveprice;
        this.purchasedyear = purchasedyear;
        this.loyaltypoint = 0;
        if(Ispaymentonline) {
          setloyaltypoint(vatInclusiveprice);  
        }
    }
    //using Accessor methods
    public int getvatInclusiveprice(){
        return this.vatInclusiveprice;
    }
        public int getloyaltypoint(){
            return this.loyaltypoint;
 }     
 public boolean Ispaymentonline() {
     return this.Ispaymentonline;
 }
 public String getpurchasedyear() {
     return this.purchasedyear;
 }
  //using setter method
   public void setsIspaymentonline(boolean Ispaymentonline) {
      this.Ispaymentonline = Ispaymentonline;
   }
   //setting loyaltypoints to vatInclusiveprice
   public void setloyaltypoint(int vatInclusiveprice) {
       if(Ispaymentonline){
       this.loyaltypoint = (int) (vatInclusiveprice * 0.01);
   }
}
   //method for removing product
   public void removeproduct() {
       if (loyaltypoint ==0 && (purchasedyear.equals("2020") || purchasedyear.equals("2021") || purchasedyear.equals("2022"))){
           vatInclusiveprice = 0;
           loyaltypoint = 0;
           Ispaymentonline = false;
       }
   }
   //using display method
   public void display(){
       if (loyaltypoint !=0 && !(purchasedyear.equals("2020") || purchasedyear.equals("2021") || purchasedyear.equals("2022"))){
           super.display();
           System.out.println("VatInclusiveprice is:"+ vatInclusiveprice);
           System.out.println("Loyalty point is:"+ loyaltypoint);
           System.out.println("Purchased year is:"+ purchasedyear);
       }else{
           System.out.println("Product has been removed");
       }
   }
}