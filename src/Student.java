import java.util.ArrayList;

class Student{
    private ArrayList<Integer> grades=new ArrayList<>();
    String name;
    int studentID;
    Student(String name,int studentID){
        this.name=name;
        this.studentID=studentID;
    }


    public String getName(){
        return name;
    }
    public int getID(){
        return studentID;
    }
    public void addGrade(int grade){
        if (grade<0){
            throw new IllegalArgumentException("Grade cannot be a negative number");
        }
        if (grade>100){
            throw new IllegalArgumentException("Grade cannot exceed 100");
        }
        grades.add(grade);
    }

    public double computeGrade(){
        int sum = 0;

        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Grade is empty");
        }
        for (int s : grades) {
            sum += s;
        }
        return (double) sum / grades.size();
    }



    @Override
    public String toString(){
        double avg = computeGrade();
        return name + " | ID: " + studentID + " | Average: " + avg + " | " + (avg >= 75 ? "PASSED" : "FAILED");
    }
}