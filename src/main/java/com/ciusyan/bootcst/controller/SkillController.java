package com.ciusyan.bootcst.controller;

import com.ciusyan.bootcst.pojo.po.Skill;
import com.ciusyan.bootcst.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {

    @Autowired
    SkillService skillService;

    @GetMapping("/list")
    public List<Skill> list() {
        return skillService.list();
    }

}
