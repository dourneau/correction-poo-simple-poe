package formation;

public class ComplexSum {
	
	double real1;
	double imag1;
	double real2;
	double imag2;
	
	public ComplexSum() {}
	
	public ComplexSum(double real1, double imag1, double real2, double imag2) {
		this.real1 = real1;
		this.imag1 = imag1;
		this.real2 = real2;
		this.imag2 = imag2;
	}
	
	public double sommeReal() {
		double sumReal = this.real1+this.real2;
		return sumReal;
	}
	
	public double sommeImag() {
		double sumImag = this.imag1+this.imag2;
		return sumImag;
	}
	

}
