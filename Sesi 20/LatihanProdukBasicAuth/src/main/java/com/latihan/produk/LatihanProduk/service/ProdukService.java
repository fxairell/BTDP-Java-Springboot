package com.latihan.produk.LatihanProduk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.latihan.produk.LatihanProduk.model.Produk;
import com.latihan.produk.LatihanProduk.repository.ProdukRepository;

@Service
@Transactional
public class ProdukService {
    @Autowired
	private ProdukRepository produkRepository;

	public List<Produk> listAllProduk() {
		return produkRepository.findAll();
	}

	public void saveProduk(Produk produk) {
		produkRepository.save(produk);
	}

	public Produk getProduk(Integer id) {
		return produkRepository.findById(id).get();
	}

	public void deleteProduk(Integer id) {
		produkRepository.deleteById(id);
	}
}
