import java.util.*;

interface ParkingCharge{
   double calculateCharge();
   void displayParkingDetails();
}

class VehicleParking{
   String vehicleNumber;
   String vehicleType;
   int parkingHours;
   VehicleParking(String vehicleNumber,String vehicleType, int parkingHours){
      this.vehicleNumber = vehicleNumber;
      this.vehicleType=vehicleType;
      this.parkingHours = parkingHours;
   }
}

class TwoWheeler extends VehicleParking implements ParkingCharge{
   TwoWheeler(String vehicleNumber, int parkingHours){
      super(vehicleNumber,"Two Wheeler",parkingHours);
   }
   public double calculateCharge(){
      if(parkingHours<=2)
         return parkingHours * 20;
      else
         return (2*20)+(parkingHours-2)*10;
   }
   
   public void displayParkingDetails(){
      System.out.println("Vehicle Number: "+vehicleNumber);
      System.out.println("Vehicle Type: "+vehicleType);
      System.out.println("Parking Hours: "+parkingHours);
      System.out.println("Total Charge: "+calculateCharge());
   }
}

class FourWheeler extends VehicleParking implements ParkingCharge{
   FourWheeler(String vehicleNumber, int parkingHours){
      super(vehicleNumber,"Four Wheeler",parkingHours);
   }
   public double calculateCharge(){
      if(parkingHours<=2)
         return parkingHours * 50;
      else
         return (2*50)+(parkingHours-2)*30;
   }
   
   public void displayParkingDetails(){
      System.out.println("Vehicle Number: "+vehicleNumber);
      System.out.println("Vehicle Type: "+vehicleType);
      System.out.println("Parking Hours: "+parkingHours);
      System.out.println("Total Charge: "+calculateCharge());
   }
}


public class Lab4{
   public static void main(String[] args){
      TwoWheeler a = new TwoWheeler("KA10LL1980",3);
      FourWheeler b = new FourWheeler("KA01DD2006",5);
      
      a.displayParkingDetails();
      b.displayParkingDetails();
   }
}
