package com.aws.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParametersAws {

    @JsonProperty("SERVER_PORT")
    private String serverPort;
    @JsonProperty("SECURITY_FILTER_OAUTH_INTROSPECT_URL")
    private String securityFilterUrl;
    @JsonProperty("API_INTEGRATION_URL_VIPOC_API")
    private String apiIntegrationUrl;
    @JsonProperty("AWS_PARAMETER_STORE")
    private String awsParameterStore;
    @JsonProperty("AMAZON_REGION")
    private String amazonRegion;

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    public String getSecurityFilterUrl() {
        return securityFilterUrl;
    }

    public void setSecurityFilterUrl(String securityFilterUrl) {
        this.securityFilterUrl = securityFilterUrl;
    }

    public String getApiIntegrationUrl() {
        return apiIntegrationUrl;
    }

    public void setApiIntegrationUrl(String apiIntegrationUrl) {
        this.apiIntegrationUrl = apiIntegrationUrl;
    }

    public String getAwsParameterStore() {
        return awsParameterStore;
    }

    public void setAwsParameterStore(String awsParameterStore) {
        this.awsParameterStore = awsParameterStore;
    }

    public String getAmazonRegion() {
        return amazonRegion;
    }

    public void setAmazonRegion(String amazonRegion) {
        this.amazonRegion = amazonRegion;
    }


}
