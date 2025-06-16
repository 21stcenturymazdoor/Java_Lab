package Demonstration_Inheritance_Access_Modifier_Method_Invocation;

/**
 * B inherits A
 *
 * @author (21stcenturymazdoor)
 * @version (16/06/2025)
 */
public class B extends A
{
    /**
     * Constructor for objects of class B
     */
    public B() {
        super();
        System.out.println("B's constructor called");
    }

    // Public variable
    public void setPub(int val) {
        this.pub = val;
    }
    public int getPub() {
        return this.pub;
    }

    // Protected variable
    public void setProtect(int val) {
        this.protect = val;
    }
    public int getProtect() {
        return this.protect;
    }

    // Default/package-private variable
    public void setDefaul(int val) {
        this.defaul = val;
    }
    public int getDefaul() {
        return this.defaul;
    }

    // Static public variable
    public void setPubSt(int val) {
        pubSt = val;
    }
    public int getPubSt() {
        return pubSt;
    }

    // Static protected variable
    public void setProtectSt(int val) {
        protectSt = val;
    }
    public int getProtectSt() {
        return protectSt;
    }

    // Static default variable
    public void setDefaulSt(int val) {
        defaulSt = val;
    }
    public int getDefaulSt() {
        return defaulSt;
    }

    @Override
    public void showMessage() {
        System.out.println("Message from B");
    }

}
