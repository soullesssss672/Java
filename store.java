public class store  //store class is parents class
{
    //setting value in attributes
    private int storeID;
    private String storeName;
    private String location;
    private String openinghours;
    private double totalsales;
    private double totaldiscount;
    //constructor for corresponding values
    public store(int storeID,String storeName, String location,String openinghours){
        this.storeID = storeID;
        this.storeName=storeName;
        this.location=location;
        this.openinghours=openinghours;
        this.totalsales=0.0;
        this.totaldiscount=0.0;
        
    }
    //using setter method
     public void settotalsales(double totalsales){
         this.totalsales=totalsales;
     }
     public void settotaldiscount(double totaldiscount){
         this.totaldiscount=totaldiscount;
     }
     //using accessor method

    public int getstoreID(){
        return this.storeID;
    }
    public String getstoreName(){
        return  this.storeName;
    }
    public String getlocation(){
        return this.location;
    }
    public String getopeninghours(){
        return this.openinghours;
    }
 
   //method for display
   public void display(){
    System.out.println("storeID:"+ storeID);
    System.out.println("storeName:"+ storeName);
    System.out.println("location:"+ location);
    System.out.println("openinghours:"+ openinghours);
    if(totalsales == 0.0 && totaldiscount == 0.0){
        System.out.println("No sales have been made");
    }else {
        System.out.println("total sales have been made");
    }
           
       }
    }
    
