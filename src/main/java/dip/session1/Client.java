package dip.session1;

public class Client  {
    public static void main(String[] args) {
        Driver zhangSan = new Driver();
        Benz benz = new Benz();
        // 张三开奔驰车
        zhangSan.drive(benz);
    }
}