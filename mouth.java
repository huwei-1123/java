package laptop;

public class mouth implements Usb{

    @Override
    public void open() {
        System.out.println("鼠标链接！");
    }

    @Override
    public void close() {
        System.out.println("鼠标断开！");
    }
    public void cike(){
        System.out.println("鼠标点击");
    }
}
