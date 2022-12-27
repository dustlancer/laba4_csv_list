import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter path to csv: ");
        String path = in.nextLine();
        System.out.println("Enter separator: "); // absolute path
        char separator = in.next().charAt(0);
        ArrayList<Human> fList = csvToList(path, separator);
        int size = fList.size();
        for (int i = 0; i < size; i++) { fList.get(i).println(); }
        in.close();
        
    }

    static ArrayList<Human> csvToList(String path, char separator) {
        
        ArrayList<Human> fileL = new ArrayList<>();

        File file = new File("foreign_names.csv");
        try (BufferedReader fLine = new BufferedReader(new FileReader(file))) {
            String line = fLine.readLine();
            while ((line = fLine.readLine()) != null) {
                int length = line.length(), cellType = 0, ID = 0;
                String name = "",
                        sex = "",
                        unitName = "",
                        birthday = "",
                        cell = "";
                double salary = 0;
            
                for (int i = 0; i < length; i++) {
                    if (line.charAt(i) != separator) {
                        cell += line.charAt(i);
                    } else {
                        if (cellType == 0 && ID == 0) {ID = Integer.parseInt(cell);}
                        else if (cellType == 1 && name == "") {name = cell;}
                        else if (cellType == 2 && sex == "") {sex = cell;}
                        else if (cellType == 3 && birthday == "") {birthday = cell;}
                        else if (cellType == 4 && unitName == "") {unitName = cell;}
                        cell = "";
                        cellType++;
                        
                    }
                }
                salary = Integer.parseInt(cell);
                cell = "";
                
                Human dataPerson = new Human(ID, name, sex, unitName, salary, birthday);
                fileL.add(dataPerson);
                
            }
        } catch (IOException e) { e.printStackTrace(); }
        return fileL;
    }
}