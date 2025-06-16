package Demonstration_Inheritance_Access_Modifier_Method_Invocation;

 

/**
 * Demonstrates variable access/modification and method overriding with B and A.
 *
 * @author (21stcenturymazdoor)
 * @version (16/06/2025)
 */
public class UseB
{
    public static void main(String[] args){
        // Demonstrate variable access and modification
        B b = new B();

        System.out.println("Initial values:");
        System.out.println("pub: " + b.getPub());
        System.out.println("protect: " + b.getProtect());
        System.out.println("defaul: " + b.getDefaul());
        System.out.println("pubSt: " + b.getPubSt());
        System.out.println("protectSt: " + b.getProtectSt());
        System.out.println("defaulSt: " + b.getDefaulSt());

        // The following lines would NOT compile because private members of A are not accessible in B:
        // b.setPriv(1234);
        // System.out.println("priv: " + b.getPriv());
        // b.setPrivSt(5678);
        // System.out.println("privSt: " + b.getPrivSt());

        // Modify values through B's methods
        b.setPub(2000);
        b.setProtect(3000);
        b.setDefaul(4000);
        b.setPubSt(5000);
        b.setProtectSt(6000);
        b.setDefaulSt(7000);

        System.out.println("\nAfter modification through B's methods:");
        System.out.println("pub: " + b.getPub());
        System.out.println("protect: " + b.getProtect());
        System.out.println("defaul: " + b.getDefaul());
        System.out.println("pubSt: " + b.getPubSt());
        System.out.println("protectSt: " + b.getProtectSt());
        System.out.println("defaulSt: " + b.getDefaulSt());

        // --- Part C: Method Overriding and Invocation ---
        System.out.println("\n--- Method Overriding Demonstration ---");
        A a = new A();
        System.out.println("Calling showMessage() on A:");
        a.showMessage();

        System.out.println("Calling showMessage() on B:");
        b.showMessage();

        // Polymorphism demonstration
        A ref = new B();
        System.out.println("Calling showMessage() on A ref to B:");
        ref.showMessage();
    }
}
