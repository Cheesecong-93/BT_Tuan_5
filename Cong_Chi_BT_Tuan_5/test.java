public class test {
    public static void main(String[] args) {
        Sach sach1 = new Sach("001", "Toi thay hoa vang tren co xanh", "Nguyen Nhat Anh", 1999, 35);
        Sach sach2 = new Sach();

        sach2.setMaSach("002");
        sach2.setTieuDe("Lao Hac");
        sach2.setTacGia("Nam Cao");
        sach2.setNamXuatBan(1888);
        sach2.setSoLuong(10);

        sach1.hienThiThongTin();
        sach2.hienThiThongTin();
    }
}


