class UnaryExample{

      public void calcIncrement(){
          int x = 10;
          System.out.println(x++); //print 10 & is now 11
          System.out.println(x++); //print 11 & is now 12
          System.out.println(++x); //print 13 & is now 13
          System.out.println(x++);//print 13 & is now 14
          System.out.println(x);//print 14
}

      public void calcDecrement(){
          int x = 10;
          System.out.println(x--); //print 10 & is now 9
          System.out.println(x--); //print 9 & is now 8
          System.out.println(--x);//print 7 & is now 7
          System.out.println(--x);//print 7 & is now 6
          System.out.println(x--);//print 6 & is now 5
          System.out.println(x);//print 5
}
      public static void main(String args[]){
          UnaryExample id = new UnaryExample();
          id.calcDecrement();
          id.calcIncrement();
}
}

