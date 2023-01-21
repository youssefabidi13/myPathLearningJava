public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone =new DeskPhone(1234456);
        timsPhone.powerOn();
        timsPhone.callPhone(1234456);
        timsPhone.answer();
        timsPhone = new MobilePhone(23456);
        timsPhone.powerOn();
        timsPhone.callPhone(23456);
        timsPhone.answer();
    }
}
