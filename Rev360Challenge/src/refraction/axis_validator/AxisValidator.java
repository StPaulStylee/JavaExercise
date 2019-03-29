package refraction.axis_validator;

public abstract class AxisValidator {	
	private final int MIN_BOUND = -179;
	private final int MAX_BOUND = 360;
	private final int MIN_DEGREE = 1;
	private final int MAX_DEGREE = 180;
	private final int ADJUST_VALUE = 180;
	
	private boolean isValidAxis(int axisValue) {
		if (axisValue < this.MIN_BOUND || axisValue > this.MAX_BOUND) {
			return false;
		}
		return true;
	}
	
	public int SetAxis(int axisValue) {
		if (!isValidAxis(axisValue) ) {
			return 0;
		}
		
		if (axisValue <= this.MAX_DEGREE && axisValue >= this.MIN_DEGREE) {
			return axisValue;
		} else if (axisValue < this.MIN_DEGREE) {
			int adjustValue = axisValue + this.ADJUST_VALUE;
			return adjustValue;
		} else {
			int adjustValue = axisValue - this.ADJUST_VALUE;
			return adjustValue;
		}
	}
}
