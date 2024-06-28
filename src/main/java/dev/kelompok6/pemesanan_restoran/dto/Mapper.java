package dev.kelompok6.pemesanan_restoran.dto;

import dev.kelompok6.pemesanan_restoran.model.Produk;

public class Mapper {
  public static ProdukDto mapProdukDto(Produk produk) {
    ProdukDto produkDto = new ProdukDto();
    produkDto.setId(produk.getId_produk());
    produkDto.setNama_produk(produk.getNama_produk());
    produkDto.setHarga(produk.getHarga());
    return produkDto;
  }

  public static Produk mapProduk(ProdukDto produkDto) {
    Produk produk = new Produk();
    produk.setNama_produk(produkDto.getNama_produk());
    produk.setHarga(produkDto.getHarga());
    return produk;
  }
}
