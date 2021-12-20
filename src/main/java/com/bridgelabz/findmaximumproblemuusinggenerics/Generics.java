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
		this.w=w;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public T maximum() {
		return Generics.testMaximum(w,x,y,z);
	}
	//determines the largest of three comparable objects
	public static <T extends Comparable<T>> T testMaximum(T w,T x, T y, T z) {
		T max=w; //assume w is initialy the largest
	if (x.compareTo(max)>0) {
			max=x; //x is the largest so far
		}
	if (y.compareTo(max)>0) {
		max=y; //y is the largest so far
	}
	if (z.compareTo(max)>0) {
		max=z; //z is the largest so far
	}
	printMax(w,x,y,z,max);
	return max; // return the largest object
	}
	//determines the largest of three comparable objects
	public static String testMaximum(String w, String x, String y, String z) {
		String max=w; //initially x is greater
		if (x.compareTo(max)>0) {
			max=x; //x is the largest so far
		}
		if (y.compareTo(max)>0) {
			max=y; //y is the largest so far
		}
		if (z.compareTo(max)>0) {
			max=z; //z is the largest so far
		}
		printMax(w,x,y,z,max);
	    return max;
	}
	public static <T>void printMax(T w, T x, T y, T z, T max){
	System.out.printf("Max of %s, %s ,%s and %s is %s\n",w,x ,y ,z,max);
	}
public static void main(String[] args) {
	System.out.println("Welcome to Generic maximum test");
	Integer wInt=1, xInt=2,yInt=3,zInt=4;
	Float wf1=0.1f, xf1=1.1f,yf1=1.2f,zf1=1.3f;
	String wStr="Cocacola", xStr="Apple", yStr="Peach", zStr= "Banana";
	new Generics<>(wInt,xInt, yInt, zInt).maximum();	
	new Generics<>(wf1,xf1, yf1, zf1).maximum();
	new Generics<>(wStr,xStr, yStr, zStr).maximum();
}
}