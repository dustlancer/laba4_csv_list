import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;

public class MainTest {
    String path = "C:\\Users\\afala\\IdeaProjects\\lab4_v2\\foreign_names.csv";
    char separator = ';';
    @Test
    public void fileToListTest(){
        ArrayList<Human> fileList = Main.csvToList(path, separator);
        Assert.assertFalse(fileList.isEmpty());
    }

}