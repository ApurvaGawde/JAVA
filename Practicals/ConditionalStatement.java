import java.util.Scanner;

class ConditionalStatement{
        public void calc(){
               
              if(x > y){
                 System.out.println("x is greater than y.");
}
              else{
                 System.out.println("x is not greater than y");
}
}
        public static void main(String args[]){
              Scanner s = new Scanner(System.in);
              System.out.println("Enter number 1");
              int x = s.nextInt();
              System.out.println("Enter number 2");
              int y = s.nextInt();
              ConditionalStatement obj = new ConditionalStatement();
              obj.calc();
}
}
