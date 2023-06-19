package day30;

/*
Q3. Class Circle

Problem Description


Construct a class Circle that represents a Circle.

The class should support the following functionalities:-

perimeter() -> returns the perimeter of the circle
area() -> returns the area of the circle

Note: Assume Π (pi) = 3.14 for calculations.

Input Format:

First argument A is an integer representing the number of testcases.
For each case, the radius r is taken as input in new line.
Output Format:

The perimeter and area of the constructed circle is printed.
 */
class Circle {
    // Define properties here
    float radius ;
    
    
    // Define constructor here
    Circle(int x){
        radius = x;
    }


    float perimeter(){
		// Complete the function
        float ans = (float)(2 * 3.14 * radius);
        return ans;
		
	}
	
	float area(){
		// Complete the function
        float ans = (float)(3.14 * radius * radius);
        return ans;
		
	}
}

/*
    Circle a = new Circle(3)  // Radius = 3
	a.perimeter() // 18.84
    a.area() // 28.26
*/
public class ClassCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(3);  // Radius = 3
		System.out.println(a.perimeter()); // 18.84
		System.out.println(a.area()); // 28.26

	}

}
