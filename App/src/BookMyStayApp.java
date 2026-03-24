import java.io.*;

public class BookMyStayApp {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("data.txt");
        fw.write("Saved");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        System.out.println(br.readLine());
        br.close();
    }
}