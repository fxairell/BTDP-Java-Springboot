package com.latihan.produk.LatihanProduk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.latihan.produk.LatihanProduk.model.Produk;
import com.latihan.produk.LatihanProduk.repository.ProdukRepository;
import com.latihan.produk.LatihanProduk.service.ProdukService;

@Service
public class ProdukServiceImpl implements ProdukService {
	@Autowired
	private ProdukRepository produkRepository;

	@Override
	public List<Produk> findAllProduk() {
		return produkRepository.findAll();
	}

	@Override
	public Produk saveorUpdateProduk(Produk produk) {
		return produkRepository.save(produk);
	}

	@Override
	public Produk findProdukById(int id) {
		Produk produk = produkRepository.findById(id).orElse(new Produk());
		return produk;
	}

	@Override
	public void deleteProduk(int id) {
		Produk produk = produkRepository.findById(id).orElse(new Produk());
		produkRepository.delete(produk);
	}
}
