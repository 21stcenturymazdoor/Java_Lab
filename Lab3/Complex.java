
/**
 * Complex number class
 *
 * @author (21stcenturymazdoor)
 * @version (10/06/2025)
 */
public class Complex
{
    //State
    double a;
    double b;
    
    //Constructor
    Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    //copy constructor
    Complex(Complex c){
        this.a = c.a;
        this.b = c.b;
    }
    
    //Methods
    Complex addWith(Complex oth){
        double re;
        double im;
        re = this.a+oth.a;
        im = this.b+oth.b;
        
        Complex c2=new Complex(re,im);
        return c2;
    }
    
    Complex multiplyWith(Complex oth){
        double re;
        double im;
        re = this.a*oth.a - this.b*oth.b ;
        im = this.a*oth.b + this.b*oth.a;
        
        Complex c2=new Complex(re,im);
        return c2;
    }
    
    Complex divisionWith(Complex oth){
        Complex c2 = this.multiplyWith(oth.conjugate());
        double term = 1/(oth.a*oth.a + oth.b*oth.b);
        return new Complex(c2.a*term,c2.b*term);
    }
    
    public String toString(){
        if(this.b == 0){
            return String.valueOf(this.a);
        }else if(this.b > 0){
            return (this.a + " + i"+this.b);
        }else{
            return (this.a + " - i"+(this.b*-1));
        }
    }
    
    Complex conjugate(){
        return new Complex(this.a , -1*this.b);
    }
}
