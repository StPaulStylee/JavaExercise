package refraction.power_validator;

public abstract class PowerValidator {
	private final double INCREMENT = 0.25;
	
	public boolean IsValidPowerValue(double value) {
		if (value % INCREMENT != 0) {
			return false;
		}
		return true;
	}
}
