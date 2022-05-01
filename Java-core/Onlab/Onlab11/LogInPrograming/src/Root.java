import java.util.ArrayList;

public class Root {
    public ArrayList<Account> getAllAcount(){
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("abc", "abc123", "abc@gmail.com"));
        return accounts;
    }
}
