public class NetworkTrafficController {

    public void blockPort(int port){
        System.out.println("Blocked Port: " + port);

    }
    public void unblockPort(int port){
        System.out.println("Unblocked Port: " + port);
    }
    public void divertTraffic(){
        System.out.println("Diverted traffic to the honeypot." );
    }
    public void monitorPacketLoss(){

    }
}
