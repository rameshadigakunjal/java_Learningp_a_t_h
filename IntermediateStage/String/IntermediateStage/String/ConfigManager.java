package IntermediateStage.String;
//1. String (Immutable): Configuration and Credentials 
public class ConfigManager {
    public static void main(String[] args) {
        
    }
    private final String API_KEY =" your-api-key-here ";
    private String username = "adminusername";
    
    public String getApiKey() {
        return API_KEY;
    }
    
    public void updateUsername(String newUsername) {
        this.username = newUsername;
    }       
}