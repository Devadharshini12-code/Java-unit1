public class Operators {
   
        public static void main(String[] args) {
            // Initializing variables
            int a = 10;
            int b = 5;
            boolean state=true;
    
            // Relational Operators
            System.out.println("Relational Operators:");
            System.out.println("a == b: " + (a == b));   
            System.out.println("a != b: " + (a != b));   
            System.out.println("a > b: " + (a > b));     
            System.out.println("a < b: " + (a < b));     
            System.out.println("a >= b: " + (a >= b));   
            System.out.println("a <= b: " + (a <= b));   
            
            // Logical Operators
            System.out.println("\nLogical Operators:");
            System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));  
            System.out.println("(a < b) || (a > 0): " + ((a < b) || (a > 0))); 
            System.out.println("!(a == b): " + !(a == b));                      
            
            // Unary Operators
            System.out.println("\nUnary Operators:");
            System.out.println("Initial a: " + a);    
            System.out.println("++a: " + (++a));        
            System.out.println("a++: " + (a++));         
            System.out.println("--a: " + (--a));        
            System.out.println("a--: " + (a--));         
            System.out.println("After all operations, a: " + a);  
            System.out.println("!state:"+state); 
        }
    }
    

