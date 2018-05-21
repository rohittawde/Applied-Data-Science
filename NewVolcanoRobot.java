// Practicing codes from SAMS Teach Yourself JAVA in 21 days
class NewVolcanoRobot {
	String status;
	int speed;
	float temperature;

	void checkTemperature() {
		if (temperature > 660) {
			status = "returning home";
			speed = 5;
		}
	}

	void showAttributes() {
		System.out.println("Status: " + status);
		System.out.println("Speed: " + speed);
		System.out.println("Temperature: " + temperature);
	}

	public static void main (String[] arguments) {
		NewVolcanoRobot dante = new NewVolcanoRobot();
		dante.status = "exploring";
		dante.speed = 3;
		dante.temperature = 550;

		System.out.println("\n Dante");
		dante.showAttributes();

		System.out.println("Changing temperature to 670 K");
		dante.temperature = 670;

		System.out.println("Checking temperature");
		dante.checkTemperature();

		System.out.println("\n Dante");
		dante.showAttributes();

		NewVolcanoRobot vigil = new NewVolcanoRobot();
		vigil.status = "coding on a Mac";
		vigil.speed = 5;
		vigil.temperature = 97;
		vigil.showAttributes();
	}
}
