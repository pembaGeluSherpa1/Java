package StudentManagement.people;

public class Person {
    public String name;
    public int age;
    private int NationalId;    
    
    public Person(String name, int age, int NationalId){
        this.name = name;
        this.age = age;
        this.NationalId = NationalId;
    }

    public void PersonalData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("National id: "+ NationalId);
    }

}
