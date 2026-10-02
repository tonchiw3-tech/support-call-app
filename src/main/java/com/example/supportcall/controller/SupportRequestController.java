package com.example.supportcall.controller;

import com.example.supportcall.service.SupportRequestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller public class SupportRequestController {
  private final SupportRequestService service;
  public SupportRequestController(SupportRequestService service){this.service=service;}
  @GetMapping("/") public String index(@RequestParam(required=false) String roomNumber, Model model){model.addAttribute("roomNumber",roomNumber==null?"":roomNumber); model.addAttribute("latest",service.latest(roomNumber)); return "index";}
  @PostMapping("/requests") public String create(@RequestParam String roomNumber,@RequestParam String requestContent){service.create(roomNumber,requestContent); return "redirect:/?roomNumber="+roomNumber+"&sent=true";}
  @GetMapping("/staff") public String staff(Model model){model.addAttribute("requests",service.active()); return "staff";}
  @GetMapping("/staff/history") public String history(Model model){model.addAttribute("requests",service.history()); return "history";}
  @PostMapping("/staff/requests/{id}/confirm") public String confirm(@PathVariable Long id){service.confirm(id); return "redirect:/staff";}
  @PostMapping("/staff/requests/{id}/complete") public String complete(@PathVariable Long id){service.complete(id); return "redirect:/staff";}
}
