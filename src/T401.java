import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;


public class T401 {
    public static void main(String[] args) throws IOException {

        String inputPath="./encode_text";
        String outputPath="./decode_text";
        StringBuilder data =new StringBuilder();

        FileReader fr = new FileReader(inputPath);
        BufferedReader br=new BufferedReader(fr);

        while (br.ready()) {
            data.append(br.readLine());
        }
        String decode = URLDecoder.decode(data.toString(), "UTF-8");
        FileWriter fw=new FileWriter(outputPath);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write(decode);

        br.close();
        fr.close();

        bw.close();
        fw.close();

    }
}
