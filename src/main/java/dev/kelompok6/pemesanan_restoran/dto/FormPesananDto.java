package dev.kelompok6.pemesanan_restoran.dto;

import lombok.Data;

@Data
public class FormPesananDto {
  private String nama_pelanggan;
  private int no_meja;
  private int id_produk;
  private String tgl_pesan;
  private int jumlah;
}
