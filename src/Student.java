public class Student {
    String name;
    double examScore;
    double attendanceRate;

    public Student(String name, double examScore, double attendanceRate) {
        this.name = name;
        this.examScore = examScore;
        this.attendanceRate = attendanceRate;
    }

    public boolean hasPassed(){
        return examScore >= 50.0;
    }

    public void printReport(){
        if(hasPassed()){
            System.out.println("Student name: "+ name+ " Score: "+ examScore+ " PASS");
        }else{
            System.out.println("Student name: "+ name+ " Score: "+ examScore+ " FAILED");
        }
    }

}
