import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        LegacyFirewall firewall = new LegacyFirewall();
        FirewallAdapter fwAdapter = new FirewallAdapter(firewall);
        fwAdapter.logEvent("Security Log Event");
        fwAdapter.setSeverity(1);
        NetworkTrafficController ntc = new NetworkTrafficController();
        UserAccessManager uac = new UserAccessManager();
        EncryptionService cryptServ = new EncryptionService();
        List<String> userAccounts = new ArrayList<>();
        userAccounts.add("admin_temp");
        userAccounts.add("guest_user_1");
        userAccounts.add("service_acct");
        System.out.println("Emergency Breach!");
        ntc.blockPort(8080);
        ntc.blockPort(443);
        ntc.divertTraffic();
        uac.lockUserAccounts(userAccounts);
        cryptServ.encryptDatabase("Customer_Records");
        System.out.println("ALL-CLEAR!");
        ntc.unblockPort(8080);
        ntc.unblockPort(442);
        uac.unlockUserAccounts(userAccounts);
        cryptServ.decryptDatabase("Customer_Records");
    }
}
