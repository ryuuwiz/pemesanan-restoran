package dev.kelompok6.pemesanan_restoran.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Produk {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id_produk;

  @NotBlank
  @NotNull
  private String nama_produk;

  @NotNull
  private double harga;
}
