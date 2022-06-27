package com.latihan.produk.LatihanProduk.service;

import java.util.List;

import com.latihan.produk.LatihanProduk.model.Produk;

public interface ProdukService {
	List<Produk> findAllProduk();

	Produk findProdukById(int id);

	Produk saveorUpdateProduk(Produk produk);

	void deleteProduk(int id);
}
