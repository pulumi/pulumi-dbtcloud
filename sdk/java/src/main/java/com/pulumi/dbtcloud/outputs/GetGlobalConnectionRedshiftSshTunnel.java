// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGlobalConnectionRedshiftSshTunnel {
    /**
     * @return The hostname for the SSH tunnel.
     * 
     */
    private String hostname;
    /**
     * @return The ID of the SSH tunnel connection.
     * 
     */
    private Integer id;
    /**
     * @return The HTTP port for the SSH tunnel.
     * 
     */
    private Integer port;
    /**
     * @return The SSH public key generated to allow connecting via SSH tunnel.
     * 
     */
    private String publicKey;
    /**
     * @return The username to use for the SSH tunnel.
     * 
     */
    private String username;

    private GetGlobalConnectionRedshiftSshTunnel() {}
    /**
     * @return The hostname for the SSH tunnel.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The ID of the SSH tunnel connection.
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return The HTTP port for the SSH tunnel.
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return The SSH public key generated to allow connecting via SSH tunnel.
     * 
     */
    public String publicKey() {
        return this.publicKey;
    }
    /**
     * @return The username to use for the SSH tunnel.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalConnectionRedshiftSshTunnel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private Integer id;
        private Integer port;
        private String publicKey;
        private String username;
        public Builder() {}
        public Builder(GetGlobalConnectionRedshiftSshTunnel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.id = defaults.id;
    	      this.port = defaults.port;
    	      this.publicKey = defaults.publicKey;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            if (hostname == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionRedshiftSshTunnel", "hostname");
            }
            this.hostname = hostname;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionRedshiftSshTunnel", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            if (port == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionRedshiftSshTunnel", "port");
            }
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder publicKey(String publicKey) {
            if (publicKey == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionRedshiftSshTunnel", "publicKey");
            }
            this.publicKey = publicKey;
            return this;
        }
        @CustomType.Setter
        public Builder username(String username) {
            if (username == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionRedshiftSshTunnel", "username");
            }
            this.username = username;
            return this;
        }
        public GetGlobalConnectionRedshiftSshTunnel build() {
            final var _resultValue = new GetGlobalConnectionRedshiftSshTunnel();
            _resultValue.hostname = hostname;
            _resultValue.id = id;
            _resultValue.port = port;
            _resultValue.publicKey = publicKey;
            _resultValue.username = username;
            return _resultValue;
        }
    }
}