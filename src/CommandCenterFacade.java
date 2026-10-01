import java.util.ArrayList;
import java.util.List;

public class CommandCenterFacade {
    NetworkTrafficController netTrafficCon;
    UserAccessManager userAccessM;
    EncryptionService encryptServ;
    List<String> userAccounts = new ArrayList<>();


    public CommandCenterFacade(NetworkTrafficController netTrafficCon, UserAccessManager userAccessM,
                               EncryptionService encryptServ){
        this.netTrafficCon = netTrafficCon;
        this.userAccessM = userAccessM;
        this.encryptServ = encryptServ;
        userAccounts.add("admin_temp");
        userAccounts.add("guest_user_1");
        userAccounts.add("service_acct");

    }
    public void initiateEmergencyLockdown(){
        //block ports, lock user accounts, encrypt database
        netTrafficCon.blockPort(8080);
        netTrafficCon.blockPort(442);
        userAccessM.lockUserAccounts(userAccounts);
        encryptServ.encryptDatabase("Customer_Records");
    }

    public void liftEmergencyLockdown(){
        //unblock ports, unlock users, decrypt database
        netTrafficCon.unblockPort(8080);
        netTrafficCon.unblockPort(442);
        userAccessM.unlockUserAccounts(userAccounts);
        encryptServ.decryptDatabase("Customer_Records");
    }

    public void enableMaintenanceMode(){
        //divert traffic, grant admin access, verify system integrity
        netTrafficCon.divertTraffic();
        userAccessM.grantAdminAccess("aaron_bryant");
        encryptServ.verifyIntegrity();
    }
}
