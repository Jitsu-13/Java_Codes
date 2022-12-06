public class _6InstanceOfWeProblem {
    // Person{} has two subtypes
    // professional : wfh();
    //student:goToCollege();
    //takePerson(Person person);
    // check using instanceof;
    public static void main(String[] args) {
        takePerson(new Professional());
        takePerson(new Student());
    }
    static  void takePerson(Person person){
        if(person instanceof Professional){
            Professional prof =(Professional) person;
            prof.wfh();
        }
        if(person instanceof Student){
            Student stud =(Student) person;
            stud.goTOCollege();
        }
    }
}
class Person{}
class Professional extends Person{
    void wfh(){
        System.out.println("wfh");
    }
}
class Student extends Person{
    void goTOCollege(){
        System.out.println("gocollege");
    }
}
