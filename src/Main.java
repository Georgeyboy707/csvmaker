public class Main {

    public static void main(String[] args) {
        String text = "help me eat food";
        String data[] = text.split(" ");
        //splits data into parts vis csv

        int desiredLen = 20;
        int currentLen;

        for (int i = 0; i < data.length; i++){
            currentLen = data[i].length();
            while (currentLen < desiredLen - 1) {
                data[i] = data[i] + "x";
                currentLen = data[i].length();
            }

        data[i] = data[i] + ",";
        System.out.println(data);
    }
    }
}
