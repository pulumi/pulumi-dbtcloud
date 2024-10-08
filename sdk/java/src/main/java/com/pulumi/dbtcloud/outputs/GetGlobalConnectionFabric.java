// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGlobalConnectionFabric {
    /**
     * @return The database to connect to for this connection.
     * 
     */
    private String database;
    /**
     * @return The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
     * 
     */
    private Integer loginTimeout;
    /**
     * @return The port to connect to for this connection. Default=1433
     * 
     */
    private Integer port;
    /**
     * @return The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
     * 
     */
    private Integer queryTimeout;
    /**
     * @return The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
     * 
     */
    private Integer retries;
    /**
     * @return The server hostname.
     * 
     */
    private String server;

    private GetGlobalConnectionFabric() {}
    /**
     * @return The database to connect to for this connection.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
     * 
     */
    public Integer loginTimeout() {
        return this.loginTimeout;
    }
    /**
     * @return The port to connect to for this connection. Default=1433
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
     * 
     */
    public Integer queryTimeout() {
        return this.queryTimeout;
    }
    /**
     * @return The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
     * 
     */
    public Integer retries() {
        return this.retries;
    }
    /**
     * @return The server hostname.
     * 
     */
    public String server() {
        return this.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalConnectionFabric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private Integer loginTimeout;
        private Integer port;
        private Integer queryTimeout;
        private Integer retries;
        private String server;
        public Builder() {}
        public Builder(GetGlobalConnectionFabric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.loginTimeout = defaults.loginTimeout;
    	      this.port = defaults.port;
    	      this.queryTimeout = defaults.queryTimeout;
    	      this.retries = defaults.retries;
    	      this.server = defaults.server;
        }

        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionFabric", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder loginTimeout(Integer loginTimeout) {
            if (loginTimeout == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionFabric", "loginTimeout");
            }
            this.loginTimeout = loginTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionFabric", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder queryTimeout(Integer queryTimeout) {
            if (queryTimeout == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionFabric", "queryTimeout");
            }
            this.queryTimeout = queryTimeout;
            return this;
        }
        @CustomType.Setter
        public Builder retries(Integer retries) {
            if (retries == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionFabric", "retries");
            }
            this.retries = retries;
            return this;
        }
        @CustomType.Setter
        public Builder server(String server) {
            if (server == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionFabric", "server");
            }
            this.server = server;
            return this;
        }
        public GetGlobalConnectionFabric build() {
            final var _resultValue = new GetGlobalConnectionFabric();
            _resultValue.database = database;
            _resultValue.loginTimeout = loginTimeout;
            _resultValue.port = port;
            _resultValue.queryTimeout = queryTimeout;
            _resultValue.retries = retries;
            _resultValue.server = server;
            return _resultValue;
        }
    }
}
