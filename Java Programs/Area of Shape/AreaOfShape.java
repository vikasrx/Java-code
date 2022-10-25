package abstractpack;

public class AreaOfShape extends AbstractArea {

	@Override
	double areaOfReactangle(int length, int breadth) {
		double result = length * breadth;
		return result;
	}

	@Override
	double areaOfCircle(int radius) {
		double result = 3.14 * radius * radius;
		return result;
	}

	@Override
	double areaOfSquare(int side) {
		double result = side * side;
		return result;
	}

}
