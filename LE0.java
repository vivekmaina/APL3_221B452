/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.* ;

public class Juet
{
	int age;
	String name;

	void setter(int age, String name) {
		this.age = age ;
		this.name = name ;
	}

	void getter() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		Juet demo1 = new Juet();
		demo1.setter(20, "Vishwesh Patidar")  ;
		demo1.getter();
	}
}
