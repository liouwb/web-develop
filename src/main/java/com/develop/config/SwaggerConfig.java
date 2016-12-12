package com.develop.config;

import com.develop.test.app.controller.TestController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;

/**
 * Author: HUI
 * Date: 15/10/28
 * Time: 下午4:02
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackageClasses = {
        TestController.class
})
public class SwaggerConfig {
    @Bean
    public Docket developApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .directModelSubstitute(LocalDate.class, String.class)
                .genericModelSubstitutes(ResponseEntity.class)
                .useDefaultResponseMessages(false);
    }

    @Bean
    UiConfiguration uiConfig() {
        return UiConfiguration.DEFAULT;
    }

    /**
     * 修改 swagger 主界面文字
     *
     * @return swagger 界面显示信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "API 文档",
                "",
                "1.0",
                "/web-develop",
                "测试用 swagger-ui",
                "",
                ""
        );
    }
}
