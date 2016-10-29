public class Triangle {
	
	private double _sideA;
	private double _sideB;
	private double _sideC;
	private double _semiperimeter;
	
	//constructor
	public Triangle (double a, double b, double c) {
		
		this._sideA = a;
		this._sideB = b;
		this._sideC = c;
		
		this._semiperimeter = 0.5 * (a + b + c);
		System.out.println("Semiperimeter: " + this._semiperimeter);
		
	}
	
	public double GetArea(){
		
		double area;
		
		//uses heron's formula to calculate the area of this triangle using only its three side lengths (and semiperimeter)
		area = Math.sqrt(this._semiperimeter*( (this._semiperimeter - this._sideA)*(this._semiperimeter - this._sideB)*(this._semiperimeter - this._sideC)));
		
		return area;
		
	}
	
	
	public String GetName() {
		
		//returns the type of triangle (scalene, isoseles, equilateral)
		String name = null;
		
		if(this._sideA == this._sideB){
			
			if(this._sideB == this._sideC){
				name = "equilateral";
			} 
			else {
				name = "isosceles";
			}
		}
		else if (this._sideB == this._sideC){
			
			if(this._sideB == this._sideC){
				name = "isosceles";
			}
			else {
				name = "scalene";
			}
		} else {
			name = "scalene";
		}
		
		return name;
		
	}
	
	protected boolean IsTriangleValid(){
		
		//this function is completely unnecessary as all debugging was done BEFORE the object was created
		//but this function was a part of the requirements for the assignment so i had to include it
		if (this._sideA > 0 && this._sideB > 0 && this._sideC > 0){
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
}
