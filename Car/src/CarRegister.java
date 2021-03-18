public class CarRegister{
    public static void main(String[] args){
        CarRegistry c1 = new CarRegistry("sonata", "김익상");
        CarRegistry c2 = new CarRegistry("avante", "윤희영");
        CarRegistry c3 = new CarRegistry("optima", "김용우");
        System.out.println("등록된 자동차 수는 "+c1.serialNum+"입니다.");
        System.out.println("등록된 자동차 수는 "+c2.serialNum+"입니다.");
        System.out.println("등록된 자동차 수는 "+c3.serialNum+"입니다.");
        System.out.println("등록된 자동차 수는 "+ CarRegistry.serialNum+"입니다.");
        System.out.println("등록된 자동차 수는 "+ CarRegistry.getSerial()+"입니다.");
    } //시작 메소드
}
class CarRegistry {
    static int serialNum = 0;
    String model;
    String owner;//멤버

    CarRegistry(String model, String owner) {
        this.model = model;
        this.owner = owner;
        serialNum++;
    } //생성메소드

    static int getSerial() {
        return serialNum;
    }
}