public class Workshop1 {

    public static double calculateAverageScore(Student[] classroom){
        double sum = 0;

        for (int i = 0; i < classroom.length ; i++) {
                sum += classroom[i].examScore;

        }
            return sum / classroom.length;
    }


    public static Student findTopStudent(Student[] classroom){
        Student top = classroom[0];

        for (int i = 0; i < classroom.length; i++) {

            if(classroom[i].examScore > top.examScore){
                top = classroom[i];
            }

        }
        return top;

    }




    static void main(String[] args) {

        Student[] classroom = {
                new Student("Billy", 15.23, 0.75),
                new Student("Isak", 74, 0.3),
                new Student("Anton", 53.23, 0.78),
                new Student("Dante", 43, 0.6),
                new Student("Emma", 89,0.99)
        };

        int passedCount = 0;

        for (int i = 0; i < classroom.length; i++) {
            classroom[i].printReport();
            if(classroom[i].hasPassed()){
                passedCount++;
            }

        }

        System.out.println("Total passed students: " + passedCount);
        System.out.println("Class average score: " + calculateAverageScore(classroom));

        Student top = findTopStudent(classroom);

        System.out.println("Best results: " +top.name);

    }
}
