
import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import ohtu.Submission;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

public class Main {

    public static void main(String[] args) throws IOException {
        String studentNr = "014417841";
        if (args.length > 0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats2016.herokuapp.com/students/" + studentNr + "/submissions";

        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        client.executeMethod(method);

        InputStream stream = method.getResponseBodyAsStream();

        String bodyText = IOUtils.toString(stream);

        System.out.println("json-muotoinen data:");
        System.out.println(bodyText);

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);
//opiskelijanumero 012345678
//
// viikko 1: tehtyjä tehtäviä yhteensä: 9, aikaa kului 3 tuntia, tehdyt tehtävät: 1 2 3 4 5 6 7 9 11 
// viikko 2: tehtyjä tehtäviä yhteensä: 6, aikaa kului 4 tuntia, tehdyt tehtävät: 1 2 3 6 7 8  
//
//yhteensä: 15 tehtävää 7 tuntia
        System.out.println("Oliot:");
        int viikko = 1;
        int tehdytTehtavat = 0, kaikkitunnit = 0;
        System.out.println("opiskelijanumero " + subs[0]);
        System.out.println("");
        for (Submission submission : subs) {
            int tehdyt = submission.getexercisesDone();
            int tunnit = submission.gethours();
            System.out.println("viikko " + viikko + ": tehtyjä tehtäviä yhteensä: " + tehdyt + " aikaa kului " + tunnit + " tuntia" + ", tehdyt tehtävät: " + submission.exercises);
            tehdytTehtavat += tehdyt;
            kaikkitunnit += tunnit;
            viikko++;
        }
        System.out.println("");
        System.out.println("yhteensä: " + tehdytTehtavat + " tehtävää " + kaikkitunnit + " tuntia");
    }
}
