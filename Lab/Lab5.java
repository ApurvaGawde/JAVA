import java.util.Scanner;
class Lab5{
      static void star(){
         int size = 5;
         int a = 65;

    for (int i = 0; i < size; i++) {
      // printing alphabets
      for (int j = 0; j < size - i; j++) {
        System.out.print((char)(a+j));
      }
      System.out.println();
    }
  }


      public static void main(String args[]){
             star();
}
}