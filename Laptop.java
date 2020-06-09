package laptop;

public class Laptop {
    public void op(){
        System.out.println("电脑开机！");
    }
    public void cl(){
        System.out.println("电脑关机！");
    }
    public void USB(Usb a){
        a.open();
        if (a instanceof mouth){
            mouth aa=(mouth) a;
            aa.cike();
        }
        a.close();
    }
}
