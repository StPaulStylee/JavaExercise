package refraction.range_validator;

public class RangeValidator {
	
	public boolean IsValidRange(double powerValue, double minimumValue, double maximumValue) {
		if (powerValue < minimumValue || powerValue > maximumValue) {
			return false;
		}
		return true;
	}
}
