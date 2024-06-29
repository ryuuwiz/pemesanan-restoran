package dev.kelompok6.pemesanan_restoran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.kelompok6.pemesanan_restoran.dto.FormPesananDto;
import dev.kelompok6.pemesanan_restoran.service.PesananService;
import jakarta.validation.Valid;

@Controller
@RequestMapping("pesanan")
public class PesananController {

  @Autowired
  PesananService pesananService;

  @PostMapping("simpan")
  public String simpan(@Valid FormPesananDto formPesanan, BindingResult result) {
    if (result.hasErrors()) {
      return "redirect:/pesanan";
    }
    pesananService.savePesanan(formPesanan);
    return "redirect:/pesanan";
  }

  @GetMapping("hapus/{id}")
  public String hapus(@PathVariable("id") Integer id) {
    pesananService.deletePesanan(id);
    return "redirect:/pesanan";
  }
}
