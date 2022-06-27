package com.latihan.produk.LatihanProduk;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.boot.test.context.SpringBootTest;

import com.latihan.produk.LatihanProduk.model.Produk;

@SpringBootTest
public class TestObjectFactory {
	public static Produk createProduct() {
		  final Produk produk = new Produk();
		  produk.setId(new Random().nextInt());
		  produk.setNama(RandomStringUtils.randomAlphabetic(10));
		  produk.setHargaBeli(new Random().nextLong());
		  produk.setHargaJual(new Random().nextLong());

		  return produk;
		}

		public static List<Produk> createProductList(final int size){
		  final List<Produk> result = new ArrayList<>();
		  for(int i=0; i<size; i++) {
		    result.add(createProduct());
		  }
		  return result;
		}
}
