// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGlobalConnectionAthena {
    /**
     * @return Specify the database (data catalog) to build models into (lowercase only).
     * 
     */
    private String database;
    /**
     * @return Number of times to retry boto3 requests (e.g. deleting S3 files for materialized tables).
     * 
     */
    private Integer numBoto3Retries;
    /**
     * @return Number of times to retry iceberg commit queries to fix ICEBERG*COMMIT*ERROR.
     * 
     */
    private Integer numIcebergRetries;
    /**
     * @return Number of times to retry a failing query.
     * 
     */
    private Integer numRetries;
    /**
     * @return Interval in seconds to use for polling the status of query results in Athena.
     * 
     */
    private Integer pollInterval;
    /**
     * @return AWS region of your Athena instance.
     * 
     */
    private String regionName;
    /**
     * @return Prefix for storing tables, if different from the connection&#39;s S3 staging directory.
     * 
     */
    private String s3DataDir;
    /**
     * @return How to generate table paths in the S3 data directory.
     * 
     */
    private String s3DataNaming;
    /**
     * @return S3 location to store Athena query results and metadata.
     * 
     */
    private String s3StagingDir;
    /**
     * @return Prefix for storing temporary tables, if different from the connection&#39;s S3 data directory.
     * 
     */
    private String s3TmpTableDir;
    /**
     * @return Identifier of Athena Spark workgroup for running Python models.
     * 
     */
    private String sparkWorkGroup;
    /**
     * @return Identifier of Athena workgroup.
     * 
     */
    private String workGroup;

    private GetGlobalConnectionAthena() {}
    /**
     * @return Specify the database (data catalog) to build models into (lowercase only).
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return Number of times to retry boto3 requests (e.g. deleting S3 files for materialized tables).
     * 
     */
    public Integer numBoto3Retries() {
        return this.numBoto3Retries;
    }
    /**
     * @return Number of times to retry iceberg commit queries to fix ICEBERG*COMMIT*ERROR.
     * 
     */
    public Integer numIcebergRetries() {
        return this.numIcebergRetries;
    }
    /**
     * @return Number of times to retry a failing query.
     * 
     */
    public Integer numRetries() {
        return this.numRetries;
    }
    /**
     * @return Interval in seconds to use for polling the status of query results in Athena.
     * 
     */
    public Integer pollInterval() {
        return this.pollInterval;
    }
    /**
     * @return AWS region of your Athena instance.
     * 
     */
    public String regionName() {
        return this.regionName;
    }
    /**
     * @return Prefix for storing tables, if different from the connection&#39;s S3 staging directory.
     * 
     */
    public String s3DataDir() {
        return this.s3DataDir;
    }
    /**
     * @return How to generate table paths in the S3 data directory.
     * 
     */
    public String s3DataNaming() {
        return this.s3DataNaming;
    }
    /**
     * @return S3 location to store Athena query results and metadata.
     * 
     */
    public String s3StagingDir() {
        return this.s3StagingDir;
    }
    /**
     * @return Prefix for storing temporary tables, if different from the connection&#39;s S3 data directory.
     * 
     */
    public String s3TmpTableDir() {
        return this.s3TmpTableDir;
    }
    /**
     * @return Identifier of Athena Spark workgroup for running Python models.
     * 
     */
    public String sparkWorkGroup() {
        return this.sparkWorkGroup;
    }
    /**
     * @return Identifier of Athena workgroup.
     * 
     */
    public String workGroup() {
        return this.workGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalConnectionAthena defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private Integer numBoto3Retries;
        private Integer numIcebergRetries;
        private Integer numRetries;
        private Integer pollInterval;
        private String regionName;
        private String s3DataDir;
        private String s3DataNaming;
        private String s3StagingDir;
        private String s3TmpTableDir;
        private String sparkWorkGroup;
        private String workGroup;
        public Builder() {}
        public Builder(GetGlobalConnectionAthena defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.numBoto3Retries = defaults.numBoto3Retries;
    	      this.numIcebergRetries = defaults.numIcebergRetries;
    	      this.numRetries = defaults.numRetries;
    	      this.pollInterval = defaults.pollInterval;
    	      this.regionName = defaults.regionName;
    	      this.s3DataDir = defaults.s3DataDir;
    	      this.s3DataNaming = defaults.s3DataNaming;
    	      this.s3StagingDir = defaults.s3StagingDir;
    	      this.s3TmpTableDir = defaults.s3TmpTableDir;
    	      this.sparkWorkGroup = defaults.sparkWorkGroup;
    	      this.workGroup = defaults.workGroup;
        }

        @CustomType.Setter
        public Builder database(String database) {
            if (database == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "database");
            }
            this.database = database;
            return this;
        }
        @CustomType.Setter
        public Builder numBoto3Retries(Integer numBoto3Retries) {
            if (numBoto3Retries == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "numBoto3Retries");
            }
            this.numBoto3Retries = numBoto3Retries;
            return this;
        }
        @CustomType.Setter
        public Builder numIcebergRetries(Integer numIcebergRetries) {
            if (numIcebergRetries == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "numIcebergRetries");
            }
            this.numIcebergRetries = numIcebergRetries;
            return this;
        }
        @CustomType.Setter
        public Builder numRetries(Integer numRetries) {
            if (numRetries == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "numRetries");
            }
            this.numRetries = numRetries;
            return this;
        }
        @CustomType.Setter
        public Builder pollInterval(Integer pollInterval) {
            if (pollInterval == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "pollInterval");
            }
            this.pollInterval = pollInterval;
            return this;
        }
        @CustomType.Setter
        public Builder regionName(String regionName) {
            if (regionName == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "regionName");
            }
            this.regionName = regionName;
            return this;
        }
        @CustomType.Setter
        public Builder s3DataDir(String s3DataDir) {
            if (s3DataDir == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "s3DataDir");
            }
            this.s3DataDir = s3DataDir;
            return this;
        }
        @CustomType.Setter
        public Builder s3DataNaming(String s3DataNaming) {
            if (s3DataNaming == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "s3DataNaming");
            }
            this.s3DataNaming = s3DataNaming;
            return this;
        }
        @CustomType.Setter
        public Builder s3StagingDir(String s3StagingDir) {
            if (s3StagingDir == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "s3StagingDir");
            }
            this.s3StagingDir = s3StagingDir;
            return this;
        }
        @CustomType.Setter
        public Builder s3TmpTableDir(String s3TmpTableDir) {
            if (s3TmpTableDir == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "s3TmpTableDir");
            }
            this.s3TmpTableDir = s3TmpTableDir;
            return this;
        }
        @CustomType.Setter
        public Builder sparkWorkGroup(String sparkWorkGroup) {
            if (sparkWorkGroup == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "sparkWorkGroup");
            }
            this.sparkWorkGroup = sparkWorkGroup;
            return this;
        }
        @CustomType.Setter
        public Builder workGroup(String workGroup) {
            if (workGroup == null) {
              throw new MissingRequiredPropertyException("GetGlobalConnectionAthena", "workGroup");
            }
            this.workGroup = workGroup;
            return this;
        }
        public GetGlobalConnectionAthena build() {
            final var _resultValue = new GetGlobalConnectionAthena();
            _resultValue.database = database;
            _resultValue.numBoto3Retries = numBoto3Retries;
            _resultValue.numIcebergRetries = numIcebergRetries;
            _resultValue.numRetries = numRetries;
            _resultValue.pollInterval = pollInterval;
            _resultValue.regionName = regionName;
            _resultValue.s3DataDir = s3DataDir;
            _resultValue.s3DataNaming = s3DataNaming;
            _resultValue.s3StagingDir = s3StagingDir;
            _resultValue.s3TmpTableDir = s3TmpTableDir;
            _resultValue.sparkWorkGroup = sparkWorkGroup;
            _resultValue.workGroup = workGroup;
            return _resultValue;
        }
    }
}