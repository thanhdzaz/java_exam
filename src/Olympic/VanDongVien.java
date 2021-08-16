package Olympic;

import java.util.Comparator;

public class VanDongVien extends Nguoi {
    Double chieuCao,canNang;

    VanDongVien(String name,int age,  Double chieuCao, Double canNang , String national){
        this.name = name;
        this.age = age;
        this.national = national;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
    }
    public static Comparator<VanDongVien> sortHeight = new Comparator<VanDongVien>() {
        public int compare(VanDongVien s1, VanDongVien s2) {
            int price1 = (int) Math.round(s1.chieuCao);
            int price2 = (int) Math.round(s2.chieuCao);
            return price2-price1;
        }};


    public void thongTinChiTiet(){
        System.out.printf("Ten: %s , Tuoi: %d , Can nang: %.2f , Chieu cao: %.2f , Quoc gia: %s \n",this.name,this.age,this.canNang,this.chieuCao,this.national);
    }
}
