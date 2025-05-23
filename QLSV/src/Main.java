import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        // Đối tượng 1: Sử dụng hàm tạo có tham số
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", sdf.parse("01/01/2000"), 8.5, 7.5, 9.0);

        // Đối tượng 2: Sử dụng thuộc tính
        SinhVien sv2 = new SinhVien();
        sv2.setMaSV("SV002");
        sv2.setHoTen("Tran Thi B");
        sv2.setNgaySinh(sdf.parse("02/02/2000"));
        sv2.setDiemToan(6.5);
        sv2.setDiemLy(7.0);
        sv2.setDiemHoa(8.0);

        // Đối tượng 3: Sử dụng phương thức nhập
        SinhVien sv3 = new SinhVien();
        System.out.println("Nhap thong tin sinh vien thu 3:");
        sv3.nhap();

        // Xuất thông tin 3 sinh viên
        System.out.println("\nThong tin 3 sinh vien:");
        sv1.xuat();
        sv2.xuat();
        sv3.xuat();
    }
}