package javaPrgm;

import java.util.Scanner;
import Package1.Geometry;

public class Mainfiles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Geometry g = new Geometry();
		int r,h;
		
		System.out.println("Please Enter the Radius and Height of a Cone : ");
		r = sc.nextInt();
		h = sc.nextInt();
		g.Cone(r,h);

		System.out.println("Please Enter the radius of a Sphere : ");
		r = sc.nextInt();
		g.Sphere(r);
		

		System.out.println("Please Enter the Radius and Height of a Cylinder : ");
		r = sc.nextInt();
		h = sc.nextInt();
		g.Cylinder(r,h);
	}

}
