import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.println("Hello world");
//     }
//  }

//print *

// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
//  }   



///////////////////////////sum of a and b
// public class JavaBasics {
//     public static void main(String[] args) {
//         int a = 4;
//         int b = 6;
//         int Sum = a + b;
//         System.out.println(Sum);
//     }
// }


///////////////////////////input variable


// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) 
//     {
//         Scanner sc = new Scanner(System.in);
//         String  input = sc.nextLine();
//         System.out.println(input);
//     }
// }




////////////////////////////type conversion

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) 
//     {
//          int a = 25;
//          int b = a;
//         // long a = 25;
//         // int b = a;/*came error in both of the line */
//         // Scanner sc = new Scanner(System.in);
 //         // String  input = sc.nextLine();
//         System.out.println(b);
//     }
// }


//////////////////////////////Type casting
// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         // Scanner sc = new Scanner(System.in);
//         // float a = 25.12f;
//      char ch = 'a';
//      int num = ch;    
//         // int b = (int)a;
//         System.out.println(num);
//     }
// }


////// Type promotion expression


// public class JavaBasics {
//     public static void main(String args[]) {
//         char a = 'a';
//         char b = 'b';
//         /*char c = b-a; */
//         System.out.println(b-a);
//         System.out.println((int)b);
//         System.out.println((int)a);
//     }
// }



// public class JavaBasics {
//     public static void main(String args[]) {
//         int a = 5;
//         float b = 25.12f;
//         long c = 25; 
//         double d = 30;
//         double ans = a+b+c+d;        /*this is operand because of +.*,- so if here is float,doublee,long than whole value is double ,long, float*/
//         System.out.println(ans); 
//     }
// }



// public class JavaBasics {
//     public static void main(String args[]) {
//         short a = 5;
//         byte b = 25;
//         char c = 'c'; 
//         byte bt = (byte)(a+b+c);       //this is the operand because of this all changes came
//         System.out.println(bt);
//          System.out.println((int)c);
//     }
// }                  // IN THIS TYPE OF TOPIC  B=B*2 is wrong but B= (BYTE)B*2 IS RIGHT

// public class JavaBasics {
//     public static void main(String args[]){
//         System.out.println("Hello World!");
//     }
// }

//print all four star
// public class JavaBasics {
//     public static void main(String atgs[]){
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }

// practice sheet


public class variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float total = (a+b+c)/3;
        System.out.println(" avrg value will be :" +total);
        
        float newtotal = total + (0.18f*total);
        System.out.println(" value of including tax is : " +newtotal);
        
    }

}
