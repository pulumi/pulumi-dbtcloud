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
public final class GetBigQueryConnectionResult {
    /**
     * @return Auth Provider X509 Cert URL for the Service Account
     * 
     */
    private String authProviderX509CertUrl;
    /**
     * @return Auth URI for the Service Account
     * 
     */
    private String authUri;
    /**
     * @return Service Account email
     * 
     */
    private String clientEmail;
    /**
     * @return Client ID of the Service Account
     * 
     */
    private String clientId;
    /**
     * @return Client X509 Cert URL for the Service Account
     * 
     */
    private String clientX509CertUrl;
    /**
     * @return Connection Identifier
     * 
     */
    private Integer connectionId;
    /**
     * @return Dataproc cluster name for PySpark workloads
     * 
     */
    private String dataprocClusterName;
    /**
     * @return Google Cloud region for PySpark workloads on Dataproc
     * 
     */
    private String dataprocRegion;
    /**
     * @return Project to bill for query execution
     * 
     */
    private String executionProject;
    /**
     * @return GCP project ID
     * 
     */
    private String gcpProjectId;
    /**
     * @return URI for a Google Cloud Storage bucket to host Python code executed via Datapro
     * 
     */
    private String gcsBucket;
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
     * @return Whether the connection is configured for OAuth or not
     * 
     */
    private Boolean isConfiguredForOauth;
    /**
     * @return Location to create new Datasets in
     * 
     */
    private String location;
    /**
     * @return Max number of bytes that can be billed for a given BigQuery query
     * 
     */
    private Integer maximumBytesBilled;
    /**
     * @return Connection name
     * 
     */
    private String name;
    /**
     * @return The priority with which to execute BigQuery queries
     * 
     */
    private String priority;
    /**
     * @return Private key of the Service Account
     * 
     */
    private String privateKey;
    /**
     * @return Private key ID of the Service Account
     * 
     */
    private String privateKeyId;
    /**
     * @return Project ID to create the connection in
     * 
     */
    private Integer projectId;
    /**
     * @return Number of retries for queries
     * 
     */
    private Integer retries;
    /**
     * @return Timeout in seconds for queries
     * 
     */
    private Integer timeoutSeconds;
    /**
     * @return Token URI for the Service Account
     * 
     */
    private String tokenUri;
    /**
     * @return The type of connection
     * 
     */
    private String type;

