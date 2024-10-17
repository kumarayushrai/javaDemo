package project1;

public class classjavavideo32 {
    static void foo(){
        System.out.println("good morning bro!");
    }

       static void foo(int a ){
          System.out.println("good morning " + a + " bro!");
      }

      static void foo(int a , int b ){
        System.out.println("good morning " + a + " bro!");
        System.out.println("good morning " + b + " bro!");
    }

    static void change1 (int a){
        a = 98;
    }

    static void change2 (int [] arr){
        arr[0] = 98;
    }

    static void telljoke(){
    System.out.println("I invented a new world!\n"+
               "Plagiarism!");
    }
    public static void main(String[] args){
//          telljoke();


//       CASE1 : Changing The Integer
//
//        int x =45;
//        change (x);
//        System.out.println("the value of x after running change is: " +x);

// //       CASE2 : Changing The Array

//        int [] marks = {52,65,75,98,92};
//        change2 (marks);
//        System.out.println("the value of x after running change is: " marks);

//        MEHTOD OVERLOADING

         foo();
         foo(3000);
         foo(3000, 4000);


    }
}
