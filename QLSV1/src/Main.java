import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        ArrayList<SinhVien> danhSachSV = new ArrayList<>();

        // nhập số lượng sv
        System.out.print("nhap so luong sinh vien:");
        int n = scanner.nextInt();
        
        // nhập thông tin cho n sv
        for(int i=0;i<n;i++){
        System.out.println("nhap thong tin sinh vien thu "+ (i+1)+":");
        SinhVien sv =new SinhVien();
        sv.nhap();
        danhSachSV.add(sv);
        }
        // In danh sách all hoc sinh
        System.out.println("\nDanh sach sinh vien :");
        for(SinhVien sv : danhSachSV){
            sv.xuat();
        }
        
        //In danh sách hsg
        System.out.println("\nDanh sachsinh vien gioi:");
        boolean coSVGioi = false;
        for (SinhVien sv : danhSachSV){
            if (sv.xepLoai().equals("Giỏi")){
            sv.xuat();
            coSVGioi = true;
            }
        }
    if (!coSVGioi){
        System.out.println("khong co siinh vien gioi:");
    }
}}