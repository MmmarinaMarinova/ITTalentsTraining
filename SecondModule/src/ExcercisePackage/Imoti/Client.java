package ExcercisePackage.Imoti;

/**
 * Created by Marina on 15.8.2017 г..
 */
public abstract class Client {
    private String name;
    private String phone;

    public Client(String name) {
        this.name = name;
        this.phone="+359462158947";
    }

    public String getName() {
        return this.name;
    }
}
