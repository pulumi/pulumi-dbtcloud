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
public final class GetConnectionResult {
    /**
     * @return Account for the connection
     * 
     */
    private String account;
    /**
     * @return Flag for whether or not to use the keep session alive parameter in the connection
     * 
     */
    private Boolean allowKeepAlive;
    /**
     * @return Flag for whether or not to use SSO for the connection
     * 
     */
    private Boolean allowSso;
    /**
     * @return ID for the connection
     * 
     */
    private Integer connectionId;
    /**
     * @return Database name for the connection
     * 
     */
    private String database;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Whether the connection is active
     * 
     */
    private Boolean isActive;
    /**
     * @return Connection name
     * 
     */
    private String name;
    /**
     * @return The ID of the PrivateLink connection
     * 
     */
    private String privateLinkEndpointId;
    /**
     * @return Project ID to create the connection in
     * 
     */
    private Integer projectId;
    /**
     * @return Role name for the connection
     * 
     */
    private String role;
    /**
     * @return Connection type
     * 
     */
    private String type;
    /**
     * @return Warehouse name for the connection
     * 
     */
    private String warehouse;

    private GetConnectionResult() {}
    /**
     * @return Account for the connection
     * 
     */
    public String account() {
        return this.account;
    }
    /**
     * @return Flag for whether or not to use the keep session alive parameter in the connection
     * 
     */
    public Boolean allowKeepAlive() {
        return this.allowKeepAlive;
    }
    /**
     * @return Flag for whether or not to use SSO for the connection
     * 
     */
    public Boolean allowSso() {
        return this.allowSso;
    }
    /**
     * @return ID for the connection
     * 
     */
    public Integer connectionId() {
        return this.connectionId;
    }
    /**
     * @return Database name for the connection
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether the connection is active
     * 
     */
    public Boolean isActive() {
        return this.isActive;
    }
    /**
     * @return Connection name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the PrivateLink connection
     * 
     */
    public String privateLinkEndpointId() {
        return this.privateLinkEndpointId;
    }
    /**
     * @return Project ID to create the connection in
     * 
     */
    public Integer projectId() {
        return this.projectId;
    }
    /**
     * @return Role name for the connection
     * 
     */
    public String role() {
        return this.role;
    }
    /**
     * @return Connection type
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Warehouse name for the connection
     * 
     */
    public String warehouse() {
        return this.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String account;
        private Boolean allowKeepAlive;
        private Boolean allowSso;
        private Integer connectionId;
        private String database;
        private String id;
        private Boolean isActive;
        private String name;
        private String privateLinkEndpointId;
        private Integer projectId;
        private String role;
        private String type;
        private String warehouse;
        public Builder() {}
        public Builder(GetConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.account = defaults.account;
    	      this.allowKeepAlive = defaults.allowKeepAlive;
    	      this.allowSso = defaults.allowSso;
    	      this.connectionId = defaults.connectionId;
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.isActive = defaults.isActive;
    	      this.name = defaults.name;
    	      this.privateLinkEndpointId = defaults.privateLinkEndpointId;
    	      this.projectId = defaults.projectId;
    	      this.role = defaults.role;
    	      this.type = defaults.type;
    	      this.warehouse = defaults.warehouse;
        }

        @CustomType.Setter
        public Builder account(String account) {
            if (account == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "account");
            }
            this.account = account;
            return this;
        }
        @CustomType.Setter
        public Builder allowKeepAlive(Boolean allowKeepAlive) {
            if (allowKeepAlive == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "allowKeepAlive");
            }
            this.allowKeepAlive = allowKeepAlive;
            return this;
        }
        @CustomType.Setter
        public Builder allowSso(Boolean allowSso) {
            if (allowSso == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "allowSso");
            }
            this.allowSso = allowSso;
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(Integer connectionId) {
            if (connectionId == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "connectionId");
            }
            this.connectionId = connectionId;
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isActive(Boolean isActive) {
            if (isActive == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "isActive");
            }
            this.isActive = isActive;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder privateLinkEndpointId(String privateLinkEndpointId) {
            if (privateLinkEndpointId == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "privateLinkEndpointId");
            }
            this.privateLinkEndpointId = privateLinkEndpointId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(Integer projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            if (role == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "role");
            }
            this.role = role;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder warehouse(String warehouse) {
            if (warehouse == null) {
              throw new MissingRequiredPropertyException("GetConnectionResult", "warehouse");
            }
            this.warehouse = warehouse;
            return this;
        }
        public GetConnectionResult build() {
            final var _resultValue = new GetConnectionResult();
            _resultValue.account = account;
            _resultValue.allowKeepAlive = allowKeepAlive;
            _resultValue.allowSso = allowSso;
            _resultValue.connectionId = connectionId;
            _resultValue.database = database;
            _resultValue.id = id;
            _resultValue.isActive = isActive;
            _resultValue.name = name;
            _resultValue.privateLinkEndpointId = privateLinkEndpointId;
            _resultValue.projectId = projectId;
            _resultValue.role = role;
            _resultValue.type = type;
            _resultValue.warehouse = warehouse;
            return _resultValue;
        }
    }
}
