package org.aibles.sell.entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "khachhang")
public class Customer {

    @Id

    @Column(name = "MAKH", insertable = false, updatable = false)
    private Long maKhachHang;

    @Column(name = "HOTEN")
    private String hoTen;

    @Column(name = "DIACHI")
    private String diaChi;

    @Column(name = "SODT")
    private String soDienThoai;

    @Column(name = "NGSINH")
    private Date ngaySinh;

    @Column(name = "DOANHSO")
    private Double doanhSo;

    @Column(name = "NGDK")
    private Date ngayDangKy;

    @Column(name = "LOAIKH")
    private String loaiKhachHang;

    @Column(name = "LOAIKH_ID")
    private Long loaiKhachHangId;

    public Long getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public Double getDoanhSo() {
        return doanhSo;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public Long getLoaiKhachHangId() {
        return loaiKhachHangId;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setDoanhSo(Double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public void setLoaiKhachHangId(Long loaiKhachHangId) {
        this.loaiKhachHangId = loaiKhachHangId;
    }

    public void setMaKhachHang(Long maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

}
