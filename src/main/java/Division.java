// class for division

public class Division {
    private int ID;
    private String title;
    private static int counter = 1;
    
    
    // constructors
    public Division(int _ID, String _title)
    {
        ID = _ID;
        title = _title;
    }
    
    public Division(String _title)
    {
        ID = 1+(counter++)%26;
        title = _title;
    }
    
    // prints id and title of division
    public void println()
    {
        System.out.println("Unit ID: " + ID + "\nUnit title: " + title);
    }
}
