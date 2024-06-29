package dev.kelompok6.pemesanan_restoran.dto;

import dev.kelompok6.pemesanan_restoran.model.Pesanan;
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

  public static PesananDto mapPesananDto(Pesanan pesanan) {
    PesananDto pesananDto = new PesananDto();
    pesananDto.setId_pesanan(pesanan.getId_pesanan());
    pesananDto.setNama_pelanggan(pesanan.getNama_pelanggan());
    pesananDto.setNo_meja(pesanan.getNo_meja());
    pesananDto.setTgl_pesan(pesanan.getTgl_pesan());
    pesananDto.setJumlah(pesanan.getJumlah());
    pesananDto.setSubtotal(pesanan.getSubtotal());
    pesananDto.setProduk(pesanan.getProduk());
    return pesananDto;
  }

  public static Pesanan mapPesanan(PesananDto pesananDto) {
    Pesanan pesanan = new Pesanan();
    pesanan.setNama_pelanggan(pesananDto.getNama_pelanggan());
    pesanan.setNo_meja(pesananDto.getNo_meja());
    pesanan.setTgl_pesan(pesananDto.getTgl_pesan());
    pesanan.setJumlah(pesananDto.getJumlah());
    pesanan.setSubtotal(pesananDto.getProduk().getHarga() * Double.valueOf(pesananDto.getJumlah()));
    pesanan.setProduk(pesananDto.getProduk());
    return pesanan;
  }
}
