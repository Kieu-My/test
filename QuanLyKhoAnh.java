/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truon
 */
public class QuanLyKhoAnh {


    ArrayList<AnhPhongCanh> APCn = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void them_hinh_anh(AnhPhongCanh APC) {
        APCn.add(APC);
    }

    public void in_thong_tin_Anh() {
        for (AnhPhongCanh AnhPhongCanh : APCn) {
            System.out.println(AnhPhongCanh.toString());
        }
    }

    public void in_AnhThienNhien() {
        for (AnhPhongCanh AnhPhongCanh : APCn) {
            if (AnhPhongCanh instanceof AnhDoiong) {
                System.out.println(AnhPhongCanh.toString());
            }
        }
    }

    public void in_AnhDoiSong() {
        for (AnhPhongCanh AnhPhongCanh : APCn) {
            if ( AnhPhongCanh instanceof AnhThienNhien) {
                System.out.println(AnhPhongCanh.toString());
            }
        }
    }

    public int kiem_tra_so_luong() {
        return APCn.size();
    }

    public void tim_anh_theo_ten(String name) {
        for (AnhPhongCanh AnhPhongCanh : APCn) {
            if (AnhPhongCanh.getName().indexOf(name) >= 0) {
                System.out.println(AnhPhongCanh);
            }
        }
    }

    public void tim_may_theo_ma(String Ma_Anh) {
        for (AnhPhongCanh AnhPhongCanh : APCn) {
            if (AnhPhongCanh.getMa_Anh().indexOf(Ma_Anh) >= 0) {
                System.out.println(AnhPhongCanh);
            }
        }
    }

    public void tim_may_theo_tenvama(String name, String Ma_Anh) {
        for (AnhPhongCanh AnhPhongCanh : APCn) {
            if (AnhPhongCanh.getName().indexOf(name) >= 0 && AnhPhongCanh.getMa_Anh().indexOf(Ma_Anh) >= 0) {
                System.out.println(AnhPhongCanh);
            }
        }
    }

    public void kiem_tra_ton_tai(String Ma_Anh) {
        for (AnhPhongCanh AnhPhongCanh : APCn) {
            if (APCn.contains(Ma_Anh)) {
                System.out.println(AnhPhongCanh);
            }
        }
    }
    public boolean xoa_anh_theo_code(AnhPhongCanh APC) {
        return APCn.remove(APC);
    }

    public void ngay_xuat_kho() {
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.print("Thoi gian xuat may tinh cua he thong: " + date);
        System.out.println("\n");
    }
}
    
}
