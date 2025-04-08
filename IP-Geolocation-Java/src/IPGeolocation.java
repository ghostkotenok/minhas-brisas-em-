import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class IPGeolocation {

    public static void main(String[] args) {
        try {
            String apiURL = "http://ip-api.com/json/";
            URL url = new URL(apiURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int status = connection.getResponseCode();
            if (status != 200) {
                System.out.println("Erro ao conectar com a API. Código: " + status);
                return;
            }

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );
            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject json = new JSONObject(response.toString());

            System.out.println("🧭 Informações do IP:");
            System.out.println("IP: " + json.getString("query"));
            System.out.println("País: " + json.getString("country"));
            System.out.println("Região: " + json.getString("regionName"));
            System.out.println("Cidade: " + json.getString("city"));
            System.out.println("CEP: " + json.getString("zip"));
            System.out.println("Latitude: " + json.getDouble("lat"));
            System.out.println("Longitude: " + json.getDouble("lon"));
            System.out.println("ISP: " + json.getString("isp"));
            System.out.println("Org: " + json.getString("org"));

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
