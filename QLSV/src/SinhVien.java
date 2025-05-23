import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private Date ngaySinh;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    // Hàm tạo không tham số
    public SinhVien() {
        this.maSV = "";
        this.hoTen = "";
        this.ngaySinh = new Date();
        this.diemToan = 0.0;
        this.diemLy = 0.0;
        this.diemHoa = 0.0;
    }

    // Hàm tạo có tham số
    public SinhVien(String maSV, String hoTen, Date ngaySinh, double diemToan, double diemLy, double diemHoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    // Getter và Setter
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    // Phương thức tính điểm trung bình
    public double tinhDiemTrungBinh() {
        return (diemToan + diemLy + diemHoa) / 3;
    }

    // Phương thức xếp loại
    public String xepLoai() {
        double diemTB = tinhDiemTrungBinh();
        if (diemTB >= 8) {
            return "Giỏi";
        } else if (diemTB >= 7) {
            return "Khá";
        } else if (diemTB >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    // Phương thức nhập dữ liệu
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        this.maSV = scanner.nextLine();
        System.out.print("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
        String ngaySinhStr = scanner.nextLine();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.ngaySinh = sdf.parse(ngaySinhStr);
        } catch (Exception e) {
            System.out.println("Ngay sinh khong hop le, su dung ngay mac dinh.");
            this.ngaySinh = new Date();
        }
        System.out.print("Nhap diem Toan: ");
        this.diemToan = scanner.nextDouble();
        System.out.print("Nhap diem Ly: ");
        this.diemLy = scanner.nextDouble();
        System.out.print("Nhap diem Hoa: ");
        this.diemHoa = scanner.nextDouble();
    }

    // Phương thức xuất dữ liệu
    public void xuat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Ma SV: %s, Ho ten: %s, Ngay sinh: %s, Diem Toan: %.2f, Diem Ly: %.2f, Diem Hoa: %.2f, DTB: %.2f, Xep loai: %s%n",
                maSV, hoTen, sdf.format(ngaySinh), diemToan, diemLy, diemHoa, tinhDiemTrungBinh(), xepLoai());
    }
}