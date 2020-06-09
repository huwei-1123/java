package laptop;

public class keybroad implements Usb{
    @Override
    public void open() {
        System.out.println("键盘连接!");
    }

    @Override
    public void close() {
        System.out.println("键盘断开！");
    }
}
