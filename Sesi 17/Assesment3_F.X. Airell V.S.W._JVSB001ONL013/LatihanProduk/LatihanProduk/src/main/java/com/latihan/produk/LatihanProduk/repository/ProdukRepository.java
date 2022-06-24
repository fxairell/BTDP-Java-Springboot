package com.latihan.produk.LatihanProduk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.latihan.produk.LatihanProduk.model.Produk;

public interface ProdukRepository extends JpaRepository<Produk, Integer> {
    
}
