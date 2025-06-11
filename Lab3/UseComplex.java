/**
 * Use class for Complex class
 *
 * @author (21stcenturymazdoor)
 * @version (11/06/2025)
 */
import java.util.Scanner;

public class UseComplex
{
    static Complex retGreater(Complex m, Complex n){
        if (m.a >= n.a && m.b >=n.b){
            return m;
        }else if(n.a >= m.a && n.b >= m.b){
            return n;
        }else{
            return null;
        }
    }
    
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("0.Exit");
        System.out.println("1.Display  :: A,B");
        System.out.println("2.multiply :: A*B");
        System.out.println("3.Divide   :: A/B");
        System.out.println("4.Add      :: A+B");
        System.out.println("5.Conjugate:: A',B'");
        System.out.print("Enter your choice :: ");
    }
    
    static Complex createComplex(Scanner sc){
        System.out.print("Enter real part :: ");
        double re = sc.nextDouble();
        System.out.print("Enter imaginary part :: ");
        double im = sc.nextDouble();
        
        return new Complex(re,im);
    }
    
    public static void main(String[] args){
        System.out.println("---Complex Number---");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("COMPLEX A");
        Complex c1 = createComplex(sc);
    
        System.out.println("COMPLEX B");
        Complex c2 = createComplex(sc);
        
        int choice;
        
        while(true){
            menu();
            choice = sc.nextInt();
            
            switch (choice) {
                case 0 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                case 1 -> {
                    System.out.println("A = " + c1);
                    System.out.println("B = " + c2);
                }
                case 2 -> System.out.println("A * B = " + c1.multiplyWith(c2));
                case 3 -> System.out.println("A / B = " + c1.divisionWith(c2));
                case 4 -> System.out.println("A + B = " + c1.addWith(c2));
                case 5 -> {
                    System.out.println("Conjugate of A = " + c1.conjugate());
                    System.out.println("Conjugate of B = " + c2.conjugate());
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
