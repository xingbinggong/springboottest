package com.xingbg.springboottest.config;

import com.xingbg.springboottest.pojo.PersionProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PersionProperties.class)
public class PersionConfiguration {
}
