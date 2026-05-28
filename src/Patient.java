public class Patient {
    String name;
    int ID;
    int age;


    Patient(String name,int ID,int age){
        this.name=name;
        this.ID=ID;
        this.age=age;


    }
    public String getName(){
        return name;
    }
    public int getID(){
        return ID;
    }
    public int getAge(){
        return age;
    }


    @Override
    public String toString(){
        return "NAME: "+name+" | ID: "+ID+" | AGE: "+age ;
    }


}
