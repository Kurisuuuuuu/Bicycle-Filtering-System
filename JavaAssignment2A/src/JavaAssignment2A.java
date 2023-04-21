import java.util.Scanner;

public class JavaAssignment2A {

    public static void main(String[] args) {
        
        // User inputs
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String inputName = scan.nextLine();
        System.out.print("Enter student's faculty: ");
        String inputFaculty = scan.nextLine();
        System.out.print("Enter student's year: ");
        String inputYear = scan.nextLine();
        System.out.print("Enter student's grades: ");
        String inputGrades = scan.nextLine();
        System.out.print("\n");        
        System.out.println(inputName + " - " + inputFaculty + " - " + inputYear);
                
        Student student = new Student(inputName, inputFaculty, inputYear, inputGrades);
        
        int[] gradesInt = student.ConvertGradesToInt(inputGrades);
        double wam = student.CalculateWam(gradesInt);
        int[] gradesList = student.listingGrades(gradesInt);
        
        
        if (wam % 1 == 0) {
            
            System.out.println("WAM: " + Math.round(wam));
        }
        else {
            
            System.out.println("WAM: " + String.format("%.2f", wam));
        }
        
        
        System.out.println(gradesList[0] + " x F");
        System.out.println(gradesList[1] + " x P");
        System.out.println(gradesList[2] + " x C");
        System.out.println(gradesList[3] + " x D");
        System.out.println(gradesList[4] + " x HD");
        
        /*
        
        // Converting grades to integers
        String[] gradesStr = inputGrades.split(",");
        int[] gradesInt = new int[gradesStr.length];
        double wam = 0;
        
        for (int i = 0; i < gradesStr.length; i++) {
            
            gradesInt[i] = Integer.parseInt(gradesStr[i]);
            
            wam = wam + gradesInt[i];
            
            if (i == gradesStr.length - 1) {
                
                wam = wam / gradesStr.length;
            }
        }
        
        
        if (wam % 1 == 0) {
            
            System.out.println("WAM: " + Math.round(wam));
        }
        else {
            
            System.out.println("WAM: " + String.format("%.2f", wam));
        }
        
        
        // Listing grades
        int fail = 0;
        int pass = 0;
        int cred = 0;
        int dist = 0;
        int highDist = 0;
        
        for (int i = 0; i < gradesInt.length; i++) {
            
            if (gradesInt[i] < 50) {
                
                fail++;
            }
            else if (gradesInt[i] >= 50 && gradesInt[i] < 65) {
                
                pass++;
            }
            else if (gradesInt[i] >= 65 && gradesInt[i] < 75) {
                
                cred++;
            }
            else if (gradesInt[i] >= 75 && gradesInt[i] < 85) {
                
                dist++;
            }
            else if (gradesInt[i] >= 85) {
                
                highDist++;
            }
        }
        
        System.out.println(fail + " x F");
        System.out.println(pass + " x P");
        System.out.println(cred + " x C");
        System.out.println(dist + " x D");
        System.out.println(highDist + " x HD");

        */
    }
}