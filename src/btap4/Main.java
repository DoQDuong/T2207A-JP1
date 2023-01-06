package btap4;

public class Main {
    public static void main(String[] args) {
//     Car c= new Car("BMV","x8");
//
//     System.out.println(c.getBrand());
//     System.out.println(c.getName());
//
//     Car[] cars =new Car[10];
//
//     for (int i=0;i< cars.length;i++){
//
//
//
//
//         System.out.println("hhh"+cars[i].getBrand());
//     }=

        Sinhvien a = new Sinhvien("HOANG",2004,"vp","t2207",9,"gioi");
        a.nhap();

        a.hienthi();
//        System.out.println("Xếp loại SV là: ");
//        a.getSeploai();
//        System.out.println("Họ tên sinh viên :");
//
//        System.out.println(a.getName());
//        System.out.println("Năm sinh viên :");
//
//        System.out.println(a.getDate());
//        System.out.println("Nơi ở sinh viên :");
//
//        System.out.println(a.getAdress());
//        System.out.println("Lớp họ sinh viên :");
//
//        System.out.println(a.getClasss());
//        System.out.println("Điểm TB sinh viên :");
//
//        System.out.println(a.getMedium());



        Sinhvien[] cars =new Sinhvien[3];
        for (int i=0;i< cars.length;i++){
            cars[i] = new Sinhvien("HOANG",2004,"vp","t2207",9,"gioi");
            cars[i].nhap();





        }
        for (int i=0;i< cars.length;i++){
            for (int j=i+1;j<cars.length;j++){
                if (cars[i].getMedium()<cars[j].getMedium()){
                    Sinhvien temp =new Sinhvien("HOANG",2004,"vp","t2207",9,"gioi");
                    temp =cars[i];
                    cars[i] =cars[j];
                    cars[j]=temp;

                }
            }
        }
        System.out.println("Danh sách sinh viên sau khi sắp xếp là;");
        for (int i=0;i< cars.length;i++){
            cars[i].hienthi();




        }
        Sinhvien max = new Sinhvien("HOANG",2004,"vp","t2207",9,"gioi");
        max = cars[0];
        Sinhvien min = new Sinhvien("HOANG",2004,"vp","t2207",9,"gioi");
        min = cars[0];
        for (int i=0;i< cars.length;i++) {
            if (cars[i].getMedium() > max.getMedium()) {
                max = cars[i];
            }
            if (cars[i].getMedium() < min.getMedium()) {
                min = cars[i];
            }
        }
        System.out.println("Sinh viên có điểm cao nhất là: ");
//        System.out.println("Tên sinh viên: "+max.getName());
        max.hienthi();
//        System.out.println("Năm sinh sinh viên: "+max.getDate());
//        System.out.println("Lớp sinh viên: "+max.getClasss());
//        System.out.println("Điểm TB sinh viên: "+max.getMedium());
        System.out.println("Sinh viên có điểm thấp nhất là: ");
        min.hienthi();
//        System.out.println("Tên sinh viên: "+min.getName());
//        System.out.println("Năm sinh sinh viên: "+min.getDate());
//        System.out.println("Lớp sinh viên: "+min.getClasss());
//        System.out.println("Điểm TB sinh viên: "+min.getMedium());
        System.out.println("Danh sách sinh viên suất sắc là: ");
        for (int i=0;i< cars.length;i++){

            cars[i].svxuatsac();
        }

//           if (i == 0){
//               min= cars[0].getMedium();
//           } else if (cars[i].getMedium()<min) {
//               min =cars[i].getMedium();
//           }

    }
}
