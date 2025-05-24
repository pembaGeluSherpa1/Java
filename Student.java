class Student {
    String naam;
    int rollNo;
    int id;
    int sems;

    Student(String name, int roll,int iD,int sem) {
        naam = name;
        rollNo = roll;
        id = iD;
        sems = sem;
    }

    void print(){
        System.out.println("Id: "+id+", Name: "+naam+", Roll-no: "+rollNo+", sems: "+sems);
    }
}