class Student{
    //private data members
    private int sid;
    private String name;
    private String email;
    private long phoneno;

    //getter setter method
    public int getSid(){
        return sid;
  }
    public void setSid(int sid){
        this.sid = sid;
  }
    public String getName(){
        return name;
  }
    public void setName(String name){
        this.name = name;
  }
    public String getEmail(){
        return email;
  }
    public void setEmail(String email){
        this.email = email;
  }
    public long getPhone(){
        return phoneno;
  }
    public void setPhone(long phoneno){
        this.phoneno = phoneno;
  }
}
class EncapsulationExample{
     public static void main(String args[]){
          Student s = new Student(); //creation od Student obj
          s.setSid(1001);  //setter() to set values of 
          s.setName("Apurva");
          s.setEmail("apu@gmail.com");
          s.setPhone(12512);

          System.out.println("Values are " +s.getSid()+" "+s.getName()+" "+s.getEmail()+" "+s.getPhone());
     }
   }

