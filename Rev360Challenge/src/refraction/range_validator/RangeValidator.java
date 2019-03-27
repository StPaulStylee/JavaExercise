package refraction.range_validator;

public class RangeValidator {
	private double minimumValue, maximumValue;
	
	public RangeValidator(double minValue, double maxValue) {
		this.minimumValue = minValue;
		this.maximumValue = maxValue;
	}
	
	public boolean IsValidRange(double powerValue) {
		if (powerValue < this.minimumValue || powerValue > this.maximumValue) {
			return false;
		}
		return true;
	}
}
