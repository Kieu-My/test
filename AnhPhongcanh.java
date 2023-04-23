/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truon
 */
public class AnhPhongcanh {
  
public class AnhPhongCanh implements Comparable<AnhPhongCanh> {

    private String Name, Ma_Anh, Kich_Thuoc_Anh, Thong_Tin_Anh, Mo_Ta_Anh, 
    private int So_Luong_Anh;
    private NgayNhapXuat date;

    public AnhPhongCanh() {
    }

    public AnhPhongCanh(String Ma_Anh) {
        this.Ma_Anh = Ma_Anh;
    }
    
    public AnhPhongCanh(String Name, String Ma_Anh, String Kich_Thuoc_Anh, String Thong_Tin_Anh, String Mo_Ta_Anh, int So_Luong_Anh, NgayNhapXuat date) {
        this.Name = Name;
        this.Ma_Anh = Ma_Anh;
        this.Mo_Ta_Anh = Mo_Ta_Anh;
        this.So_Luong_Anh = So_Luong_Anh;
        this.Thong_Tin_Anh = Thong_Tin_Anh;
        this.date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMa_Anh() {
        return Ma_Anh;
    }

    public void setMa_Anh(String Ma_Anh) {
        this.Ma_Anh = Ma_Anh;
    }

    public String getMo_Ta_Anh() {
        return Mo_Ta_Anh;
    }

    public void setMo_Ta_Anh(String Mo_Ta_Anh) {
        this.Mo_Ta_Anh = Mo_Ta_Anh;
    }

    public String getThong_Tin_Anh() {
        return Thong_Tin_Anh;
    }

    public void setThong_Tin_Anh(String Thong_Tin_Anh) {
        this.Thong_Tin_Anh = Thong_Tin_Anh;
    }
    public int getSo_Luong_Anh() {
        return So_Luong_Anh;
    }

    public void setSo_Luong_Anh(int So_Luong_Anh) {
        this.So_Luong_Anh = So_Luong_Anh;
    }

    public NgayNhapXuat getDate() {
        return date;
    }

    public void setDate(NgayNhapXuat date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Name=" + Name + ", Ma_Anh=" + Ma_Anh + ", Kich_Thuoc_Anh=" + Kich_Thuoc_Anh + ", So_Luong_Anh=" + So_Luong_Anh + ", Thong_Tin_Anh=" + Thong_Tin_Anh + ", date=" + date;
    }
    
    @Override
    public int compareTo(AnhPhongCanh o) {
        return this.Ma_Anh.compareTo(o.Ma_Anh);
    }
    
    @Override
    public int hashMa_Anh() {
        return Ma_Anh.compareTo(Ma_Anh);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof AnhPhongCanh) {
            AnhPhongCanh another = (AnhPhongCanh) obj;
            if (this.Ma_Anh.equals(another.Ma_Anh)) {
                return true;
            }
        }return false;
    }
}
}
