package com.bridgelabz.findmaximumproblemuusinggenerics;
public class Generics <T extends Comparable <T>>{
	T x,y,z;
	/**
	 * @param x
	 * @param y
	 * @param z
	 */
	public Generics(T x, T y, T z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public T maximumToInt() {
		return Generics.maximumToInt(x,y,z);
	}
	//determines the largest of three comparable objects
	public static <T extends Comparable<T>> T maximumToInt(T x, T y, T z) {
		T max=x; //assume x is initialy the largest
	if (y.compareTo(max)>0) {
		max=y; //y is the largest so far
	}
	if (z.compareTo(max)>0) {
		max=z; //z is the largest so far
	}
	printMax(x,y,z,max);
	System.out.println(max);
	return max;// return the largest object
	}
	public T maximumToFloat() {
		return Generics.maximumToFloat(x,y,z);
	}
	//determines the largest of three comparable objects
	public static <T extends Comparable<T>> T maximumToFloat(T x, T y, T z) {
		T max=x; //assume x is initialy the largest
	if (y.compareTo(max)>0) {
		max=y; //y is the largest so far
	}
	if (z.compareTo(max)>0) {
		max=z; //z is the largest so far
	}
	printMax(x,y,z,max);
	System.out.println(max);
	return max;// return the largest object
	}
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; // assume x is initially the largest

	    if (y.compareTo(max) > 0)
	      max = y; // y is the largest so far

	    if (z.compareTo(max) > 0)
	      max = z; // z is the largest

	    return max; // returns the largest object
	  } // end method maximum
	public static <T>void printMax(T x, T y, T z, T max){
	System.out.printf("Max of %s ,%s and %s is %s\n",x ,y ,z,max);
	}
public static void main(String[] args) {
	System.out.println("Welcome to Generic maximum test");
	Integer wInt=1, xInt=2,yInt=3,zInt=4;
	Float wf1=0.1f, xf1=1.1f,yf1=1.2f,zf1=1.3f;
	String xStr="Apple", yStr="Peach", zStr= "Banana";
	new Generics<>(xInt, yInt, zInt).maximumToInt();	
	new Generics<>(xf1, yf1, zf1).maximumToFloat();
	System.out.printf("Maximum of %s, %s and %s is %s\n", "Apple", "Peach", "Banana", maximum(
	        "Apple", "Peach", "Banana"));

}
}
