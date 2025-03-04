// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGlobalConnectionsConnection {
    /**
     * @return Type of adapter used for the connection
     * 
     */
    private String adapterVersion;
    /**
     * @return When the connection was created
     * 
     */
    private String createdAt;
    /**
     * @return Number of environments using this connection
     * 
     */
    private Integer environmentCount;
    /**
     * @return Connection Identifier
     * 
     */
    private Integer id;
    private Boolean isSshTunnelEnabled;
    /**
     * @return Connection name
     * 
     */
    private String name;
    private Integer oauthConfigurationId;
    /**
     * @return Private Link Endpoint ID.
     * 
     */
    private String privateLinkEndpointId;
    /**
     * @return When the connection was updated
     * 
     */
    private String updatedAt;

    private GetGlobalConnectionsConnection() {}
    /**
     * @return Type of adapter used for the connection
     * 
     */
    public String adapterVersion() {
        return this.adapterVersion;
    }
    /**
     * @return When the connection was created
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return Number of environments using this connection
     * 
     */
    public Integer environmentCount() {
        return this.environmentCount;
    }
    /**
     * @return Connection Identifier
     * 
     */
    public Integer id() {
        return this.id;
    }
    public Boolean isSshTunnelEnabled() {
        return this.isSshTunnelEnabled;
    }
    /**
     * @return Connection name
     * 
     */
    public String name() {
        return this.name;
    }
    public Integer oauthConfigurationId() {
        return this.oauthConfigurationId;
    }
    /**
     * @return Private Link Endpoint ID.
     * 
     */
    public String privateLinkEndpointId() {
        return this.privateLinkEndpointId;
    }
    /**
     * @return When the connection was updated
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalConnectionsConnection defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String adapterVersion;
        private String createdAt;
        private Integer environmentCount;
        private Integer id;
        private Boolean isSshTunnelEnabled;
        private String name;
        private Integer oauthConfigurationId;
        private String privateLinkEndpointId;
        private String updatedAt;
        public Builder() {}
        public Builder(GetGlobalConnectionsConnection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adapterVersion = defaults.adapterVersion;
    	      this.createdAt = defaults.createdAt;
    	      this.environmentCount = defaults.environmentCount;
    	      this.id = defaults.id;
    	      this.isSshTunnelEnabled = defaults.isSshTunnelEnabled;
    	      this.name = defaults.name;
    	      this.oauthConfigurationId = defaults.oauthConfigurationId;
    	      this.privateLinkEndpointId = defaults.privateLinkEndpointId;
    	      this.updatedAt = defaults.updatedAt;
        }

        @CustomType.Setter
        public Builder adapterVersion(String adapterVersion) {
            if (adapterVersion == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionsConnection", "adapterVersion");
            }
            this.adapterVersion = adapterVersion;
            return this;
        }
        @CustomType.Setter
        public Builder createdAt(String createdAt) {
            if (createdAt == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionsConnection", "createdAt");
            }
            this.createdAt = createdAt;
            return this;
        }
        @CustomType.Setter
        public Builder environmentCount(Integer environmentCount) {
            if (environmentCount == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionsConnection", "environmentCount");
            }
            this.environmentCount = environmentCount;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionsConnection", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isSshTunnelEnabled(Boolean isSshTunnelEnabled) {
            if (isSshTunnelEnabled == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionsConnection", "isSshTunnelEnabled");
            }
            this.isSshTunnelEnabled = isSshTunnelEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionsConnection", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder oauthConfigurationId(Integer oauthConfigurationId) {
            if (oauthConfigurationId == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionsConnection", "oauthConfigurationId");
            }
            this.oauthConfigurationId = oauthConfigurationId;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkEndpointId(String privateLinkEndpointId) {
            if (privateLinkEndpointId == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionsConnection", "privateLinkEndpointId");
            }
            this.privateLinkEndpointId = privateLinkEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder updatedAt(String updatedAt) {
            if (updatedAt == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionsConnection", "updatedAt");
            }
            this.updatedAt = updatedAt;
            return this;
        }
        public GetGlobalConnectionsConnection build() {
            final var _resultValue = new GetGlobalConnectionsConnection();
            _resultValue.adapterVersion = adapterVersion;
            _resultValue.createdAt = createdAt;
            _resultValue.environmentCount = environmentCount;
            _resultValue.id = id;
            _resultValue.isSshTunnelEnabled = isSshTunnelEnabled;
            _resultValue.name = name;
            _resultValue.oauthConfigurationId = oauthConfigurationId;
            _resultValue.privateLinkEndpointId = privateLinkEndpointId;
            _resultValue.updatedAt = updatedAt;
            return _resultValue;
        }
    }
}
