/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Truon
 */
public class AnhThienNhien {

public class AnhThienNhien extends AnhPhongCanh {

    private String Thoi_Tiet, Noi_Chup;
    
    public AnhThienNhien() {
    }

    public AnhThienNhien(String Name, String Ma_Anh, String Kich_Thuoc_Anh, String Thong_Tin_Anh, String Mo_Ta, int So_Luong_Anh, NgayNhapXuat date, String Thoi_Tiet, String Noi_Chup) {
        super(Name, NSX, Code, CPU, CardDoHoa, RAM, ROM, Price, date);
        this.Thoi_Tiet = Thoi_Tiet;
        this.Noi_Chup = Noi_Chup;
    }

    public String getThoi_Tiet() {
        return Thoi_Tiet;
    }

    public void setThoi_Tiet(String Thoi_Tiet) {
        this.Thoi_Tiet = Thoi_Tiet;
    }

    public String getNoi_Chup() {
        return Noi_Chup;
    }

    public void setNoi_Chup(String Noi_Chup) {
        this.Noi_Chup = Noi_Chup;
    }


    @Override
    public String toString() {
        return "AnhDoiSong{" + super.toString() + ", Noi_Chup=" + Noi_Chup + ", Thoi_Tiet=" + Thoi_Tiet + '}';
    }
}

}
