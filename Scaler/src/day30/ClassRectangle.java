package day30;

/*
Q4. Class Rectangle

Problem Description

Construct a class Rectangle that represents a rectangle.

The class should support the following functionalities:-

perimeter() -> returns the perimeter of the rectangle
area() -> returns the area of the rectangle
Input format:

First argument A is an integer representing the number of testcases.
For each case, x (length) and y (breadth) are taken as input in new line.
Output format:

The perimeter and area of the constructed rectangle are printed.
 */

class Rectangle {
    // Define properties here
    int length ;
    int width;
    
    
    // Define constructor here
    Rectangle(int x,int y){
        this.length = x;
        this.width = y;
    }


    int perimeter(){
		// Complete the function
        return 2 * (length+width);
		
	}
	
	int area(){
		// Complete the function
        return length*width;
		
	}
}

/*
    Rectangle a = new Rectangle(2, 3)  // Length = 2, Breadth = 3
	a.perimeter() // Should give 10
    a.area() // Should give 6
*/

public class ClassRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle(2, 3);  // Length = 2, Breadth = 3
		System.out.println(a.perimeter()); // Should give 10
		System.out.println(a.area()); // Should give 6

	}

}
