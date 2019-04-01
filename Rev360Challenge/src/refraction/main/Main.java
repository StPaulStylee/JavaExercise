package refraction.main;
import java.util.InputMismatchException;
import java.util.Scanner;
import refraction.power.sphere.SpherePower;
import refraction.cylinder.CylinderPower;
import refraction.axis.Axis;

public class Main {
	
	static SpherePower spherePower = new SpherePower();
	static CylinderPower cylinderPower;
	static Axis Axis;
	static Scanner inputManager = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean isValidCylinderType= false;
		boolean isValidCylinderPower= false;
		boolean isValidSpherePower = false;
		boolean isValidAxisInt = false;
		
		System.out.println("Press 0 to enter in MINUS-CYLINDER NOTATION or press 1 to enter in PLUS-CYLINDER NOTATION");
		// Set the cylinder Type
		while (!isValidCylinderType) {
			if (inputManager.hasNextInt()) {
				if (inputManager.nextInt() == 0 || inputManager.nextInt() == 1) {
					isValidCylinderTypeInt = true;
					SetCylinderType(inputManager.nextInt());
				}
			}
		}
		
		// Set Cylinder Power
		inputManager.reset();
		System.out.println("Please enter CYLINDER power. Be certain the value is divisible by 0.25 (increments of 0.25).");
		while(!isValidCylinderPower) {
			if (inputManager.hasNextDouble()) {
				if (cylinderPower.IsValidPowerValue(inputManager.nextDouble())) {
					isValidCylinderPower = true;
					cylinderPower.SetPowerValue(inputManager.nextDouble());
				}
			}
		}
		
		inputManager.reset();
		// Set Sphere Power
		System.out.println("Please enter SPHERE power. Be certain the value is divisible by 0.25 (increments of 0.25).");
		while(!isValidSpherePower) {
			if (inputManager.hasNextDouble()) {
				if (spherePower.IsValidPowerValue(inputManager.nextDouble())) {
					// YOU HAVE LEFT OFF HERE. YOU WERE WONDERING WHAT YOU WROTE AND WHY YOU WROTE IT
				}
			}
		}
	}
	
	private static void SetCylinderType(int typeValue) {
 		if (typeValue == 0) {
 			cylinderPower = new CylinderPower("minus", -15.00, 0.00);
 		} else {
 	 		cylinderPower = new CylinderPower("plus", 0.00, 15.00);
 		}
	}

}
