package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) throws IllegalRectangle {
		if (int newx || int newy < 0){
			throw new IllegalRectangle("X and Y cannot be negative");
			else 
				System.out.println("Input is valid!");
		}
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}

}
