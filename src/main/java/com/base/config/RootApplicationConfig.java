package com.base.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
@Import({JdbcConfig.class})
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)}, basePackages = {"com.base.mvc"})
@PropertySource("classpath:properties/common.properties")
public class RootApplicationConfig {
}
