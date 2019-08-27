package johnny.leetcode.advanced;

import johnny.leetcode.advanced.common.Product;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ZumeHttp {
    private final String USER_AGENT = "Mozilla/5.0";
    
    public String get(String url, String urlParameters) {
        HttpURLConnection connection = null;
        try {
            URL obj = new URL(url);
            connection = (HttpURLConnection) obj.openConnection();
    
            // optional default is GET
            connection.setRequestMethod("GET");
    
            //add request header
            connection.setRequestProperty("User-Agent", USER_AGENT);
    
            int responseCode = connection.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);
    
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
    
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
    
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
          } finally {
            if (connection != null) {
              connection.disconnect();
            }
          }
    }
    
    public String post(String targetURL, String urlParameters) {
        HttpURLConnection connection = null;

        try {
          //Create connection
          URL url = new URL(targetURL);
          connection = (HttpURLConnection) url.openConnection();
          connection.setRequestMethod("GET");
          //connection.setRequestProperty("Content-Type",  "application/x-www-form-urlencoded");
          connection.setRequestProperty("Content-Type",  "application/json");
        
          connection.setRequestProperty("Content-Length", 
              Integer.toString(urlParameters.getBytes().length));
          connection.setRequestProperty("Content-Language", "en-US");  
        
          connection.setUseCaches(false);
          connection.setDoOutput(true);
        
          //Send request
          if (!urlParameters.isEmpty()) {
              DataOutputStream wr = new DataOutputStream (
                  connection.getOutputStream());
              wr.writeBytes(urlParameters);
              wr.close();
          }
        
          //Get Response  
          InputStream is = connection.getInputStream();
          BufferedReader rd = new BufferedReader(new InputStreamReader(is));
          StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
          String line;
          while ((line = rd.readLine()) != null) {
            response.append(line);
            response.append('\r');
          }
          rd.close();
          return response.toString();
        } catch (Exception e) {
          e.printStackTrace();
          return null;
        } finally {
          if (connection != null) {
            connection.disconnect();
          }
        }
    }
    
    public List<Product> parse(String jsonStr) {
        //JSONObject obj = new JSONObject(str);
        List<Product> list = new ArrayList<>();
        JSONArray jsonarray = new JSONArray(jsonStr);
        for (int i = 0; i < jsonarray.length(); i++) {
            JSONObject jsonobject = jsonarray.getJSONObject(i);
            Product product = new Product();
            product.id = jsonobject.getInt("id");
            product.productname = jsonobject.getString("productName");
            product.price = jsonobject.getDouble("price");
            product.image = jsonobject.getString("image");
            list.add(product);
        }
        
        return list;
    }
}
