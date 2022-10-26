package threads;

import java.math.BigInteger;

public class CalculateFactorial implements Runnable {

	private int num;
	private BigInteger factorialSum = BigInteger.ZERO;

	public CalculateFactorial(int number) {
		super();
		this.num = number;
	}

	public int getNumber() {
		return num;
	}

	public BigInteger getFactorialSum() {
		return factorialSum;
	}

	public BigInteger calculateFactorial(int number) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i <= number; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}

	@Override
	public void run() {

		Thread thr = Thread.currentThread();
		System.out.println("Thread-" + this.num + " факториал " + this.num + " != " + calculateFactorial(this.num));
	}
}
