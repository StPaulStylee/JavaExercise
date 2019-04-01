package refraction.cylinder;

import refraction.power.Power;

public class CylinderPower extends Power {
	private String notationType;
	private double MIN_VALUE;
	private double MAX_VALUE;
	
	public CylinderPower(String type, double minValue, double maxValue) {
		this.notationType = type;
		this.MIN_VALUE = minValue;
		this.MAX_VALUE = maxValue;
	}
	
	public void SetNotationType(String notationType) {
		this.notationType = notationType;
	}
	
	public String GetNotationType() {
		return this.notationType;
	}
	
	public void SetMinimumValue(double minValue) {
		this.MIN_VALUE = minValue;
	}
	
	public double GetMinimumValue() {
		return this.MIN_VALUE;
	}
	
	public void SetMaximumValue(double maxValue) {
		this.MAX_VALUE = maxValue;
	}
	
	public double GetMaximumValue() {
		return this.MAX_VALUE;
	}
}
