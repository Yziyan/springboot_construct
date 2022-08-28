package com.ciusyan.bootcst.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ciusyan.bootcst.mappers.SkillMapper;
import com.ciusyan.bootcst.pojo.po.Skill;
import com.ciusyan.bootcst.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl
        extends ServiceImpl<SkillMapper, Skill> implements SkillService {

}
