
class Encapsulation {
    private String creditCardNo;

    public void setCreditCardNo(String str) {
        creditCardNo = str;
    }
    public String getCreditCardNo() {
        return creditCardNo;
    }
}

public class EncapMain {
    public static void main(String[] args) {
        Encapsulation a = new Encapsulation();
        a.setCreditCardNo("1234");
        System.out.println("신용카드 번호는 " + a.getCreditCardNo());
    }
}
