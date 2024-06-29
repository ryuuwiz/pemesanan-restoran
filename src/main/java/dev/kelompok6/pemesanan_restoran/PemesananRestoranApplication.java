package dev.kelompok6.pemesanan_restoran;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.kelompok6.pemesanan_restoran.dto.ProdukDto;
import dev.kelompok6.pemesanan_restoran.service.ProdukService;

@SpringBootApplication
public class PemesananRestoranApplication {

	@Autowired
	ProdukService produkService;

	public static void main(String[] args) {
		SpringApplication.run(PemesananRestoranApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {

		ProdukDto seedProduk1 = new ProdukDto();
		seedProduk1.setNama_produk("Bakso");
		seedProduk1.setHarga(20000);

		ProdukDto seedProduk2 = new ProdukDto();
		seedProduk2.setNama_produk("Mie Ayam");
		seedProduk2.setHarga(15000);

		ProdukDto seedProduk3 = new ProdukDto();
		seedProduk3.setNama_produk("Es Teh Manis");
		seedProduk3.setHarga(5000);
		return (args) -> {
			produkService.saveProduk(seedProduk1);
			produkService.saveProduk(seedProduk2);
			produkService.saveProduk(seedProduk3);
		};
	}

}
