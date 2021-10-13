package formation;


public class Point {
	double x;
	double y;
	
	public Point() {}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		
		
	}
	
	public double distance(Point point) {
		double deltaX = this.x-point.x;
		double deltaY = this.y-point.y;
		double result = Math.sqrt(deltaX*deltaX+deltaY*deltaY);
		return result;
	}

	
	

}
