package refraction.axis;
import refraction.axis_validator.AxisValidator;

public class Axis extends AxisValidator {
	private int AxisValue;
	
	public Axis(int axisValue) {
		this.AxisValue = SetAxis(axisValue);
	}
	
	public int GetAxisValue() {
		return this.AxisValue;
	}
	
	public void SetAxisValue(int axisValue ) {
		this.AxisValue = SetAxis(axisValue);
	}
}
