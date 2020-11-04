package com.thoughtworks.capability.gtb.entrancequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GtbEntranceQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtbEntranceQuizApplication.class, args);
	}

}

// TODO GTB-完成度: * 完成了大部分功能，没有进行参数校验和异常处理
// TODO GTB-完成度: * 查询学员列表返回所有学员，与需求不符合
// TODO GTB-完成度: * 没有分离分组和查询分组的接口
// TODO GTB-完成度: * 新增学员的接口没有校验学员姓名为空的情况
// TODO GTB-测试: * 包含了小部分测试，但是没有测试到什么
// TODO GTB-知识点: * Spring MVC相关的知识点掌握的不错
// TODO GTB-知识点: * 使用了CorsFilter设置跨域
// TODO GTB-工程实践: * git commit message表意，遵循了小步提交