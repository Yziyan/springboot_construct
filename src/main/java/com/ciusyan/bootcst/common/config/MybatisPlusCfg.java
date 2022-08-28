package com.ciusyan.bootcst.common.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 程序中必须要有这一句，用于扫描Mapper。但可以不用放这
@MapperScan("com.ciusyan.bootcst.mappers")
public class MybatisPlusCfg implements InitializingBean {

    // MybatisPlus 分页设置
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor innerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        // 当页数超过总页数时，自动跳回第一页
        innerInterceptor.setOverflow(true);
        interceptor.addInnerInterceptor(innerInterceptor);
        return interceptor;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
