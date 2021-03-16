package com.xingbg.springboottest.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Map;

@ConfigurationProperties(prefix = "persion")
@Validated
public class PersionProperties {
    private String name;

    @Email(message = "请输入邮件格式")
    private String email;

    private Map<String,String> extend;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, String> extend) {
        this.extend = extend;
    }

    @Override
    public String toString() {
        return "PersionProperties{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", extend=" + extend +
                '}';
    }
}
