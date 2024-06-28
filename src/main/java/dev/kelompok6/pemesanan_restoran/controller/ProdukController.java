package dev.kelompok6.pemesanan_restoran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.kelompok6.pemesanan_restoran.dto.ProdukDto;
import dev.kelompok6.pemesanan_restoran.service.ProdukService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("produk")
public class ProdukController {

  @Autowired
  ProdukService produkService;

  @PostMapping("simpan")
  public String simpan(@Valid ProdukDto produkDto, BindingResult result) {
    if (result.hasErrors()) {
      return "redirect:/produk";
    }
    produkService.saveProduk(produkDto);
    return "redirect:/produk";
  }

  @GetMapping("hapus/{id}")
  public String hapus(@PathVariable("id") Integer id) {
    produkService.deleteProduk(id);
    return "redirect:/produk";
  }
}
