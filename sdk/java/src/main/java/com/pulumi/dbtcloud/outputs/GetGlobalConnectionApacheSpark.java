// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGlobalConnectionApacheSpark {
    /**
     * @return Auth
     * 
     */
    private String auth;
    /**
     * @return Spark cluster for the connection
     * 
     */
    private String cluster;
    /**
     * @return Connection retries. Default=0
     * 
     */
    private Integer connectRetries;
    /**
     * @return Connection time out in seconds. Default=10
     * 
     */
    private Integer connectTimeout;
    /**
     * @return Hostname of the connection
     * 
     */
    private String host;
    /**
     * @return Authentication method for the connection (http or thrift).
     * 
     */
    private String method;
    /**
     * @return Organization ID
     * 
     */
    private String organization;
    /**
     * @return Port for the connection. Default=443
     * 
     */
    private Integer port;
    /**
     * @return User
     * 
     */
    private String user;

    private GetGlobalConnectionApacheSpark() {}
    /**
     * @return Auth
     * 
     */
    public String auth() {
        return this.auth;
    }
    /**
     * @return Spark cluster for the connection
     * 
     */
    public String cluster() {
        return this.cluster;
    }
    /**
     * @return Connection retries. Default=0
     * 
     */
    public Integer connectRetries() {
        return this.connectRetries;
    }
    /**
     * @return Connection time out in seconds. Default=10
     * 
     */
    public Integer connectTimeout() {
        return this.connectTimeout;
    }
    /**
     * @return Hostname of the connection
     * 
     */
    public String host() {
        return this.host;
    }
    /**
     * @return Authentication method for the connection (http or thrift).
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Organization ID
     * 
     */
    public String organization() {
        return this.organization;
    }
    /**
     * @return Port for the connection. Default=443
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return User
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalConnectionApacheSpark defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String auth;
        private String cluster;
        private Integer connectRetries;
        private Integer connectTimeout;
        private String host;
        private String method;
        private String organization;
        private Integer port;
        private String user;
        public Builder() {}
        public Builder(GetGlobalConnectionApacheSpark defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.cluster = defaults.cluster;
    	      this.connectRetries = defaults.connectRetries;
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.host = defaults.host;
    	      this.method = defaults.method;
    	      this.organization = defaults.organization;
    	      this.port = defaults.port;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder auth(String auth) {
            if (auth == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionApacheSpark", "auth");
            }
            this.auth = auth;
            return this;
        }
        @CustomType.Setter
        public Builder cluster(String cluster) {
            if (cluster == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionApacheSpark", "cluster");
            }
            this.cluster = cluster;
            return this;
        }
        @CustomType.Setter
        public Builder connectRetries(Integer connectRetries) {
            if (connectRetries == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionApacheSpark", "connectRetries");
            }
            this.connectRetries = connectRetries;
            return this;
        }
        @CustomType.Setter
        public Builder connectTimeout(Integer connectTimeout) {
            if (connectTimeout == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionApacheSpark", "connectTimeout");
            }
            this.connectTimeout = connectTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder host(String host) {
            if (host == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionApacheSpark", "host");
            }
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder method(String method) {
            if (method == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionApacheSpark", "method");
            }
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder organization(String organization) {
            if (organization == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionApacheSpark", "organization");
            }
            this.organization = organization;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionApacheSpark", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionApacheSpark", "user");
            }
            this.user = user;
            return this;
        }
        public GetGlobalConnectionApacheSpark build() {
            final var _resultValue = new GetGlobalConnectionApacheSpark();
            _resultValue.auth = auth;
            _resultValue.cluster = cluster;
            _resultValue.connectRetries = connectRetries;
            _resultValue.connectTimeout = connectTimeout;
            _resultValue.host = host;
            _resultValue.method = method;
            _resultValue.organization = organization;
            _resultValue.port = port;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
