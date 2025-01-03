public class Students {
    private String name;
    private String Subjects;
    private double qualifications;

    public String getName(){
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
    public String getSubjects(){
        return Subjects;
    }
    public void setSubjects(String newSubjects) {
        this.Subjects = newSubjects;
    }
    public double getQualifications(){
        return qualifications;
    }
    public void setQualifications(double newQualifications) {
        this.qualifications = newQualifications;
    }





    public static void main(String[] args) {
        Students obj = new Students();
        obj.setName("Jhon Duran");
        obj.setSubjects("Math, Science, History");
        obj.setQualifications(85.5);
        System.out.println(obj.getName());
        System.out.println(obj.getSubjects());
        System.out.println(obj.getQualifications());         
    }
}