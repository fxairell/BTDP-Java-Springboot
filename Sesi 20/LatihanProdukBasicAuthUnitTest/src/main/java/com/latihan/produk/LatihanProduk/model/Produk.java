package com.latihan.produk.LatihanProduk.model;

import javax.persistence.*;

@Entity
@Table(name = "produk")
public class Produk {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	private String nama;
	private float hargaBeli;
    private float hargaJual;
	
	public Produk() {
	}
	
	public Produk(int id, String nama, float hargaBeli, float hargaJual) {
		this.id = id;
		this.nama = nama;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
    public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public float getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(float hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

    public float getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(float hargaJual) {
		this.hargaJual = hargaJual;
	}
}
