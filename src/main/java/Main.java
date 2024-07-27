import com.mongodb.client.MongoIterable;


public class Main {
    public static void main(String[] args) {
        MongoDBConnector.connect("mongodb+srv://george:passwordMJK@cluster0.t96yku4.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0", "sample_airbnb");

        System.out.println(MongoDBConnector.database.getName());
    }
}
