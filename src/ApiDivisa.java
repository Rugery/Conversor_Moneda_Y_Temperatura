import com.google.gson.Gson;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiDivisa {

    public String de;
    public String a;
    private double valor;

    public ApiDivisa(String de, String a, double valor) {
        this.de = de;
        this.a = a;
        this.valor = valor;
    }
    //Api Divisas
    public void conversionMoneda()throws IOException {
        Gson convert = new Gson();
        URL url = new URL("https://api.apilayer.com/fixer/convert?to="+a+"&from="+de+"&amount="+valor+"&apikey=49JpIfilc8XSt2UpOf3QxDS3cBGwfvoE");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setRequestMethod("GET");
        int responseCode = http.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            String respuesta = response.toString();
            Moneda moneda = convert.fromJson(respuesta, Moneda.class);
            JOptionPane.showMessageDialog(null, "Tienes : "+moneda.getResult()+" "+String.format(getA()), null, JOptionPane.INFORMATION_MESSAGE);
        }
        http.disconnect();
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
