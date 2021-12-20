package com.bridgelabz.findmaximumproblemuusinggenerics;
public class Generics <T extends Comparable <T>>{
	T w,x,y,z;
	/**
	 * @param w
	 * @param x
	 * @param y
	 * @param z
	 */
	public Generics(T w, T x, T y, T z) {
		super();
		this.w = w;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public static <T extends Comparable<T>> T maximum(T w,T x, T y, T z) {
	    T max = w; // assume w is initially the largest
	    if (x.compareTo(max) > 0)
	      max = x; // x is the largest so far
	    if (y.compareTo(max) > 0)
		      max = y; // y is the largest so far
	    if (z.compareTo(max) > 0)
	      max = z; // z is the largest

	    return max; // returns the largest object
	  } // end method maximum
	  public static void main(String args[]) {
	    System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4,15, 5, maximum(3, 4,15, 5));
	    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6,8.8,10.5,7.7));
	    System.out.printf("Maximum of %s, %s and %s is %s\n", "Apple", "Peach", "Banana","Cocacola", maximum(
	        "Apple", "Peach", "Banana","Cocacola"));
	  }
	}