public class Mobile {
    public int battery;
    public boolean isOn;
    public String composeMsg;
    public String[] inbox;
    public int count_inbox;
    public String[] sent;
    public int count_sent;
    public Mobile() {

        battery = 100;
        isOn = true;
        this.inbox = new String[1000];
        sent = new String[1000];
        count_sent= 0;
        count_inbox=0;
    }
    public boolean isOn() {
        return isOn;
    }
    public void turnOn() {
        this.isOn = true;
    }
    public void turnOff() {
        this.isOn = false;
    }

    public void charge() {
        this.battery = 100;
    }
    public void displaySent(){
        System.out.println("===Sent===");
        for(int i=0;i<this.count_sent;i++){
            System.out.println(sent[i]);
        }
    }
    public void displayBox(){
        System.out.println("===Inbox===");
        for(int i=0;i<this.count_inbox;i++){
            System.out.println(inbox[i]);
        }
    }

    public void decreaseBattery() {
        battery--;
    }
    public void ComposeMsg(String message) {
        if (this.isOn) {
            this.composeMsg = message;
            decreaseBattery();
        }
        else {
            System.out.println("Điện thoại hết pin");
        }
    }
    public void sent(Mobile recevier){
        if(this.isOn){
            if(count_sent>1000){
                System.out.println("Bộ nhớ đầy");
            }else{
                if(!this.composeMsg.equals("")){
                    this.sent[count_sent++]= this.composeMsg;
                   recevier.recevie(this.composeMsg);
                   this.composeMsg="";
                   decreaseBattery();
                }

            }
        }
    }
    public void recevie(String Message){
        if(this.isOn){
            this.inbox[count_inbox++]=Message;
            decreaseBattery();
        }else{
            System.out.print("Điện thoại hết pin");
        }
    }
    public void displayInfo(){
        System.out.println("% Battery: "+this.battery+"%");
        System.out.println("Bật: "+isOn);
        System.out.println("Bộ nhớ tin nhắn đến: "+ count_inbox+"/1000");
        System.out.println("Bộ nhớ tin nhắn gửi: "+count_sent+"/1000");
    }

}
