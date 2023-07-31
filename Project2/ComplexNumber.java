package coe318.lab2;
/**
* ComplexNumber models a complex number expressed
* in rectangular form (real and imaginary parts).
 
* It is an <em>immutable</em> object.
*
* @author Reza Aablue
*/
public class ComplexNumber {
 //Instance variable declarations
 /**
 * Construct a ComplexNumber given its
 * real and imaginary parts. - DONE.
 * @param re The real component
 * @param im The imaginary component
 */
    double realPart;
    double imaginaryPart;
    
 public ComplexNumber(double re, double im) {
 //Initialize the instance variables - DONE.
    realPart=re;
    imaginaryPart=im;
 }
 /**
 * Returns the real component.
 * @return the real
 */
 
 public double getReal() {
 return realPart; //A stub: to be fixed - DONE and FIXED.
 }
 /**
 * Returns the imaginary component.
 * @return the imaginary
 */
 public double getImaginary() {
 return imaginaryPart; //A stub: to be fixed - DONE and FIXED.
 }
 /**
 * Returns a new ComplexNumber number that is
 * the negative of <em>this</em>. Note: the
 * original ComplexNumber is <b>NOT</b>
 * modified.
 * @return -this
 */
 public ComplexNumber negate() {
 return new ComplexNumber((-1)*realPart, (-1)*imaginaryPart); //A stub: to be fixed - FIXED and DONE.
 }
 /**
 * Returns a new ComplexNumber that is the
 * sum of <em>this</em> and <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @param c
 * @return this + z
 */
 public ComplexNumber add(ComplexNumber z) {
 ComplexNumber d;
 d = new ComplexNumber(realPart+z.getReal(), imaginaryPart+z.getImaginary());
return d;//A stub: to be fixed - FIXED and DONE.
 }
 /**
 * Returns a new ComplexNumber that is the
 * difference of <em>this</em> and <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this + z
 */
 public ComplexNumber subtract(ComplexNumber z) {
 ComplexNumber e;
 e = new ComplexNumber (realPart-z.getReal(), imaginaryPart-z.getImaginary());
 return e; //A stub: to be fixed - FIXED and DONE.
 }
 /**
 * Returns a new ComplexNumber that is the
 * product of <em>this</em> and <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this * z
 */
 public ComplexNumber multiply(ComplexNumber z) {
 ComplexNumber h;
 double realSection, imaginarySection;
 realSection = ((realPart*z.getReal())-(imaginaryPart*z.getImaginary()));
 imaginarySection = ((realPart*z.getImaginary())+(imaginaryPart*z.getReal()));
 
 h = new ComplexNumber (realSection, imaginarySection);
 return h; //A stub: to be fixed - FIXED AND DONE.
 }
 /**
 * Returns a new ComplexNumber that is
 * the reciprocal of <em>this</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @return 1.0 / this
 */
 public ComplexNumber reciprocal() {
 
 ComplexNumber f, divisor, divisorConj;
 double productOfDivisorAndDivisorconj, fReal, fImag;
 divisor = new ComplexNumber (realPart, imaginaryPart);
 divisorConj = new ComplexNumber (realPart, (-1)*imaginaryPart);
 productOfDivisorAndDivisorconj = ((divisor.getReal()*divisorConj.getReal())-(divisor.getImaginary()*divisorConj.getImaginary()));
 fReal = (divisorConj.getReal())/productOfDivisorAndDivisorconj;
 fImag = (divisorConj.getImaginary())/productOfDivisorAndDivisorconj;
 
 f = new ComplexNumber (fReal, fImag);
 return f; //A stub: to be fixed - FIXED and DONE.
 }
 /**
 * Returns a new ComplexNumber that is
 * <em>this</em> divided by <em>z</em>.
 * Note: the original ComplexNumber is
 * <b>NOT</b> modified.
 * @param z
 * @return this / z
 */
 public ComplexNumber divide(ComplexNumber z) {
 ComplexNumber cConj, g;
 cConj = new ComplexNumber (z.getReal(), (-1)*z.getImaginary());
 double gReal, gImag;
 
 gReal = ((realPart*cConj.getReal())-(imaginaryPart*cConj.getImaginary()))/((z.getReal()*cConj.getReal())-(z.getImaginary()*cConj.getImaginary()));
 gImag = (((realPart*cConj.getImaginary())+(imaginaryPart*cConj.getReal()))/((z.getReal()*cConj.getReal())-(z.getImaginary()*cConj.getImaginary())));
 g = new ComplexNumber (gReal, gImag);
 return g; // - FIXED and DONE.
 }
 /**
 * Returns a String representation of
 * <em>this</em> in the format:
 * <pre>
 * real +-(optional) i imaginary
 * </pre>
 * If the imaginary part is zero, only the
 * real part is converted to a String.
 * A "+" or "-" is placed between the real
 * and imaginary parts depending on the
 * the sign of the imaginary part.
 * <p>
 * Examples:
 * <pre>
 * ..println(new ComplexNumber(0,0); -> "0.0"
 ComplexNumber
 * ..println(new ComplexNumber(1,1); -> "1.0 + i1.0"
 * ..println(new ComplexNumber(1,-1); -> "1.0 - i1.0"
 * </pre>
 * @return the String representation.
 */
 @Override
 public String toString() {
 //DO NOT MODIFY THIS CODE!
 String str = "" + this.getReal();
 if (this.getImaginary() == 0.0) {
 return str;
 }
 if (this.getImaginary() > 0) {
 return str + " + i" + this.getImaginary();
 } else {
 return str + " - i" + -this.getImaginary();
 }
 }
}