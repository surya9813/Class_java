//package Java_1;

public class First{
    public static void main(String[] args) {
        System.out.println(10<<2);
        System.out.println(10<<3);
        System.out.println(20<<2);
        System.out.println(15<<4);


        System.out.println(10>>2);
        System.out.println(20>>2);
        System.out.println(20>>3);

        //for positive number,>> and >>>works same
        System.out.println(20>>2);
        System.out.println(20>>>2);

        //for negative number, >>>change parity bit(MSB)T to 0

        System.out.println(-20>>2);
        System.out.println(-20>>>2);
    
        
    }
    
}
