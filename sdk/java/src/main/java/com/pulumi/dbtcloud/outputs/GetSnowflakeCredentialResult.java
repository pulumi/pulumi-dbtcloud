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
public final class GetSnowflakeCredentialResult {
    /**
     * @return The type of Snowflake credential (&#39;password&#39; or &#39;keypair&#39;)
     * 
     */
    private String authType;
    /**
     * @return Credential ID
     * 
     */
    private Integer credentialId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Whether the Snowflake credential is active
     * 
     */
    private Boolean isActive;
    /**
     * @return Number of threads to use
     * 
     */
    private Integer numThreads;
    /**
     * @return Project ID
     * 
     */
    private Integer projectId;
    /**
     * @return Default schema name
     * 
     */
    private String schema;
    /**
     * @return Username for Snowflake
     * 
     */
    private String user;

    private GetSnowflakeCredentialResult() {}
    /**
     * @return The type of Snowflake credential (&#39;password&#39; or &#39;keypair&#39;)
     * 
     */
    public String authType() {
        return this.authType;
    }
    /**
     * @return Credential ID
     * 
     */
    public Integer credentialId() {
        return this.credentialId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether the Snowflake credential is active
     * 
     */
    public Boolean isActive() {
        return this.isActive;
    }
    /**
     * @return Number of threads to use
     * 
     */
    public Integer numThreads() {
        return this.numThreads;
    }
    /**
     * @return Project ID
     * 
     */
    public Integer projectId() {
        return this.projectId;
    }
    /**
     * @return Default schema name
     * 
     */
    public String schema() {
        return this.schema;
    }
    /**
     * @return Username for Snowflake
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnowflakeCredentialResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authType;
        private Integer credentialId;
        private String id;
        private Boolean isActive;
        private Integer numThreads;
        private Integer projectId;
        private String schema;
        private String user;
        public Builder() {}
        public Builder(GetSnowflakeCredentialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.credentialId = defaults.credentialId;
    	      this.id = defaults.id;
    	      this.isActive = defaults.isActive;
    	      this.numThreads = defaults.numThreads;
    	      this.projectId = defaults.projectId;
    	      this.schema = defaults.schema;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder authType(String authType) {
            if (authType == null) {
              throw new MissingRequiredPropertyException("GetSnowflakeCredentialResult", "authType");
            }
            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder credentialId(Integer credentialId) {
            if (credentialId == null) {
              throw new MissingRequiredPropertyException("GetSnowflakeCredentialResult", "credentialId");
            }
            this.credentialId = credentialId;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSnowflakeCredentialResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isActive(Boolean isActive) {
            if (isActive == null) {
              throw new MissingRequiredPropertyException("GetSnowflakeCredentialResult", "isActive");
            }
            this.isActive = isActive;
            return this;
        }
        @CustomType.Setter
        public Builder numThreads(Integer numThreads) {
            if (numThreads == null) {
              throw new MissingRequiredPropertyException("GetSnowflakeCredentialResult", "numThreads");
            }
            this.numThreads = numThreads;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(Integer projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetSnowflakeCredentialResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            if (schema == null) {
              throw new MissingRequiredPropertyException("GetSnowflakeCredentialResult", "schema");
            }
            this.schema = schema;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetSnowflakeCredentialResult", "user");
            }
            this.user = user;
            return this;
        }
        public GetSnowflakeCredentialResult build() {
            final var _resultValue = new GetSnowflakeCredentialResult();
            _resultValue.authType = authType;
            _resultValue.credentialId = credentialId;
            _resultValue.id = id;
            _resultValue.isActive = isActive;
            _resultValue.numThreads = numThreads;
            _resultValue.projectId = projectId;
            _resultValue.schema = schema;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}