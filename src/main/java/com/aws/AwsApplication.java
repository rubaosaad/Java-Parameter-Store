package com.aws;

import com.aws.controller.ParameterStoreController;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsApplication implements InitializingBean {

    public static void main(String[] args) {
        SpringApplication.run(AwsApplication.class, args);
    }

    private final ParameterStoreController parameterStoreController;

    public AwsApplication(ParameterStoreController parameterStoreController) {
        this.parameterStoreController = parameterStoreController;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        parameterStoreController.execute();
    }


}
