
public class Student {

    private int Id;
    private String Name;
    private double Marks;

    public Student(int Id, String Name, double Marks){
        this.Id = Id;
        this.Name = Name;
        this.Marks = Marks;
    }

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }

    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name = Name;
    }

    public double getMarks(){
        return Marks;
    }
    public void setMarks(double Marks){
        this.Marks = Marks;
    }

    public void display(){
        System.out.printf("%-10d %-20s %-10.2f\n", Id, Name, Marks);
    }

}
