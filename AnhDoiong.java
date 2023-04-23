/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truon
 */
public class AnhDoiong {

public class AnhDoiSong extends AnhPhongCanh {

    private String Con_Nguoi, Dong_Vat, Hoat_Dong;

    public AnhDoiSong() {
    }

    public AnhDoiSong(String Name, String Ma_Anh, String Thong_Tin_Anh, String Mo_Ta_Anh, int So_Luong_Anh, NgayNhapXuat date, String Con_Nguoi, String Dong_Vat, String Hoat_Dong)
        this.Con_Nguoi = Con_Nguoi;
        this.Dong_Vat = Dong_Vat;
        this.Hoat_Dong = Hoat_Dong;
        
    }

    public String getCon_Nguoi() {
        return Con_Nguoi;
    }

    public void setCon_Nguoi(String Con_Nguoi) {
        this.Con_Nguoi = Con_Nguoi;
    }

    public String getDong_Vat() {
        return Dong_Vat;
    }

    public void setDong_Vat(String Dong_Vat) {
        this. = Dong_Vat;
    }

    public String getHoat_Dong() {
        return Hoat_Dong;
    }

    public void setHoat_Dong(String Hoat_Dong) {
        this.Hoat_Dong = Hoat_Dong;
    }

    @Override
    public String toString() {
        return "AnhDoiSong{" + super.toString() + ", Con_Nguoi=" + Con_Nguoi + ", Dong_Vat=" + Dong_Vat + ", Hoat_Dong=" + Hoat_Dong + '}';
    }
}
    
}
