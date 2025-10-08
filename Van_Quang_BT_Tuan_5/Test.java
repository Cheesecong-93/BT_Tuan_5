public class Test {
    public static void main(String[] args) {

        Sach sach1 = new Sach("S001", "Lap trinh java co ban", "Nguyen van A", 2022, 5);

        Sach sach2 = new Sach();
        sach2.setMaSach("S002");
        sach2.setTieuDe("Cau truc du lieu & Giai thuat");
        sach2.setTacGia("Tran thi B");
        sach2.setNamXuatBan(2021);
        sach2.setSoLuong(3);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

    }
}
