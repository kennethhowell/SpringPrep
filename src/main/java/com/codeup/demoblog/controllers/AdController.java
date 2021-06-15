package com.codeup.demoblog.controllers;

import com.codeup.demoblog.daos.AdRepository;
import com.codeup.demoblog.models.Ad;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdController {
    private final AdRepository adDao;

    public AdController(AdRepository adDao){
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String index(Model model) {
        model.addAttribute("ads", adDao.findAll());
        model.addAttribute("topAd", adDao.findByTitle("bicycle north side"));
        model.addAttribute("searchAd", adDao.findByTitleLike("%childcare%"));
        return "ads/index";
    }

    @GetMapping("/ads/create")
    public String createAd(Model model){

        model.addAttribute("ad", new Ad());
        return "ads/create";
    }

    @PostMapping("/ads/create")
    public String saveAd(@ModelAttribute Ad ad){
//        Ad saveAd = ad;
        adDao.save(ad);

        return "redirect:/ads";


    }


}
