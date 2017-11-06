/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnny.algorithm.cc150;

/**
 *
 * @author Johnny
 */
public class CC150 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //3.4 Towers of Hanoi
        //4.8 Sum Path
        //5.2 Show Decimal 3.72 in bits.
        //5.3 Next bigger and smaller
        //Design Questions:
        // 1. Parking lot
        
        
        //20.1
        //20.4 Write a method to count the number of 2s between 0 and n
        //20.6 Selection Rank Algorithm, Heap 
        
        //CC189
        //chapter 4 tree and graph
        // 5.3
        // 5.4
        // 5.8
        
        
        Foo f = new Foo("f");
        changeReference(f); // It won't change the reference!
        System.out.println(f.val); // Print 'f'
        modifyReference(f); // It will modify the object that the reference variable "f" refers to!
        System.out.println(f.val); // Print 'c'
        setToNull(f); // f wont't be null
        System.out.println(f.val); // Print 'c'
    }
    
    private static class Foo {
        public String val = "";
        public Foo (String val) {
            this.val = val;
        }
        public void setAttribute(String val) {
            this.val = val;
        }
    }
    
    public static void changeReference(Foo a){
        Foo b = new Foo("b");
        a = b;
    }
    
    public static void modifyReference(Foo c){
        c.setAttribute("c");
    }
    
    public static void setToNull(Foo d){
        d = null;
    }
    
}
