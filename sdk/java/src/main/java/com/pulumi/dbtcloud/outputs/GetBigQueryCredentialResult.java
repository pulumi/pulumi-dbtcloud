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
public final class GetBigQueryCredentialResult {
    /**
     * @return Credential ID
     * 
     */
    private Integer credentialId;
    /**
     * @return Default dataset name
     * 
     */
    private String dataset;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Whether the BigQuery credential is active
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

    private GetBigQueryCredentialResult() {}
    /**
     * @return Credential ID
     * 
     */
    public Integer credentialId() {
        return this.credentialId;
    }
    /**
     * @return Default dataset name
     * 
     */
    public String dataset() {
        return this.dataset;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether the BigQuery credential is active
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBigQueryCredentialResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer credentialId;
        private String dataset;
        private String id;
        private Boolean isActive;
        private Integer numThreads;
        private Integer projectId;
        public Builder() {}
        public Builder(GetBigQueryCredentialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentialId = defaults.credentialId;
    	      this.dataset = defaults.dataset;
    	      this.id = defaults.id;
    	      this.isActive = defaults.isActive;
    	      this.numThreads = defaults.numThreads;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder credentialId(Integer credentialId) {
            if (credentialId == null) {
              throw new MissingRequiredPropertyException("GetBigQueryCredentialResult", "credentialId");
            }
            this.credentialId = credentialId;
            return this;
        }
        @CustomType.Setter
        public Builder dataset(String dataset) {
            if (dataset == null) {
              throw new MissingRequiredPropertyException("GetBigQueryCredentialResult", "dataset");
            }
            this.dataset = dataset;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBigQueryCredentialResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isActive(Boolean isActive) {
            if (isActive == null) {
              throw new MissingRequiredPropertyException("GetBigQueryCredentialResult", "isActive");
            }
            this.isActive = isActive;
            return this;
        }
        @CustomType.Setter
        public Builder numThreads(Integer numThreads) {
            if (numThreads == null) {
              throw new MissingRequiredPropertyException("GetBigQueryCredentialResult", "numThreads");
            }
            this.numThreads = numThreads;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(Integer projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetBigQueryCredentialResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        public GetBigQueryCredentialResult build() {
            final var _resultValue = new GetBigQueryCredentialResult();
            _resultValue.credentialId = credentialId;
            _resultValue.dataset = dataset;
            _resultValue.id = id;
            _resultValue.isActive = isActive;
            _resultValue.numThreads = numThreads;
            _resultValue.projectId = projectId;
            return _resultValue;
        }
    }
}