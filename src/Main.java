import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LegacyFirewall firewall = new LegacyFirewall();
        FirewallAdapter fwAdapter = new FirewallAdapter(firewall);

        NetworkTrafficController ntc = new NetworkTrafficController();
        UserAccessManager uam = new UserAccessManager();
        EncryptionService cryptServ = new EncryptionService();

        //ntc.blockPort(8080);
        //ntc.blockPort(443);
        //ntc.divertTraffic();
        //uam.lockUserAccounts(userAccounts);
        //cryptServ.encryptDatabase("Customer_Records");

        //ntc.unblockPort(8080);
        //ntc.unblockPort(442);
        //uam.unlockUserAccounts(userAccounts);
        //cryptServ.decryptDatabase("Customer_Records");

        CommandCenterFacade ccf = new CommandCenterFacade(ntc,uam,cryptServ);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter system message:");
        String logEvent = scanner.nextLine();
        fwAdapter.logEvent(logEvent);
        System.out.println("Enter system severity level:");
        int severity = scanner.nextInt();
        fwAdapter.setSeverity(severity);
        boolean end = false;

        while(end != true){

            System.out.println("Command Center Dashboard");
            System.out.println("Press 1 to Initiate Emergency Lockdown.");
            System.out.println("Press 2 to Lift Emergency Lockdown.");
            System.out.println("Press 3 to Enable Maintenance Mode.");
            System.out.println("Press 0 to quit.");
            int number = scanner.nextInt();


            if (number == 1){
                ccf.initiateEmergencyLockdown();
            }else if(number == 2){
                ccf.liftEmergencyLockdown();
            }else if(number == 3) {
                ccf.enableMaintenanceMode();
            }else if(number == 0){
                System.out.println("Exiting program. Goodbye...");
                end = true;
            }

        }
        scanner.close();
    }
}
