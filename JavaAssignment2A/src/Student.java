public class Student {
    
    private String name;
    private String faculty;
    private String year;
    private String grades;
    
    public Student (String name, String faculty, String year, String grades) {
        
        this.name = name;
        this.faculty = faculty;
        this.year = year;
        this.grades = grades;
    }

    public String getName() {
        
        return name;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public String getFaculty() {
        
        return faculty;
    }

    public void setFaculty(String faculty) {
        
        this.faculty = faculty;
    }

    public String getYear() {
        
        return year;
    }

    public void setYear(String year) {
        
        this.year = year;
    }

    public String getGrades() {
        
        return grades;
    }

    public void setGrades(String grades) {
        
        this.grades = grades;
    }
    
    
    public int[] ConvertGradesToInt(String grades) {
        
        String[] gradesStr = grades.split(",");
        int[] gradesInt = new int[gradesStr.length];
        
        for (int i = 0; i < gradesStr.length; i++) {
            
            gradesInt[i] = Integer.parseInt(gradesStr[i]);
        }
        
        return gradesInt;
    }
    
    public double CalculateWam(int[] grades) {
        
        double wam = 0;
        
        for (int i = 0; i < grades.length; i++) {
            
            wam = wam + grades[i];
            
            if (i == grades.length - 1) {
                
                wam = wam / grades.length;
            }
        }
        
        return wam;
    }
    
    public int[] listingGrades(int[] grades) {
        
        int[] gradesList = new int[5];
        
        for (int i = 0; i < grades.length; i++) {
            
            if (grades[i] < 50) {
                
                gradesList[0]++;
            }
            else if (grades[i] >= 50 && grades[i] < 65) {
                
                gradesList[1]++;
            }
            else if (grades[i] >= 65 && grades[i] < 75) {
                
                gradesList[2]++;
            }
            else if (grades[i] >= 75 && grades[i] < 85) {
                
                gradesList[3]++;
            }
            else if (grades[i] >= 85) {
                
                gradesList[4]++;
            }
        }
        
        return gradesList;
    }
}
