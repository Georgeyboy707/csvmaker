public class Main {

    public static void main(String[] args) {
        String text = "help me";
        String data[] = text.split(" ");
        //splits data into parts vis csv

        int desiredLen = 20;


        for (int i = 0; i < data.length; i++)

            int currentLen = data[i].length();


        while (currentLen < desiredLen - 1) {
            data = data + "x";

            currentLen = data.length();
        }
        data = data + ",";

        System.out.println(data);
    }
    }
}
