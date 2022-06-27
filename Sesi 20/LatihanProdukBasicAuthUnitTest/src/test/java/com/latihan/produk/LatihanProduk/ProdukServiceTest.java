package com.latihan.produk.LatihanProduk;

import static org.mockito.Mockito.times;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.util.ReflectionTestUtils;

import com.latihan.produk.LatihanProduk.model.Produk;
import com.latihan.produk.LatihanProduk.repository.ProdukRepository;
import com.latihan.produk.LatihanProduk.service.ProdukService;
import com.latihan.produk.LatihanProduk.service.impl.ProdukServiceImpl;

@RunWith(SpringRunner.class)
public class ProdukServiceTest {
	@InjectMocks
	private ProdukService produkService = new ProdukServiceImpl();

	@Mock
	private ProdukRepository produkRepository;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		ReflectionTestUtils.setField(produkService, "produkRepository", produkRepository);
	}

	@Test
	public void testFindAll() {
		final List<Produk> datas = TestObjectFactory.createProductList(10);
		Mockito.when(produkRepository.findAll()).thenReturn(datas);

		final List<Produk> actual = produkService.findAllProduk();
		MatcherAssert.assertThat(actual.size(), Matchers.equalTo(datas.size()));
	}

	@Test
	public void testProdukById() throws Exception {
		final int id = new Random().nextInt();
		final Produk produk = TestObjectFactory.createProduct();
		Mockito.when(produkRepository.findById(id)).thenReturn(Optional.of(produk));

		final Produk actual = produkService.findProdukById(id);
		MatcherAssert.assertThat(actual.getId(), Matchers.equalTo(produk.getId()));
		MatcherAssert.assertThat(actual.getNama(), Matchers.equalTo(produk.getNama()));
		MatcherAssert.assertThat(actual.getHargaBeli(), Matchers.equalTo(produk.getHargaBeli()));
		MatcherAssert.assertThat(actual.getHargaJual(), Matchers.equalTo(produk.getHargaJual()));
	}

	@Test
	public void testProdukByIdWithNullDataFromDB() throws Exception {
		final int id = new Random().nextInt();

		Mockito.when(produkRepository.findById(id)).thenReturn(Optional.empty());
		final Produk actual = produkService.findProdukById(id);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testSaveUpdateProduk() {
		final Produk produk = TestObjectFactory.createProduct();
		Mockito.when(produkRepository.save(produk)).thenReturn(produk);

		final Produk actual = produkService.saveorUpdateProduk(produk);
		MatcherAssert.assertThat(actual, Matchers.notNullValue());
	}

	@Test
	public void testDeleteProduk() {
		final int id = new Random().nextInt();
		Produk produk = TestObjectFactory.createProduct();

		Mockito.when(produkRepository.findById(id)).thenReturn(Optional.of(produk));
		Mockito.doNothing().when(produkRepository).delete(produk);
		produkService.deleteProduk(id);

		Mockito.verify(produkRepository, times(1)).delete(produk);
	}
}
