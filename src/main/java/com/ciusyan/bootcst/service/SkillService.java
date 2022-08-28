package com.ciusyan.bootcst.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ciusyan.bootcst.pojo.po.Skill;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = true)
public interface SkillService extends IService<Skill> {

}
