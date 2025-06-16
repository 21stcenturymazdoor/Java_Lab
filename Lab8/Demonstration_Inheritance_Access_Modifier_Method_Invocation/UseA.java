package Demonstration_Inheritance_Access_Modifier_Method_Invocation;

/**
 * Write a description of class UseA here.
 *
 * @author (21stcenturymazdoor)
 * @version (16/06/2025)
 */
public class UseA
{
    public static void main(String[] args){
        A a = new A();
        A b = new A();
        b.add(500);

        System.out.println("-------A-------");
        System.out.println("pub : " + a.pub());
        System.out.println("priv : " + a.priv());
        System.out.println("protect : " + a.protect());
        System.out.println("defaul : " + a.defaul());

        System.out.println("pubSt : " + a.pubSt());
        System.out.println("privSt : " + a.privst());
        System.out.println("protectSt : " + a.protectSt());
        System.out.println("defaulSt : " + a.defaulSt());

        System.out.println("-------B-------");
        System.out.println("pub : " + b.pub());
        System.out.println("priv : " + b.priv());
        System.out.println("protect : " + b.protect());
        System.out.println("defaul : " + b.defaul());

        System.out.println("pubSt : " + b.pubSt());
        System.out.println("privSt : " + b.privst());
        System.out.println("protectSt : " + b.protectSt());
        System.out.println("defaulSt : " + b.defaulSt());

        a.add(100);

        System.out.println("-------A+100-------");
        System.out.println("pub : " + a.pub());
        System.out.println("priv : " + a.priv());
        System.out.println("protect : " + a.protect());
        System.out.println("defaul : " + a.defaul());

        System.out.println("pubSt : " + a.pubSt());
        System.out.println("privSt : " + a.privst());
        System.out.println("protectSt : " + a.protectSt());
        System.out.println("defaulSt : " + a.defaulSt());

        System.out.println("-------B after A+100-------");
        System.out.println("pub : " + b.pub());
        System.out.println("priv : " + b.priv());
        System.out.println("protect : " + b.protect());
        System.out.println("defaul : " + b.defaul());

        System.out.println("pubSt : " + b.pubSt());
        System.out.println("privSt : " + b.privst());
        System.out.println("protectSt : " + b.protectSt());
        System.out.println("defaulSt : " + b.defaulSt());

        a.add(100);

        System.out.println("-------A+100 accessing variables-------");
        System.out.println("pub : " + a.pub);
        //System.out.println("priv : " + a.priv);
        System.out.println("protect : " + a.protect);
        System.out.println("defaul : " + a.defaul);

        System.out.println("pubSt : " + a.pubSt);
        //System.out.println("privSt : " + a.privSt);
        System.out.println("protectSt : " + a.protectSt);
        System.out.println("defaulSt : " + a.defaulSt);

        System.out.println("-------B accessing variables-------");
        System.out.println("pub : " + b.pub);
        //System.out.println("priv : " + b.priv);
        System.out.println("protect : " + b.protect);
        System.out.println("defaul : " + b.defaul);

        System.out.println("pubSt : " + b.pubSt);
        //System.out.println("privSt : " + b.privSt);
        System.out.println("protectSt : " + b.protectSt);
        System.out.println("defaulSt : " + b.defaulSt);

        System.out.println("Accessing static like The conventional way");
        System.out.println("pubSt : " + A.pubSt);
        //System.out.println("privSt : " + A.privSt);
        System.out.println("protectSt : " + A.protectSt);
        System.out.println("defaulSt : " + A.defaulSt);
    }
}
