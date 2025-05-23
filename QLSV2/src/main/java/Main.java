import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> danhSach = new ArrayList<>();
        danhSach.add(new SinhVien("SV01", "Nguyen Van A", 7.5));
        danhSach.add(new SinhVien("SV02", "Le Thi B", 8.2));
        danhSach.add(new SinhVien("SV03", "Tran Van C", 6.8));

        // Sắp xếp giảm dần theo điểm trung bình
        danhSach.sort((sv1, sv2) -> Double.compare(sv2.getDiemTB(), sv1.getDiemTB()));

        // Hiển thị danh sách
        for (SinhVien sv : danhSach) {
            System.out.println(sv);
        }
    }
}
