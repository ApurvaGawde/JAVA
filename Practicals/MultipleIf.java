class MultipleIf{
        public void grade(){
            int marks = 78;
            if(marks>=90){
               System.out.println("A Grade");
            }
            else if(marks>=75 && marks<=89){
                System.out.println("B Grade");
            }
            else if(marks>=60 && marks<=74){
                 System.out.println("C Grade");
             }
            else{
                System.out.println("Fail");
}
}
         public static void main(String args[]){
             MultipleIf obj = new MultipleIf();
             obj.grade();
}
}