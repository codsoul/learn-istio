package com.latteyan.demo.ms.members.controller;

import com.latteyan.demo.ms.members.dto.ProfileDTO;
import com.latteyan.demo.ms.members.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/{memberId}")
    public ProfileDTO findById(@PathVariable Long memberId) {
        return profileService.findById(memberId);
    }
}
