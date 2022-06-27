package com.latihan.produk.LatihanProduk.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.latihan.produk.LatihanProduk.model.Produk;
import com.latihan.produk.LatihanProduk.service.ProdukService;

@RestController
@RequestMapping(value = "/api/v1")
public class ProdukController {
    @Autowired
	ProdukService produkService;

	@CrossOrigin
	@GetMapping("/produk")
	public List<Produk> list() {
		return produkService.findAllProduk();
	}

	@CrossOrigin
	@GetMapping("/produk/{id}")
	public ResponseEntity<Produk> produk(@PathVariable Integer id) {
		try {
			Produk produk = produkService.findProdukById(id);
			return new ResponseEntity<Produk>(produk, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Produk>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@PostMapping("/produk")
	public ResponseEntity<?> produk(@RequestBody Produk produk) {
		produkService.saveorUpdateProduk(produk);
		return new ResponseEntity<>("Berhasil simpan data produk.", HttpStatus.OK);
	}

	@CrossOrigin
	@PutMapping("/produk/{id}")
	public ResponseEntity<?> update(@RequestBody Produk produk, @PathVariable Integer id) {
		try {
			Produk existProduk = produkService.findProdukById(id);
			if (existProduk.getId() != id) {
				return new ResponseEntity<>("ID Tidak Ada !!",HttpStatus.OK);
			}
			produk.setId(id);
			produkService.saveorUpdateProduk(produk);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@DeleteMapping("/produk/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		produkService.deleteProduk(id);
		return new ResponseEntity<>("Berhasil hapus data produk.", HttpStatus.OK);
	}
}