    private GetBigQueryConnectionResult() {}
    /**
     * @return Auth Provider X509 Cert URL for the Service Account
     * 
     */
    public String authProviderX509CertUrl() {
        return this.authProviderX509CertUrl;
    }
    /**
     * @return Auth URI for the Service Account
     * 
     */
    public String authUri() {
        return this.authUri;
    }
    /**
     * @return Service Account email
     * 
     */
    public String clientEmail() {
        return this.clientEmail;
    }
    /**
     * @return Client ID of the Service Account
     * 
     */
    public String clientId() {
        return this.clientId;
    }
    /**
     * @return Client X509 Cert URL for the Service Account
     * 
     */
    public String clientX509CertUrl() {
        return this.clientX509CertUrl;
    }
    /**
     * @return Connection Identifier
     * 
     */
    public Integer connectionId() {
        return this.connectionId;
    }
    /**
     * @return Dataproc cluster name for PySpark workloads
     * 
     */
    public String dataprocClusterName() {
        return this.dataprocClusterName;
    }
    /**
     * @return Google Cloud region for PySpark workloads on Dataproc
     * 
     */
    public String dataprocRegion() {
        return this.dataprocRegion;
    }
    /**
     * @return Project to bill for query execution
     * 
     */
    public String executionProject() {
        return this.executionProject;
    }
    /**
     * @return GCP project ID
     * 
     */
    public String gcpProjectId() {
        return this.gcpProjectId;
    }
    /**
     * @return URI for a Google Cloud Storage bucket to host Python code executed via Datapro
     * 
     */
    public String gcsBucket() {
        return this.gcsBucket;
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
     * @return Whether the connection is configured for OAuth or not
     * 
     */
    public Boolean isConfiguredForOauth() {
        return this.isConfiguredForOauth;
    }
    /**
     * @return Location to create new Datasets in
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return Max number of bytes that can be billed for a given BigQuery query
     * 
     */
    public Integer maximumBytesBilled() {
        return this.maximumBytesBilled;
    }
    /**
     * @return Connection name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The priority with which to execute BigQuery queries
     * 
     */
    public String priority() {
        return this.priority;
    }
    /**
     * @return Private key of the Service Account
     * 
     */
    public String privateKey() {
        return this.privateKey;
    }
    /**
     * @return Private key ID of the Service Account
     * 
     */
    public String privateKeyId() {
        return this.privateKeyId;
    }
    /**
     * @return Project ID to create the connection in
     * 
     */
    public Integer projectId() {
        return this.projectId;
    }
    /**
     * @return Number of retries for queries
     * 
     */
    public Integer retries() {
        return this.retries;
    }
    /**
     * @return Timeout in seconds for queries
     * 
     */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }
    /**
     * @return Token URI for the Service Account
     * 
     */
    public String tokenUri() {
        return this.tokenUri;
    }
    /**
     * @return The type of connection
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBigQueryConnectionResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authProviderX509CertUrl;
        private String authUri;
        private String clientEmail;
        private String clientId;
        private String clientX509CertUrl;
        private Integer connectionId;
        private String dataprocClusterName;
        private String dataprocRegion;
        private String executionProject;
        private String gcpProjectId;
        private String gcsBucket;
        private String id;
        private Boolean isActive;
        private Boolean isConfiguredForOauth;
        private String location;
        private Integer maximumBytesBilled;
        private String name;
        private String priority;
        private String privateKey;
        private String privateKeyId;
        private Integer projectId;
        private Integer retries;
        private Integer timeoutSeconds;
        private String tokenUri;
        private String type;
        public Builder() {}
        public Builder(GetBigQueryConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authProviderX509CertUrl = defaults.authProviderX509CertUrl;
    	      this.authUri = defaults.authUri;
    	      this.clientEmail = defaults.clientEmail;
    	      this.clientId = defaults.clientId;
    	      this.clientX509CertUrl = defaults.clientX509CertUrl;
    	      this.connectionId = defaults.connectionId;
    	      this.dataprocClusterName = defaults.dataprocClusterName;
    	      this.dataprocRegion = defaults.dataprocRegion;
    	      this.executionProject = defaults.executionProject;
    	      this.gcpProjectId = defaults.gcpProjectId;
    	      this.gcsBucket = defaults.gcsBucket;
    	      this.id = defaults.id;
    	      this.isActive = defaults.isActive;
    	      this.isConfiguredForOauth = defaults.isConfiguredForOauth;
    	      this.location = defaults.location;
    	      this.maximumBytesBilled = defaults.maximumBytesBilled;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.privateKey = defaults.privateKey;
    	      this.privateKeyId = defaults.privateKeyId;
    	      this.projectId = defaults.projectId;
    	      this.retries = defaults.retries;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.tokenUri = defaults.tokenUri;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder authProviderX509CertUrl(String authProviderX509CertUrl) {
            if (authProviderX509CertUrl == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "authProviderX509CertUrl");
            }
            this.authProviderX509CertUrl = authProviderX509CertUrl;
            return this;
        }
        @CustomType.Setter
        public Builder authUri(String authUri) {
            if (authUri == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "authUri");
            }
            this.authUri = authUri;
            return this;
        }
        @CustomType.Setter
        public Builder clientEmail(String clientEmail) {
            if (clientEmail == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "clientEmail");
            }
            this.clientEmail = clientEmail;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(String clientId) {
            if (clientId == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "clientId");
            }
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder clientX509CertUrl(String clientX509CertUrl) {
            if (clientX509CertUrl == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "clientX509CertUrl");
            }
            this.clientX509CertUrl = clientX509CertUrl;
            return this;
        }
        @CustomType.Setter
        public Builder connectionId(Integer connectionId) {
            if (connectionId == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "connectionId");
            }
            this.connectionId = connectionId;
            return this;
        }
        @CustomType.Setter
        public Builder dataprocClusterName(String dataprocClusterName) {
            if (dataprocClusterName == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "dataprocClusterName");
            }
            this.dataprocClusterName = dataprocClusterName;
            return this;
        }
        @CustomType.Setter
        public Builder dataprocRegion(String dataprocRegion) {
            if (dataprocRegion == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "dataprocRegion");
            }
            this.dataprocRegion = dataprocRegion;
            return this;
        }
        @CustomType.Setter
        public Builder executionProject(String executionProject) {
            if (executionProject == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "executionProject");
            }
            this.executionProject = executionProject;
            return this;
        }
        @CustomType.Setter
        public Builder gcpProjectId(String gcpProjectId) {
            if (gcpProjectId == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "gcpProjectId");
            }
            this.gcpProjectId = gcpProjectId;
            return this;
        }
        @CustomType.Setter
        public Builder gcsBucket(String gcsBucket) {
            if (gcsBucket == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "gcsBucket");
            }
            this.gcsBucket = gcsBucket;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder isActive(Boolean isActive) {
            if (isActive == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "isActive");
            }
            this.isActive = isActive;
            return this;
        }
        @CustomType.Setter
        public Builder isConfiguredForOauth(Boolean isConfiguredForOauth) {
            if (isConfiguredForOauth == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "isConfiguredForOauth");
            }
            this.isConfiguredForOauth = isConfiguredForOauth;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            if (location == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "location");
            }
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder maximumBytesBilled(Integer maximumBytesBilled) {
            if (maximumBytesBilled == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "maximumBytesBilled");
            }
            this.maximumBytesBilled = maximumBytesBilled;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder privateKey(String privateKey) {
            if (privateKey == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "privateKey");
            }
            this.privateKey = privateKey;
            return this;
        }
        @CustomType.Setter
        public Builder privateKeyId(String privateKeyId) {
            if (privateKeyId == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "privateKeyId");
            }
            this.privateKeyId = privateKeyId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(Integer projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder retries(Integer retries) {
            if (retries == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "retries");
            }
            this.retries = retries;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            if (timeoutSeconds == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "timeoutSeconds");
            }
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder tokenUri(String tokenUri) {
            if (tokenUri == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "tokenUri");
            }
            this.tokenUri = tokenUri;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetBigQueryConnectionResult", "type");
            }
            this.type = type;
            return this;
        }
        public GetBigQueryConnectionResult build() {
            final var _resultValue = new GetBigQueryConnectionResult();
            _resultValue.authProviderX509CertUrl = authProviderX509CertUrl;
            _resultValue.authUri = authUri;
            _resultValue.clientEmail = clientEmail;
            _resultValue.clientId = clientId;
            _resultValue.clientX509CertUrl = clientX509CertUrl;
            _resultValue.connectionId = connectionId;
            _resultValue.dataprocClusterName = dataprocClusterName;
            _resultValue.dataprocRegion = dataprocRegion;
            _resultValue.executionProject = executionProject;
            _resultValue.gcpProjectId = gcpProjectId;
            _resultValue.gcsBucket = gcsBucket;
            _resultValue.id = id;
            _resultValue.isActive = isActive;
            _resultValue.isConfiguredForOauth = isConfiguredForOauth;
            _resultValue.location = location;
            _resultValue.maximumBytesBilled = maximumBytesBilled;
            _resultValue.name = name;
            _resultValue.priority = priority;
            _resultValue.privateKey = privateKey;
            _resultValue.privateKeyId = privateKeyId;
            _resultValue.projectId = projectId;
            _resultValue.retries = retries;
            _resultValue.timeoutSeconds = timeoutSeconds;
            _resultValue.tokenUri = tokenUri;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}