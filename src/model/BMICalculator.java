package model;

public class BMICalculator {
	private double weight;
	private double height;
	private int bmi;
	private final double BMI_FACTOR = 705;

	public BMICalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getBmi() {
		return bmi;
	}

	public void setBmi(int bmi) {
		this.bmi = bmi;
	}

	public void calcBMI() {
		double weight = getWeight();
		double height = getHeight();
		// int bmi = ((weight/(height*height))*BMI_FACTOR);
		int bmi = (int) ((weight/(height*height)) * BMI_FACTOR);
		setBmi(bmi); 
	}
	
	public void calcWeight() {
		double bmi = getBmi();
		double height = getHeight();
		// int bmi = ((weight/(height*height))*BMI_FACTOR);
		int weight = (int) (  (bmi/BMI_FACTOR) * (height*height) );
		setWeight(weight); 
	}

	@Override
	public String toString() {
		return "BMICalculator [weight=" + weight + ", height=" + height + ", bmi=" + bmi + "]";
	}

}
