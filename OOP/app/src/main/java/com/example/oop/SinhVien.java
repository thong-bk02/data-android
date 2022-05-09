package com.example.oop;

public class SinhVien {
    private String hoten;
    private String diachi;
    private int namsinh;
    private int stt;

    //hàm tạo Contruct
    public SinhVien(){//hàm tạo k tham số
        hoten = "null";
        diachi = "null";
        namsinh = 0;
    }
    public  SinhVien(String name, String address, int year){//hàm tạo có tham số
        hoten = name;
        diachi = address;
        namsinh = year;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getHoten() {
        return hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
}
