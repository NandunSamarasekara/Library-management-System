import java.util.ArrayList;

public class Userdetailslist {

    public static ArrayList<String> firstname1 = new ArrayList<>();
    public static ArrayList<String> lastname1 = new ArrayList<>();
    public static ArrayList<String> IDs1 = new ArrayList<>();
    
    public static void firstname(String firstname){
    
        firstname1.add(firstname);
        
    }

    public static void lastname(String lastname){  
    
        lastname1.add(lastname);

    }
    
    public static void IDs(String IDs){

        IDs1.add(IDs);
    
    }

    
}
