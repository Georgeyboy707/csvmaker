public class Main {

    public static void main(String[] args) {
        // create the kennels object from the text file
        Kennels batterseaDogsHome = new Kennels("stray_dogs.txt");
        batterseaDogsHome.display();

        KennelGUI gui = new KennelGUI("DOG DB", batterseaDogsHome);

        // add a new dog to the home
        //batterseaDogsHome.add("Blinky", 4, "?", "brown");
        //batterseaDogsHome.display();

        // save the records to file
        //batterseaDogsHome.save("stray_dogs_new.txt");
    }
}

/*
import java.io.FileReader;
        import java.io.BufferedReader;
        import java.io.FileWriter;
        import java.io.PrintWriter;
        import java.io.IOException;
        import java.util.ArrayList;

public class FileHandler {

    public static ArrayList<String> readWholeFile(String fileName) {
        // read and print out the contents of a text file
        // using all the exception handling best practices

        ArrayList<String> allLines = new ArrayList<>();
        String nextLine;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            nextLine = br.readLine();  // skip header line
            nextLine = br.readLine();
            while (nextLine != null) {
                allLines.add(nextLine);
                nextLine = br.readLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }

    public static void writeLine(String fileName, String text, boolean append) {
        // write text to fileName
        // either overwriting (append = false)
        // or appending (append = true)
        // using all the exception handling best practices

        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            pr.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}



public class Dog {
    private String name;
    private int age;
    private String breed;
    private int stayLength;

    public Dog(String name, int age, String breed, int stayLength) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.stayLength = stayLength;
    }

    public Dog(String record) {
        // construct from a comma-separated string containing all fields
        String[] fields = record.split(",");
        name = fields[0];
        age = Integer.parseInt(fields[1]);
        breed = fields[2];
        stayLength = Integer.parseInt(fields[3]);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public int getStayLength() {
        return stayLength;
    }

    public String toString() {
        // printable string representation
        String representation =
                name + "," +
                        Integer.toString(age) + "," +
                        breed + "," +
                        Integer.toString(stayLength);
        return representation;
    }

    public void display() {
        // print fields to console
        System.out.println(toString());
    }
}

