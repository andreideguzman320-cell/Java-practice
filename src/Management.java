class Management{
    private String Student;
    private int age;
    private double grade;
    private int studentId;
    Management(String student,int age,double grade,int studentId){
        this.Student = student;
        this.age = age;
        this.grade = grade;
        this.studentId = studentId;
    }
    Management(String Student){
        this.Student=Student;
    }
    public int getAge(){
        return age;
    }

    public int getID(){
        return studentId;
    }
    public String getStudent(){
        return Student;
    }public int getStudentId(){
        return studentId;
    }
    public double getGrade(){
        return grade;
    }public void setGrade(double grade){
        this.grade=grade;
    }

    @Override
    public String toString() {
        return "\n-----------------------------" +
                "\nName:       " + this.getStudent() +
                "\nAge:        " + this.getAge() +
                "\nStudent ID: " + this.getStudentId() +
                "\nGrade:      " + this.getGrade() +
                "\n-----------------------------";
    }
}