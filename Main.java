package threads;

public class Main {

	public static void main(String[] args) {

		Thread[] arrayThread = new Thread[100];

		for (int i = 0; i < 100; i++) {
			arrayThread[i] = new Thread(new CalculateFactorial(i));
			arrayThread[i].start();
		}
	}
}
