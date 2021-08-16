package Olympic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ArrayList<VanDongVien> vdv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++){
            System.out.printf("VDV thu %d \n",i+1);
            System.out.print("Nhap ten: ");
            String name = sc.next();
            System.out.print("Nhap tuoi: ");
            int age = sc.nextInt();
            System.out.print("Nhap chieu cao: ");
            Double height = sc.nextDouble();
            System.out.print("Nhap can nang: ");
            Double weight = sc.nextDouble();
            System.out.print("Nhap quoc tich: ");
            String national = sc.next();
            System.out.println("<===============================>");
            vdv.add(new VanDongVien(name, age, height, weight, national));
        }

        System.out.println("DS vua nhap:");
        for (VanDongVien tmp : vdv) {
            tmp.thongTinChiTiet();
        }

        Collections.sort(vdv,VanDongVien.sortHeight);
        System.out.println("VDV co chieu cao cao nhat: ");
        vdv.get(0).thongTinChiTiet();
    }
}
