package lab1;
import java.util.ArrayList;

public class Lab1 {
	
	public static String getMyID() {
		return "220179446";
	}
	
	public static String getLetterGrade(double grade) {
        if (grade >= 90) {
            return "A+";
        } else if (grade >= 80) {
            return "A";
        } else if (grade >= 75) {
            return "B+";
        } else if (grade >= 70) {
            return "B";
        } else if (grade >= 65) {
            return "C+";
        } else if (grade >= 60) {
            return "C";
        } else if (grade >= 55) {
            return "D+";
        } else if (grade >= 50) {
            return "D";
        } else if (grade >= 45) {
            return "E";
        } else {
            return "F";
        }
    }
	
	public static double addAndChangeScale(ArrayList<Double> grades) {
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        return Math.round((average / 10) * 100.0) / 100.0; // Scale to 10 and round to 2 decimal places
    }
	
	 public static void main(String[] args) {
	        // Test Method 1
	        System.out.println("My ID: " + getMyID());

	        // Test Method 2
	        System.out.println("Letter Grade for 85: " + getLetterGrade(85));
	        System.out.println("Letter Grade for 72: " + getLetterGrade(72));

	        // Test Method 3
	        ArrayList<Double> grades = new ArrayList<>();
	        grades.add(90.0);
	        grades.add(95.0);
	        grades.add(100.0);
	        System.out.println("Average on scale of 10: " + addAndChangeScale(grades));
	    }

}
