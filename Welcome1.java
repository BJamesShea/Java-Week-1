import java.util.Scanner;
import java.util.*;
public class Welcome1{
    //

    public static void main(String[] args) {
     int a,b;

     try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter first integer");

     a = input.nextInt();
      // float c = 2.5f;
    }
       System.out.println("Integer\n entered = " + (a + a) + Math.PI);
      System.out.printf("Integer\t entered = %d " , a);




        
    }
    //


    }


    // notes;
    // int a = 10;
    // name = a
    // type = int
    // size = 2 bytes
    // physical address = FF100 (random)

    // int d[5] = {1,2,3,4,5};

    // name = d
    // indices = 0,1,2,3,4
    // physical address = HH100
    // size = 10 bytes (2x5)
    // type = int
    // address of d is in a physical address, which corresponds to the first index. Points to the first index.

    // Boolean (true/false) = 1 bit
    // Byte (byte length integer) = 1 byte
    // Short (Short integer) = 2 bytes
    // Integer (int) = 4 bytes
    // Long (Long integer) = 8 bytes
    // Float (single precision floating point number) = 4 bytes
    // Double (Double precision float) = 8 bytes
    // Char (single character) = 2 bytes