package section6;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("DoQuangDuong", "099999999");
        pb.insertPhone("DoQuangDuong", "033333333");
        pb.insertPhone("DoQuangDuong", "066666666");
        pb.removePhone("DoQuangDuong");
        for(String pl : pb.PhoneList){
            System.out.println(pl);
        }

    }
}
