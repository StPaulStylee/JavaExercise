package refraction.power.sphere;
import refraction.power.Power;
import refraction.range_validator.RangeValidator;

public class SpherePower extends Power {
	
	private final int MIN_VALUE = -25;
	private final int MAX_VALUE = 25;
	private RangeValidator rangeValidator = new RangeValidator();
	
	public SpherePower() {}
	
	public void SetSpherePower(double spherePower) {
		if (!rangeValidator.IsValidRange(spherePower, this.MIN_VALUE, this.MAX_VALUE) || !IsValidPowerValue(spherePower)) {
			return;
		}
		SetPowerValue(spherePower);
	}
}
