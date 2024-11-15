/* Consider an Interface P with a data member p and a method disp(). Create two interfaces P1 and P2 which inherits interface P. Each interface P1 and P2 has a data member and one method. Create a class Q which implements P1 and P2. Instantiate class Q and invoke each of its methods. Each method displays one of the constants. */

// Interface P with a constant and method disp()
interface P {
    // Data member (constant) p
    String p = "Interface P constant";

    // Method disp() to be implemented by the classes implementing this interface
    void disp();
}

// Interface P1 inherits interface P and has its own constant and method
interface P1 extends P {
    // Data member (constant) in interface P1
    String p1 = "Interface P1 constant";

    // Method to display P1 constant
    void dispP1();
}

// Interface P2 inherits interface P and has its own constant and method
interface P2 extends P {
    // Data member (constant) in interface P2
    String p2 = "Interface P2 constant";

    // Method to display P2 constant
    void dispP2();
}

// Class Q implements both P1 and P2 interfaces
class Q implements P1, P2 {
    // Implementing disp() method from interface P
    @Override
    public void disp() {
        System.out.println("Display method from Interface P: " + p);
    }

    // Implementing dispP1() method from interface P1
    @Override
    public void dispP1() {
        System.out.println("Display method from Interface P1: " + p1);
    }

    // Implementing dispP2() method from interface P2
    @Override
    public void dispP2() {
        System.out.println("Display method from Interface P2: " + p2);
    }
}

public class InterfaceInheritance {
    public static void main(String[] args) {
        // Creating an object of class Q which implements P1 and P2
        Q q = new Q();

        // Calling the methods of Q that display the constants from each interface
        q.disp();    // Method from interface P
        q.dispP1();  // Method from interface P1
        q.dispP2();  // Method from interface P2
    }
}

/* SAMPLE OUTPUT 
  Display method from Interface P: Interface P constant
  Display method from Interface P1: Interface P1 constant
  Display method from Interface P2: Interface P2 constant
*/

