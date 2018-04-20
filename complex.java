import java.util.ArrayList;
/**
 * This class contains various methods for complex numbers
 * @author Devam Shroff
 * @since 12/12/16
 */
public class complex implements Comparable{
	
	private double a; //real number
	private double b; //imaginary number
	
//constructors
//No argument constructor. Constructs a complex object i.
 public complex(){
	 a = 0;
	 b = 1;
 }
 
 //single argument constructor. 
 //param x: coefficient of both real and imaginary parts of complex object.
 public complex(double x){ 
	 a = x;
	 b = x;
 }
 
 //two argument constructor. first param is real, second param is imaginary.
 //param x: coefficient of real part of complex object.
 //param y: coefficient of imaginary part of complex object.
 public complex(double x, double y){
	a = x;
	b = y;
 }
 
 //accessors
 
 //to access the real part of a complex object.
 //returns real part of complex object.
 public double get_a(){
	return a;
 }
 //to access the imaginary part of a complex object.
 //returns coefficient of imaginary part of complex object.
 public double get_b(){
	 return b;
 }
 
 //to set/change the real part of a complex object.
 //param x: value that will be set as the real part of a complex number.
 //returns double real part of a complex number.
 public double set_a(double x){
	a = x; 
	return a;
 }
 
//to set/change the imaginary part of a complex object.
//param x: value that will be set as the coefficient of the imaginary part of a complex number.
//coefficient of the imaginary part of a complex number.
 public double set_b(double x){
	 b = x;
	 return b;
 }
 //method for printing complex objects.
 //returns the format for a print statement.
 public String toString(){
	 String retvalue = " ";
	 if(b>0){
	 retvalue = a + " " + "+"  + " " + b + "i";
	 }
	 if(b<0){
	 retvalue = a + " " + "-"  + " " + Math.abs(b) + "i";
	 }
	 if(b == 0){
		 retvalue = a + "";
	 }
	 return retvalue;
 }
 //method to compare two complex objects.
 //param p: the object to which the pointer is compared.
 //returns 1 if objects are of same type and have same values (within +-.00001)
 //returns 0 if objects are of same type but have different values
 //returns -1 if objects are not of same type
public int compareTo(Object p){
	if(this.getClass() == p.getClass()){
		complex q = (complex) p;
		if((Math.abs(this.a - q.a)<.00001)&&(Math.abs(this.b - q.b)<.00001)){
			return 1;
		}
		return 0;
	}
	return -1;
 }
 
 //method to compare two complex objects.
 //param p: the object to which r is compared.
 //param r: the object to which p is compared
 //returns 1 if objects are of same type and have same values (within +- .00001)
 //returns 0 if objects are of same type but have different values
 //returns -1 if objects are not of same type
public static int compareTo(Object p, Object r){
	if(r.getClass() == p.getClass()){
		complex q = (complex) p;
		complex s = (complex) r;
		if((Math.abs(q.a - s.a)<.00001)&&(Math.abs(q.b - s.b)<.00001)){
			return 1;
		}
		return 0;
	}
	return -1;
 }
 
 
 //method to compare two complex objects (boolean)
 //param p: complex object with which pointer(this) is compared.
 //param epsilon: the error bound within which the objects will be considered equal.
 //returns true if difference between p and q is within error bound.
 //returns false if difference between p and q is outside error bound.  
 public boolean isEquals(complex p, double epsilon){
	 if((Math.abs(this.a - p.a) < epsilon) && (Math.abs(this.b - p.b) < epsilon)){
		 return true;
	 }
	return false;	 
 }
 
 //method to compare two complex objects (boolean)
 //param p: complex object with which q is compared.
 //param q: complex object with which p is compared.
 //param epsilon: the error bound within which the objects will be considered equal.
 //returns true if difference between p and q is within error bound.
 //returns false if difference between p and q is outside error bound.  
 public static boolean isEquals(complex p, complex q, double epsilon){
	 if((Math.abs(q.a - p.a) < epsilon) && (Math.abs(q.b - p.b) < epsilon)){
		 return true;
	 }
	return false;	 
 }

 //mutators

