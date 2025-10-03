package Hai_Dang_BT_Tuan_5;

public class test {
    public static void main(String[] args) {
        sach sach1 = new sach("S001", "laptrinhJava", "Nguyen Van A", 2021, 10);

        sach sach2 = new sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Cau truc du lieu va giai thuat");
        sach2.setTacGia("Tran Van B");
        sach2.setNamXuatBan(2019);
        sach2.setSoLuong(5);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}
