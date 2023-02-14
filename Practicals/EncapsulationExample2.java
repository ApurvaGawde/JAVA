class Employee{
    //private data members
    private int deptid;
    private String deptname;
    private String post;
    

    //getter setter method
    public int getDeptid(){
        return deptid;
  }
    public void setDeptid(int deptid){
        this.deptid = deptid;
  }
    public String getDeptName(){
        return deptname;
  }
    public void setDeptName(String deptname){
        this.deptname = deptname;
  }
    public String getPost(){
        return post;
  }
    public void setPost(String post){
        this.post = post;
  }
   
}
class EncapsulationExample2{
     public static void main(String args[]){
          Employee e = new Employee(); //creation od Student obj
          e.setDeptid(1001);  //setter() to set values of 
          e.setDeptName("IT");
          e.setPost("Manager");
          

          System.out.println("Values are " +e.getDeptid()+" "+e.getDeptName()+" "+e.getPost());
     }
   }