 //adds two complex numbers. returns a complex number.
 //param p: second complex number to be added.
 //returns complex r: sum of p and this.
public complex add(complex p){
	complex r = new complex(p.a + this.a, p.b + this.b);
	return r;
}

//adds two complex numbers. returns a complex number.
 //param p: first complex number to be added.
 //param q: second complex number to be added.
 //returns complex r: sum of p and q.
public static complex add(complex p, complex q){
	complex r = new complex(p.a + q.a, p.b + q.b);
	return r;
}  

//adds double to a complex number.
//param x: double to be added to real part of complex object
//returns complex r: sum of this and x.
public complex add(double x){
	complex r = new complex(this.a + x, this.b);
	return r;
}

//adds double to a complex number.
//param p: complex number to which double is added.
//param q: double to be added to real part of complex object.
//returns complex r: sum of p and q.
public static complex add(complex p, double q){
	complex r = new complex(p.a + q, p.b);
	return r;
}

//subtracts two complex numbers.
//param p: complex object subtracted from pointer
//returns complex r: difference of two complex numbers.
public complex subtract(complex p){
	complex r = new complex(this.a - p.a, this.b - p.b);
	return r;
}

//subtracts two complex numbers.
//param p: complex object from which q is subtracted.
//param q: complex object subtracted from p.
//returns complex r: difference of two complex numbers.
public static complex subtract(complex p, complex q){
	complex r = new complex(q.a - p.a, q.b - p.b);
	return r;
}

//subtracts a real number from a complex number. 
//param p: double subtracted from this.
//returns complex r: difference of this and p.
public complex subtract(double p){
	complex r = new complex(this.a - p, this.b);
	return r;
}

//subtracts a real number from a complex number. 
//param q: complex object from which p is subtracted.
//param p: double subtracted from q.
//returns complex r: difference of q and p.
public static complex subtract(complex q, double p){
	complex r = new complex(q.a - p, q.b);
	return r;
}

//multiplies two complex numbers.
//param p: first complex object multiplied.
//param q: second complex object multiplied.
//returns complex r: product of p and q.
public static complex multiply(complex p, complex q){
	double aa = (p.a * q.a) - (p.b * q.b);
	double bb = (p.a * q.b) + (p.b * q.a);
	complex r = new complex(aa,bb);
	return r;
}

//multiplies two complex numbers.
//param q: complex object multiplied with this.
//returns complex r: product of this and q.
 public complex multiply(complex q){
	double aa = (this.a * q.a) - (this.b * q.b);
	double bb = (this.a * q.b) + (this.b * q.a);
	complex r = new complex(aa,bb);
	return r;
}

//multiplies an array of complex numbers.
//param p: arrayList of complex numbers whose elements are multiplied.
//returns complex q: the product of all complex numbers in p.
public complex multiply(ArrayList<complex> p){
	complex q = new complex();
	q = p.get(0);
	for(int i = 1; i<p.size(); i++){
	q = q.multiply(p.get(i));
	}	
	return q;
}

//multiplies a complex number with a double.
//param p: double with which this is multiplied.
//returns complex r: the product of this and p.
public complex multiply(double p){
	complex r = new complex(this.a * p, this.b * p);
	return r;
}

//multiplies a complex number with a double.
//param q: complex number with which p is multiplied.
//param p: double with which q is multiplied.
//returns complex r: the product of q and p.
public static complex multiply(complex q, double p){
	complex r = new complex(q.a * p, q.b * p);
	return r;
}

//divides a complex number from a complex number.
//param p: complex numerator.
//param q: complex denominator.
//returns complex num: quotient of p/q.
public static complex divide(complex p, complex q){
complex temp = new complex(q.a, q.b * (-1));
	
	complex num = new complex();
	num = p.multiply(temp);
	
	complex denom = new complex();
	denom = multiply(q, temp);
	
	double den = magnitude(denom);
	
	num = num.divide(den);
	return num;
	}

//divides a complex number from a complex number.
//param q: complex denominator.
//returns complex num: quotient of this/q.	
public complex divide(complex q){
	complex temp = new complex(q.a, q.b * (-1));
	
	complex num = new complex();
	num = this.multiply(temp);
	
	complex denom = new complex();
	denom = multiply(q, temp);
	
	double den = magnitude(denom);
	
	num = num.divide(den);
	return num;
}

//divides a real number from a complex number.
//param x: real denominator.
//returns complex num: quotient of this/x.
public complex divide(double x){
complex num = new complex();
	num.a = this.a / x;
	num.b = this.b / x;
	return num;
}

//divides a real number from a complex number.
//param y: complex numerator.
//param x: real denominator.
//returns complex num: quotient of this/x.
public static complex divide(complex y, double x){
	complex num = new complex();
	num.a = y.a / x;
	num.b = y.b / x;
	return num;
}

//divides a complex number from a real number.
//param x: real numerator.
//returns complex num: quotient of x/this.
public complex complexdividesreal(double x){//complex number is denominator. para double is numerator.
complex num = new complex(this.a, this.b*(-1));
	num = num.multiply(x);
	double denom = (this.a * this.a) + (this.b * this.b);
	return num.divide(denom);
} 

//divides a complex number from a real number.
//param x: real numerator.
//param z: complex denominator.
//returns complex num: quotient of x/z.
public static complex complexdividesreal(double x, complex z){//complex number is denominator. para double is numerator.
complex num = new complex(z.a, z.b*(-1));
	num = num.multiply(x);
	double denom = (z.a * z.a) + (z.b * z.b);
	return num.divide(denom);
} 

//polar forms 

//method to find the argand of a complex number on the polar plane.
//returns double theta: argand of this.
public double argand(){//gets you the polar angle of the complex number //radians //updated for all use cases //non static //no parameters //returns a double
    if(this.a==0){
      if(this.b<0)return Math.PI/-2;
      if(this.b>0)return Math.PI/2;
      if(this.b==0)return 0;
    }
    if(this.a!=0 && this.b==0){
      if(this.a<0) return Math.PI;
      if(this.a>0) return 0;
    }
    if(this.a<0){
      return Math.atan(this.b/this.a) + Math.PI;
    }
    return Math.atan(this.b/this.a);
  }

