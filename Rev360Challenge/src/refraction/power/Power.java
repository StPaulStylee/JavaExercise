package refraction.power;
import refraction.power_validator.PowerValidator;

public class Power extends PowerValidator {
	private double powerValue;
	
	public void SetPowerValue(double powerValue) {
		this.powerValue = powerValue;
	}
	
	public double GetPowerValue() {
		return this.powerValue;
	}
	
}
