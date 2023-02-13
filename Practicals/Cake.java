// Abstract class
abstract class Bakery {
  
  public abstract void cheesecake();
 
  public void flavour() {
    System.out.println("Red Velvet");
  }
}


class Berry extends Bakery {
  public void cheesecake() {
    
    System.out.println("Blueberry");
  }
}

class Cake {
  public static void main(String[] args) {
    Berry be = new Berry(); 
    be.cheesecake();
    be.flavour();
  }
}