  public static double argand(complex a){ //gets you the polar angle of the complex number //returns a double (radians) //static //takes in a Complex object
    return a.argand();
  }

/*//method to find the argand of a complex number on the polar plane.
//param p: complex number whose argand needs to be found.
//returns double theta: argand of p.
public static double argand(complex p){
	double theta = Math.atan(p.b/p.a);
	return theta;
}
*/
//method to find the magnitude of a complex number.
//returns double r: magnitude of this.
public double magnitude(){
	double r = Math.sqrt((this.a*this.a) + (this.b*this.b));
	return r;
}

//method to find the magnitude of a complex number.
//returns double r: magnitude of p.
public static double magnitude(complex p){
	double r = Math.sqrt((p.a*p.a) + (p.b*p.b));
	return r;
}

//powers & roots

//method to compute a complex number with a real exponent.
//param x: complex base.
//param y: real exponent.
//returns complex p: simplified answer of x^y.
public static complex power(complex x, double y){
	double r = x.magnitude();
	double theta = x.argand();
	double aa = Math.pow(r,y)*(Math.cos(theta * y));
	double bb = Math.pow(r,y)*(Math.sin(theta * y));
	complex p = new complex(aa,bb);
	return p;
	}
	
//method to compute a complex number with a real exponent.
//param y: real exponent.
//returns complex p: simplified answer of this^y.
public complex power(double y){
	double r = this.magnitude();
	double theta = this.argand();
	double aa = Math.pow(r,y)*(Math.cos(theta * y));
	double bb = Math.pow(r,y)*(Math.sin(theta * y));
	complex p = new complex(aa,bb);
	return p;
}

//method to compute the first nth root of complex number.
//param x: complex base.
//param root: double value of which root to find.
//returns complex p: simplified answer of x^(1/root).
public static complex root(complex x, double root){
	double r = magnitude(x);
	double theta = argand(x);
	double n = 1 / root;
	double aa = Math.pow(r,n)*(Math.cos(theta * n));
	double bb = Math.pow(r,n)*(Math.sin(theta * n));
	complex z = new complex(aa,bb);
	return z;
}

//method to compute the first nth root of complex number.
//param root: double value of which root to find
//returns complex p: simplified answer of this^(1/root).
/*public complex root(double root){
	double r = magnitude(this);
	double theta = argand(this);
	double n = 1 / root;
	double aa = Math.pow(r,n)*(Math.cos(theta * n));
	double bb = Math.pow(r,n)*(Math.sin(theta * n));
	complex z = new complex(aa,bb);
	return z;
}*/
public complex[] root(int n){ //returns an array of length n of the n roots of a complex number //non static
    if(n<0)throw new IllegalArgumentException("YOU CANNOT TAKE THE ZEROTH ROOT OF SOMETHING");
    double modroot = rootfinder(this.magnitude(),n);
    complex[] comproots = new complex[n];
    for(int i=0;i<n;i++){
      comproots[i] = new complex(modroot*Math.cos(((this.argand()+2*Math.PI*i)/n)),modroot*Math.sin(((this.argand()+2*Math.PI*i)/n)));
    }
    return comproots;
  }
public static double rootfinder(double k,double m){ //finds the kth root of a double
    double y = 2;
	double epsilon = .00001;
   while(Math.abs(Math.pow(y,m) - k)/Math.abs(k)>epsilon){
       y = y - (Math.pow(y,m)-k)/(m*Math.pow(y,m-1));
     }
   return y;
 }
//method to compute a real number with a complex exponent.
//param y: real base.
//param x: complex exponent.
//returns complex p: simplified answer of y^x.
public static complex realtothecomplex(double y, complex x){
	complex p = new complex();
	p.a = Math.pow(y,x.a) * (Math.cos(x.b*Math.log(y)));
	p.b = Math.pow(y,x.a) * (Math.sin(x.b*Math.log(y)));
	return p;
}

//method to compute a real number with a complex exponent.
//param y: real base.
//returns complex p: simplified answer of this^x.
public complex realtothecomplex(double x){ 
	double y = x;
	complex p = new complex();
	p.a = Math.pow(y,this.a) * (Math.cos(this.b*Math.log(y)));
	p.b = Math.pow(y,this.a) * (Math.sin(this.b*Math.log(y)));
	return p;
}

//method to compute a complex number with a complex exponent.
//param x: complex exponent.
//returns complex p: simplified answer of this^x.
public complex complextothecomplex(complex x){
	complex z = new complex(0,1);
	complex p = new complex();
	p = realtothecomplex(((this.a * this.a)	+ (this.b * this.b)),(x.divide(2)));
	complex q = new complex();
	complex zz = z.multiply(x);
	q = (zz.multiply(argand(this))).realtothecomplex(Math.exp(1));
	complex fini = new complex();
	fini = p.multiply(q);
	return fini;
}

//method to compute a complex number with a complex exponent.
//param y: complex base.
//param x: complex exponent.
//returns complex p: simplified answer of y^x.
public static complex complextothecomplex(complex y,complex x){
	complex z = new complex(0,1);
	
	complex p = new complex();
	p = realtothecomplex(((y.a * y.a)	+ (y.b * y.b)),(x.divide(2)));
	complex q = new complex();
	complex zz = z.multiply(x);
	q = (zz.multiply(argand(y))).realtothecomplex(Math.exp(1));
	
	complex fini = new complex();
	fini = p.multiply(q);
	return fini;
}

//logarithms 

//method to return the log base 10 of a complex number.
//returns complex z: log base 10 of this.
public complex log10(){
double temp1 = Math.log10(magnitude(this));
double temp2 = Math.log10(Math.exp(argand(this)));
complex z = new complex(temp1, temp2);
return z;
}

//method to return the log base 10 of a complex number.
//param x: complex argument 
//returns complex z: log base 10 of x.
public static complex log10(complex x){
	double temp1 = Math.log10(magnitude(x));
	double temp2 = Math.log10(Math.exp(argand(x)));
	complex z = new complex(temp1, temp2);
	return z;
}

//method to return the natural log of a complex number.
//returns complex z: natural log of this.
public complex log(){
	double temp1 = Math.log(magnitude(this));
	double temp2 = argand(this);
	complex p = new complex(temp1,temp2);
	return p;
}

//method to compute the natural log of a complex number.
//param z: complex argument.
//returns complex p: natural log of z.
public static complex log(complex z){
	double temp1 = Math.log(magnitude(z));
	double temp2 = argand(z);
	complex p = new complex(temp1,temp2);
	return p;
}

//method to compute the natural log of a complex number.
//param z: complex argument.
//returns complex p: natural log of z.
public complex reallogcomplex(double x){
	double temp1 = Math.log(magnitude(this));
	temp1 = temp1/Math.log(x);
	double temp2 = argand(this);
	temp2 = temp2 / Math.log(x);
	complex p =  new complex(temp1, temp2);
	return p;
}

//method to compute log base real of a complex number.
//param x: real base.
//param y: complex argument.
//returns complex p: the log base x of y.
public static complex reallogcomplex(double x, complex y){
	double temp1 = Math.log(magnitude(y));
	temp1 = temp1/Math.log(x);
	double temp2 = argand(y);
	temp2 = temp2 / Math.log(x);
	complex p =  new complex(temp1, temp2);
	return p;
}

//method to compute log base real of a complex number.
//param x: real base.
//returns complex p: the log base x of this.
public complex complexlogreal(double x){//complex base, real argument;
	double temp1 = Math.log(x);
	complex temp2 = new complex();
	temp2 = log(this);
	complex y = new complex();
	y = temp2.complexdividesreal(temp1);
	return y;
}

//method to compute log base complex of a real number.
//param z: complex base.
//param y: real argument.
//returns complex y: the log base z of x.
public static complex complexlogreal(complex z, double x){
	double temp1 = Math.log(x);
	complex temp2 = new complex();
	temp2 = log(z);
	complex y = new complex();
	y = temp2.complexdividesreal(temp1);
	return y;
}

//method to compute log base complex of a real number.
//param z: complex base.
//returns complex y: the log base x of this.
public complex complexlogcomplex(complex x){
	complex temp1 = new complex();
	temp1 = log(x);
	complex temp2 = new complex();
	temp2 = log(this);
	complex y = new complex();
	y = temp1.divide(temp2);
	return y;
}

//method to compute log base complex of a complex number.
//param z: complex base.
//param x: complex argument.
//returns complex y: the log base z of x.
public static complex complexlogcomplex(complex z, complex x){
		complex temp1 = new complex();
	temp1 = log(x);
	complex temp2 = new complex();
	temp2 = log(z);
	complex y = new complex();
	y = temp1.divide(temp2);
	return y;
}
//statistics

//method to compute the mean/midpoint of an ArrayList of complex numbers.
//param p: ArrayList with complex elements.
//returns complex mean: the average of all complex elements in p.
public static complex arithmean(ArrayList<complex> p){
	double suma = 0;
	double sumb = 0;
	for(int i = 0; i < p.size(); i++){
		suma += p.get(i).a;
		sumb += p.get(i).a;
	}
	double meana = suma / p.size();
	double meanb = sumb / p.size();
	complex mean = new complex(meana, meanb);
	return mean;
}
//trig methods
//all trig methods compute in radians.

//method to compute the sin of a complex number.
//returns complex p: the sin of this.
public complex sin(){
double y=this.a;
double x=this.b; 
complex p = new complex();
p.a = (Math.sin(y)*Math.cosh(x));
p.b = (Math.sinh(x)*Math.cos(y));
return p;
}

//method to compute the sin of a complex number.
//param q: complex argument of sin function.
//returns complex p: the sin of q.
public static complex sin(complex q){
double y = q.a;
double x = q.b; 
complex p = new complex();
p.a = (Math.sin(y)*Math.cosh(x));
p.b = (Math.sinh(x)*Math.cos(y));
return p;
}

//method to compute the cos of a complex number.
//returns complex p: the cos of this.
public complex cos(){
double y=this.a;
double x=this.b; 
complex p = new complex();
p.a = (Math.cos(y)*Math.cosh(x));
p.b = (Math.sinh(x)*Math.sin(y))*(-1);
return p;
}

//method to compute the cos of a complex number.
//param q: complex argument of cos function.
//returns complex p: the cos of q.
public static complex cos(complex q){
double y = q.a;
double x = q.b; 
complex p = new complex();
p.a = (Math.cos(y)*Math.cosh(x));
p.b = (Math.sinh(x)*Math.sin(y))*(-1);
return p;
}

//method to compute the tan of a complex number.
//returns complex i: the tan of this.
public complex tan(){
complex p = new complex();
p = sin(this);
complex q = new complex();
q = cos(this);
complex i = new complex();
i = p.divide(q);
return i;
}

//method to compute the tan of a complex number.
//param r: complex argument of tan function.
//returns complex i: the tan of r.
public static complex tan(complex r){
complex p = new complex();
p = sin(r);
complex q = new complex();
q = cos(r);
complex i = new complex();
i = p.divide(q);
return i;	
}

//method to compute the hyperbolic sin of a complex number.
//returns complex p: the hyperbolic sin of this.
public complex sinh(){
complex p = new complex();
double x = this.a;
double y = this.b;
p.a = (Math.sinh(x)*Math.cos(y)); 
p.b = (Math.sin(y)*Math.cosh(x));
return p;
}

//method to compute the hyperbolic sin of a complex number.
//param q: complex argument of hyperbolic sin function.
//returns complex p: the hyperbolic sin of q.
public static complex sinh(complex q){
complex p = new complex();
double x = q.a;
double y = q.b;
p.a = (Math.sinh(x)*Math.cos(y)); 
p.b = (Math.sin(y)*Math.cosh(x));
return p;	
}

//method to compute the hyperbolic cos of a complex number.
//returns complex p: the hyperbolic cos of this.
public complex cosh(){
complex p = new complex();
double x = this.a;
double y = this.b;
p.a = (Math.cosh(x)*Math.cos(y));
p.b = (Math.sinh(x)*Math.sin(y));
return p;
}

//method to compute the hyperbolic cos of a complex number.
//param q: complex argument of hyperbolic cos function.
//returns complex p: the hyperbolic cos of q.
public static complex cosh(complex q){
complex p = new complex();
double x = q.a;
double y = q.b;
p.a = (Math.cosh(x)*Math.cos(y));
p.b = (Math.sinh(x)*Math.sin(y));
return p;	
}

//method to compute the hyperbolic tan of a complex number.
//returns a complex number which is the hyperbolic tan of this.
public complex tanh(){
	return (this.sinh()).divide(this.cosh());
}

//method to compute the hyperbolic tan of a complex number.
//param q: complex argument of hyperbolic tan function.
//returns a complex number which is the hyperbolic tan of p.
public static complex tanh(complex p){
	return (p.sinh()).divide(p.cosh());
}

//method to compute the discriminant of a complex function.
//param p: the coefficient of x^2.
//param q: the coefficient of x.
//param r: the coefficient of 1. (constant).
//returns complex discri: the discriminant of the complex function.
public static complex discri(complex p, complex q, complex r){
 complex discri = new complex();
 discri = (q.multiply(q)).subtract((p.multiply(r)).multiply(4));
 return discri;
}

//method to compute the 1st root of a quadratic equation (discriminant is added).
//param p: the coefficient of x^2.
//param q: the coefficient of x.
//param r: the coefficient of 1. (constant).
//returns complex root1: the 1st root of the function.
public static complex root1(complex p, complex q, complex r){
	complex root1 = new complex();
	complex bneg = new complex();
	bneg = q.multiply(-1);
	complex d = new complex();
	d = root(discri(p,q,r),2);
	root1 = (bneg.add(d));
	root1 = root1.divide(p.multiply(2));
	return root1;
}

//method to compute the 2nd root of a quadratic equation (discriminant is subtracted).
//param p: the coefficient of x^2.
//param q: the coefficient of x.
//param r: the coefficient of 1. (constant).
//returns complex root1: the 2nd root of the function.
public static complex root2(complex p, complex q, complex r){
complex root1 = new complex();
	complex bneg = new complex();
	bneg = q.multiply(-1);
	complex d = new complex();
	d = root(discri(p,q,r),2);
	root1 = (bneg.subtract(d));
	root1 = root1.divide(p.multiply(2));
	return root1;
}

//method to compute the roots of a quadratic equation.
//param p: the coefficient of x^2.
//param q: the coefficient of x.
//param r: the coefficient of 1. (constant).
//returns complex[] print: the roots of the function.
public static complex[] quadratic(complex p, complex q, complex r){
	complex x = new complex();
	x = root1(p, q, r);
	complex y = new complex();
	y = root2(p, q, r);
	complex print[] = new complex[2];
	print[0] = x;
	print[1] = y;
	return print;	
}
}
