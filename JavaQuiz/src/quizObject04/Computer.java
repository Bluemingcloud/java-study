package quizObject04;

public class Computer extends Calculator {
	
	double circle(int r) {
		return r * r * Math.PI;
	}
	double rect(double l) {
		return l * l;
	}
	double rect(double a, double b) {
		return a * b;
	}
	double rect(double a, double b, double c) {
		return a * b * c;
	}
}
