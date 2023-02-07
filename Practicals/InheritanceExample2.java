class School{
    int revenue = 307000;
    int fees = 5000;
  
     public void totalFees(){
        System.out.println("Total Fees :" +fees);
 }
}

class DegreeFees extends School{
     int increasedFee = 30000;

     public void increaseFees(){
          fees = fees + increasedFee;

}
}

class MastersFees extends School{
     int increasedFee = 20000;

     public void increaseFees(){
         fees = fees + increasedFee;
}
}

class InheritanceExample2{
      public static void main(String args[]){
        DegreeFees df1 = new DegreeFees();
        MastersFees df2 = new  MastersFees();

        System.out.println("Fees of degree college is:");
        df1.totalFees();
        System.out.println("Fees of masters degree college is:");
        df2.totalFees();

       df1.increasedFees();
       df2.increasedFees();
}
}