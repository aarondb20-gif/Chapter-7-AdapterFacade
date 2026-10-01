public class Main {
    public static void main(String[] args) {
        LegacyFirewall firewall = new LegacyFirewall();
        FirewallAdapter fwAdapter = new FirewallAdapter(firewall);
        fwAdapter.logEvent("Security Log Event");
        fwAdapter.setSeverity(1);
    }
}
