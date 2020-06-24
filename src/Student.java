public class Student extends  Person{
    int sem;
    double fee;

    Student()
    {}

    public Student(int sem, double fee) {
        this.sem = sem;
        this.fee = fee;
    }

    public Student(int id, String name, String cnic, int sem, double fee) {
        super(id, name, cnic);
        this.sem = sem;
        this.fee = fee;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{\n" +super.toString()+
                "\nSem = " + sem +
                "\nFee = " + fee +
                "\n}";
    }
}
