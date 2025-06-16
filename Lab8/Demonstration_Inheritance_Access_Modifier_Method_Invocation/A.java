package Demonstration_Inheritance_Access_Modifier_Method_Invocation;

/**
 * Write a description of class A here.
 *
 * @author (21stcenturymazdoor)
 * @version (16/06/2025)
 */
public class A
{
    // instance variables
    public int pub;
    private int priv;
    protected int protect;
    int defaul;
    
    public static int pubSt;
    private static int privSt;
    protected static int protectSt;
    static int defaulSt;

    /**
     * Constructor for objects of class A
     */
    public A()
    {
        pub = priv = protect = defaul = 1000;
        pubSt = privSt = protectSt = defaulSt = -1000;
        System.out.println("A's constructor called");
    }
    
    public void add(int a){
        pub += a;
        priv += a;
        protect += a;
        defaul += a;
        
        pubSt += a;
        privSt += a;
        protectSt += a;
        defaulSt += a;
    }
    
    public int pub(){
        return pub;
    }
    
    public int priv(){
        return priv;
    }
    
    public int protect(){
        return protect;
    }
    
    public int defaul(){
        return defaul;
    }
    
    public int pubSt(){
        return pubSt;
    }
    
    public int privst(){
        return privSt;
    }
    
    public int protectSt(){
        return protectSt;
    }
    
    public int defaulSt(){
        return defaulSt;
    }

    public void showMessage() {
        System.out.println("Message from A");
    }
}
