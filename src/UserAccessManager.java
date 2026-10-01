import java.util.ArrayList;
import java.util.List;

public class UserAccessManager {

    public void lockUserAccounts(List<String> usernames){

        System.out.println("Locked User Accounts: " + usernames);
    }
    public void unlockUserAccounts(List<String> usernames){
        System.out.println("Unlocked User Accounts: " + usernames);
    }
    public void grantAdminAccess(String user){
        System.out.println("Administrator Access Granted to: " + user);

    }
}
