public class FirewallAdapter implements SecurityLog{
    LegacyFirewall legacyFirewall;

    public FirewallAdapter(LegacyFirewall legacyFirewall){
        this.legacyFirewall = legacyFirewall;
    }

    @Override
    public void logEvent(String message) {
        legacyFirewall.recordActivity("System Log: " + message);

    }

    @Override
    public void setSeverity(int level) {
        System.out.println("Security Level:");
        legacyFirewall.setAlertLevel(level);

    }
}
