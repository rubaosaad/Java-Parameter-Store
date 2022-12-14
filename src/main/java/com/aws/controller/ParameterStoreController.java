package com.aws.controller;

import com.aws.model.ParametersAws;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

@Component
public class ParameterStoreController {

    final private static String PROPERTIES_FILE_PATH = "application.properties";

    final private static String PROPERTIES_FILE_PATH_OUT = "src/main/resources/application.properties";
    final private static String CONTEXT_PATH = "server.servlet.context-path";
    final private static String SERVER_PORT = "server.port";

    @Value("${application}")
    private String myParameter;

    @Value("${server.servlet.context-path}")
    private String path;

    public void execute() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        ParametersAws map = objectMapper.readValue(myParameter, ParametersAws.class);

        Properties prop = new Properties();
        InputStream in = ParameterStoreController.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE_PATH);
        prop.load(in);
        prop.setProperty(CONTEXT_PATH, map.getApiIntegrationUrl());
        prop.setProperty(SERVER_PORT, map.getServerPort());
        prop.store(new FileOutputStream(PROPERTIES_FILE_PATH_OUT), null);


    }
}
