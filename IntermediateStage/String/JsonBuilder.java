package IntermediateStage;
// 2. StringBuilder (Mutable): Dynamic JSON Generation 
public class JsonBuilder {
    public static String buildProductJson(String name, double price, int quantity) {
      //  return "{ \"name\": \"" + name + "\", \"price\": " + price + ", \"quantity\": " + quantity + " }";

      StringBuilder json = new StringBuilder();
      json.append("{ ");
      json.append("\"name\": \"").append(name).append("\", ");
      json.append("\"price\": ").append(price).append(", ");
      json.append("\"quantity\": ").append(quantity);
      json.append(" }");
      // Convert the final mutable buffer into an immutable String to return.
      return json.toString(); 
    }
    public static void main(String[] args) {
        String output = buildProductJson("Laptop Pro", 12000, 50);
        System.out.println(output);
    }
    
}
