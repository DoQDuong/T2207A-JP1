package btap4;

import java.util.Scanner;

public class Sinhvien {
    private String name;
    private int date;
    private String adress;
    private String classs;
    private int  medium;
    private String seploai;
    private int max;

    public int getMax() {
        Sinhvien[] a =new Sinhvien[3];

        for (int i=0;i<a.length;i++)

        {
            a[i] = new Sinhvien("Duong",2004,"Hà Tây","t2207",9,"gioi");
            if (max < a[i].getMedium())
                max = a[i].getMedium();

        }
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Sinhvien(String name, int date, String adress, String classs, int medium, String seploai){
        this.name = name;
        this.date = date;
        this.adress =adress;
        this.classs = classs;
        this.medium = medium;
        this.seploai = seploai;
    }
    public int getMedium() {

        return medium;
    }

    //public void xapxep(){
//
//    for (int i=0;i< n;i++){
//        for (int j=i+1;j<cars.length;j++){
//            if (cars[i].getMedium()<cars[j].getMedium()){
//                Sinhvien tamp=new Sinhvien("HOANG",2004,"vp","t2207",9);
//                 tamp =cars[i];
//                cars[i]=cars[j];
//                cars[j]=tamp;
//
//            }
//        }
//    }
//}
    public void setMedium(int medium) {
        this.medium = medium;
    }

    public String getSeploai() {
        if (medium<=4){
            System.out.println("Yếu");
        } else if ( medium<=6.5) {
            System.out.println("Trung bình");
        } else if ( medium<=8) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }
        return seploai;
    }

    public void setSeploai(String seploai) {
        this.seploai = seploai;
    }
    public void nhap(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập tên sv: ");
        name=sc.nextLine();
        System.out.println("Nhập năm sinh: ");
        date=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập nơi ở: ");
        adress=sc.nextLine();
        System.out.println("Nhập lớp: ");

        classs=sc.nextLine();
        System.out.println("Nhập điểm trung bình: ");
        medium=sc.nextInt();
    }
    public void hienthi(){
        if (medium<=4){
            System.out.println("Họ Tên: "+name+", Năm Sinh: "+date+", Nơi ở: "+adress+", Lớp Học: "+classs+", Điểm TB: "+medium+ ", Xếp loại: Yếu ");
        } else if ( medium<=6.5) {
            System.out.println("Họ Tên: "+name+", Năm Sinh: "+date+", Nơi ở: "+adress+", Lớp Học: "+classs+", Điểm TB: "+medium+ ", Xếp loại: Trung bình ");
        } else if ( medium<=8) {
            System.out.println("Họ Tên: "+name+", Năm Sinh: "+date+", Nơi ở: "+adress+", Lớp Học: "+classs+", Điểm TB: "+medium+ ", Xếp loại: Khá ");
        } else {
            System.out.println("Họ Tên: "+name+", Năm Sinh: "+date+", Nơi ở: "+adress+", Lớp Học: "+classs+", Điểm TB: "+medium+ ", Xếp loại: Giỏi ");
        }
//    System.out.println("HỌ TÊN: "+name+", Năm Sinh: "+date+", Nơi ở: "+adress+", Lớp Học: "+classs+", Điểm TB: "+medium+ ", Xếp loại: "+seploai);
    }
    public void svsuatsac(){
        if (medium>=7.5 && medium<=10){
            System.out.println("Họ Tên: "+name+", Năm Sinh: "+date+", Nơi ở: "+adress+", Lớp Học: "+classs+", Điểm TB: "+medium);
        }
    }
    //    public int getSeploai() {
//        if (medium<=4){
//            System.out.println("yeu");
//        } else if (medium>=4 && medium<=6.5) {
//            System.out.println("trung binh");
//        } else if (medium>=6.5 && medium<=8) {
//            System.out.println("kha");
//        } else if (medium>=8 && medium<=10) {
//            System.out.println("gioi");
//        }
//        return seploai;
//    }
//
//    public void setSeploai(int seploai) {
//        this.seploai = seploai;
//    }
    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
