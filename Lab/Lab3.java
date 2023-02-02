class Lab3{
        static void num(){   //STATIC METHOD
            int i,num = 200,sum=0;
            for (i=1; i<num; i++) {         //FOR LOOP
			if (i%2==0){
                             System.out.println("Even number:"+i);			
		          }
                        else if(1%2!=0){
                              System.out.println("Odd number:"+i);
                       }
                       System.out.println(sum=sum+i);
}
}
         public static void main(String args[]){    //MAIN METHOD
             num();    //CALLING STATIC METHOD
}
}