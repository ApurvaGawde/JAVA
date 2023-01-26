class Operators{
         public void arithmetic(){
              int a=29, b=23;
              System.out.println(a+b);
              System.out.println(a-b);
              System.out.println(a*b);
              System.out.println(a/b);
              System.out.println(a%b);
}
           public void unary(){
              int x=4;
              System.out.println(x++);
              System.out.println(x++);
              System.out.println(x--);
              System.out.println(++x);
              System.out.println(--x);
              System.out.println(x);
}
           public void relational(){ 
              int p=23, q=34;
              System.out.println(p<q&&q<p);
              System.out.println(p<q||q<p);
}
           public void ternary(){
              int y=5,z=6;
              int min=(y<z)?y:z;
              System.out.println(min);
}

         public static void main(String args[]){
              Operators obj = new Operators();
              obj.arithmetic();
              obj.unary();
              obj.relational();
              obj.ternary();
}
}