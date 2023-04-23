/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truon
 */
public class Main {

    public static void main(String[] args) {
        Main qlka = new Main();
        Scanner sc = new Scanner(System.in);
        int Anh;

        do {
            System.out.println("Chon Anh---------------------------");
            System.out.println("1.  Them thong tin hinh anh");
            System.out.println("2.  In thong tin toan bo anh phong canh cos trong kho");
            System.out.println("3.  Chi in thong tin anh thien nhien");
            System.out.println("4.  Chi in thong tin anh doi song");
            System.out.println("5.  Tim kiem anh theo ten");
            System.out.println("6.  Tim kiem anh theo ma");
            System.out.println("7.  Tim kiem anh theo ten va ma");
            System.out.println("8. Xoa anh");
            System.out.println("9. Xuat anh");
            System.out.println("0.  Thoat chuong trinh-Xin cam on");
            System.out.print("Nhap: ");
            Anh = sc.nextInt();

            switch (Anh) {
                case 1:
                    int Anh_1;
                    do {

                        System.out.println("Anh----------");
                        System.out.println("1. Anh Thien nhien");
                        System.out.println("2. Anh Doi Song");
                        System.out.println("0. Quay lai chuong trinh");
                        System.out.print("Nhap: ");
                        Anh_1 = sc.nextInt();

                        switch (Anh_1) {
                            case 1: {
                                sc.nextLine();
                                System.out.print("Nhap ten: ");
                                String Name = sc.nextLine();

                                System.out.print("Nhap Ma Anh: ");
                                String Ma_Anh = sc.nextLine();

                                System.out.print("Nhap Kich Thuoc Anh: ");
                                String Kich_Thuoc_Anh = sc.nextLine();

                                System.out.print("Nhap So Luong Anh: ");
                                int So_Luong_Anh = sc.nextInt();

                                System.out.print("Nhap Mo Ta Anh: ");
                                String Mo_Ta_Anh = sc.nextLine();

                                System.out.print("Nhap Noi_Chup: ");
                                String Noi_Chup = sc.nextDouble();

                                System.out.print("Nhap Thoi_Tiet: ");
                                String Thoi_Tiet = sc.nextLine();

                                System.out.print("Nhap Thong Tin Anh: ");
                                String Thong_Tin_Anh = sc.nextDouble();
                                
                                NgayNhapXuat date = new NgayNhapXuat();
                                System.out.print("Nhap vao nam hien tai: ");
                                int namhientai = sc.nextInt();

                                System.out.println("Nhap vao dd/mm/yyyy");
                                System.out.print("Nhap dd: ");
                                date.setDay(sc.nextInt());
                                if (date.getDay() < 1 || date.getDay() > 31) {
                                    do {
                                        System.out.println("Khong hop le, nhap lai");
                                        System.out.print("Nhap lai ngay: ");
                                        date.setDay(sc.nextInt());
                                    } while (date.getDay() < 1 || date.getDay() > 31);
                                }

                                System.out.print("Nhap mm: ");
                                date.setMonth(sc.nextInt());
                                if (date.getMonth() < 1 || date.getMonth() > 12) {
                                    do {
                                        System.out.println("Khong hop le, nhap lai");
                                        System.out.print("Nhap lai thang: ");
                                        date.setMonth(sc.nextInt());
                                    } while (date.getMonth() < 1 || date.getMonth() > 12);
                                }

                                System.out.print("Nhap yyyy: ");
                                date.setYear(sc.nextInt());
                                if (date.getYear() < 1943 || date.getYear() > namhientai) {
                                    do {
                                        System.out.println("Khong hop le, nhap lai");
                                        System.out.print("Nhap lai nam: ");
                                        date.setYear(sc.nextInt());
                                    } while (date.getYear() < 1943 || date.getYear() > namhientai);
                                }

                                AnhPhongCanh APC = new AnhThienNhien(Name, Ma_Anh, Kich_Thuoc_Anh, So_Luong_Anh, Mo_Ta_Anh, Thong_Tin_Anh, Noi_Chup, Thoi_Tiet, date);
                                qlka.Them_Anh(APC);
                                System.out.println("Them thanh cong-----------");
                            }
                            break;
                            case 2:  {
                                sc.nextLine();
                                System.out.print("Nhap ten: ");
                                String Name = sc.nextLine();

                                System.out.print("Nhap Ma_Anh: ");
                                String Ma_Anh = sc.nextLine();
                                
                                System.out.print("Nhap Mo_Ta: ");
                                String Mo_Ta = sc.nextLine();
                                
                                System.out.print("Nhap Kich_Thuoc_Anh: ");
                                String Kich_Thuoc_Anh = sc.nextLine();

                                System.out.print("Nhap So_Luong_Anh: ");
                                int So_Luong_Anh = sc.nextInt();

                                System.out.print("Nhap Mo_Ta_Anh: ");
                                String Mo_Ta_Anh = sc.nextLine();

                                System.out.print("Nhap Thong_Tin_Anh: ");
                                String Thong_Tin_Anh = sc.nextLine();

                                System.out.print("Con_Nguoi: ");
                                String Con_Nguoi = sc.nextLine();

                                System.out.print("Dong_Vat: ");
                                String Dong_Vat = sc.nextDouble();

                                System.out.print("Nhap Hoat_Dong: ");
                                String Hoat_Dong = sc.nextDouble();

                                System.out.print("Nhap true hoac false cho Con_Nguoi: ");
                                boolean Con_Nguoi = sc.nextBoolean();

                                NgayNhapXuat date = new NgayNhapXuat();
                                System.out.print("Nhap vao nam hien tai: ");
                                int namhientai = sc.nextInt();

                                System.out.println("Nhap vao dd/mm/yyyy");
                                System.out.print("Nhap dd: ");
                                date.setDay(sc.nextInt());
                                if (date.getDay() < 1 || date.getDay() > 31) {
                                    do {
                                        System.out.println("Khong hop le, nhap lai");
                                        System.out.print("Nhap lai ngay: ");
                                        date.setDay(sc.nextInt());
                                    } while (date.getDay() < 1 || date.getDay() > 31);
                                }

                                System.out.print("Nhap mm: ");
                                date.setMonth(sc.nextInt());
                                if (date.getMonth() < 1 || date.getMonth() > 12) {
                                    do {
                                        System.out.println("Khong hop le, nhap lai");
                                        System.out.print("Nhap lai thang: ");
                                        date.setMonth(sc.nextInt());
                                    } while (date.getMonth() < 1 || date.getMonth() > 12);
                                }

                                System.out.print("Nhap yyyy: ");
                                date.setYear(sc.nextInt());
                                if (date.getYear() < 1943 || date.getYear() > namhientai) {
                                    do {
                                        System.out.println("Khong hop le, nhap lai");
                                        System.out.print("Nhap lai nam: ");
                                        date.setYear(sc.nextInt());
                                    } while (date.getYear() < 1943 || date.getYear() > namhientai);
                                }

                                AnhPhongCanh APC = new AnhDoiSong(Name, Ma_Anh, Kich_Thuoc_Anh, So_Luong_Anh,Thong_Tin_Anh, Mo_Ta, , Con_Nguoi, Dong_Vat, Hoat_Dong, date);
                                qlka.Them_Anh(APC);
                                System.out.println("Them thanh cong-----------");
                            }
                            break;
                            default:
                                if (Anh_1 == 0) {
                                    System.out.println("Thoat chuong trinh");
                                } else {
                                    System.out.println("Vui long nhap lai lua chon");
                                }
                        }
                    } while (Anh_1 != 0);
                    break;
                case 2:
                    if (qlka.Kiem_Tra_So_luong() == 0) {
                        System.out.println("Hien khong co may trong kho");
                    } else {
                        System.out.println("So may hien tai la: " + qlka.Kiem_Tra_So_Luong());
                    }
                    qlka.in_Thong_Tin_Anh();
                    System.out.println("\n");
                    break;
                case 3:
                    qlka.in_AnhThienNhien();
                    System.out.println("\n");
                    break;
                case 4:
                    qlka.in_AnhDoiSong();
                    System.out.println("\n");
                    break;
                case 5:
                    System.out.println("So anh hien tai la: " + qlka.kiem_Tra_So_Luong());
                    System.out.println("\n");
                    break;
                case 6:
                    sc.nextLine();
                    System.out.print("Nhap ten anh can tim: ");
                    String Name = sc.nextLine();
                    qlka.tim_anh_theo_ten(Name);
                    System.out.println("\n");
                    break;
                case 7:
                    sc.nextLine();
                    System.out.print("Nhap ma can tim: ");
                    String Code = sc.nextLine();
                    qlka.tim_anh_theo_ma(Ma_Anh);
                    System.out.println("\n");
                    break;
                case 8:
                    sc.nextLine();
                    System.out.print("Nhap ten can tim: ");
                    Name = sc.nextLine();
                    System.out.print("Nhap ma can tim: ");
                    Ma_Anh = sc.nextLine();
                    qlka.tim_anh_theo_tenvama(Name, Ma_Anh);
                    System.out.println("\n");
                    break;
                case 9:
                    sc.nextLine();
                    System.out.print("Nhap vao anh can xoa: ");
                    Ma_Anh = sc.nextLine();
                    AnhPhongCanh APC = new AnhPhongCanh(APC);
                    qlka.xoa_anh_theo_ten(Ma_Anh);
                    break;
                case 10:
                    sc.nextLine();
                    System.out.print("Nhap ma anh: ");
                    Ma_Anh = sc.nextLine();
                    qlka.tim_anh_theo_ma(Ma_Anh);
                    AnhPhongCanhc APC1 = new AnhPhongCanh(Ma_Anh));
                    qlka.xoa_anh_tinh_theo_ma(APC1);

                    qlka.ngay_xuat_kho();
                    System.out.println("Da xuat kho!!!!!");
                    break;
                default:
                    if (menu == 0) {
                        System.out.println("Thoat chuong trinh");
                    } else {
                        System.out.println("Vui long nhap lai lua chon");
                    }
            }
        } while (Anh != 0);
    }
}

    
        }
}
