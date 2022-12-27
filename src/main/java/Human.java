// class for human
public class Human {
    private int ID;
    private String name;
    private String sex;
    private Division unit;
    private double salary;
    private String birth;
    
    // constructors
    public Human(){}
    public Human(int _ID, String _name, String _sex, String _unit, double _salary, String _birth)
    {
        ID = _ID;
        name = _name;
        sex = _sex;
        unit = new Division(_unit);
        salary = _salary;
        birth = _birth;
    }

    // prints human
    public void println()
    {
        System.out.println("ID: " + ID + "\nName: " + name + "\nSex: " + sex);
        unit.println();
        System.out.println("Salary: " + salary + "\nBirthday: " + birth);
        System.out.println();
    }
}

