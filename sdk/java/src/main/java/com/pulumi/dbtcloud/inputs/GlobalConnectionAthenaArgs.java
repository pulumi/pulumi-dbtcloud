// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalConnectionAthenaArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalConnectionAthenaArgs Empty = new GlobalConnectionAthenaArgs();

    /**
     * Specify the database (data catalog) to build models into (lowercase only).
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return Specify the database (data catalog) to build models into (lowercase only).
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * Number of times to retry boto3 requests (e.g. deleting S3 files for materialized tables).
     * 
     */
    @Import(name="numBoto3Retries")
    private @Nullable Output<Integer> numBoto3Retries;

    /**
     * @return Number of times to retry boto3 requests (e.g. deleting S3 files for materialized tables).
     * 
     */
    public Optional<Output<Integer>> numBoto3Retries() {
        return Optional.ofNullable(this.numBoto3Retries);
    }

    /**
     * Number of times to retry iceberg commit queries to fix ICEBERG*COMMIT*ERROR.
     * 
     */
    @Import(name="numIcebergRetries")
    private @Nullable Output<Integer> numIcebergRetries;

    /**
     * @return Number of times to retry iceberg commit queries to fix ICEBERG*COMMIT*ERROR.
     * 
     */
    public Optional<Output<Integer>> numIcebergRetries() {
        return Optional.ofNullable(this.numIcebergRetries);
    }

    /**
     * Number of times to retry a failing query.
     * 
     */
    @Import(name="numRetries")
    private @Nullable Output<Integer> numRetries;

    /**
     * @return Number of times to retry a failing query.
     * 
     */
    public Optional<Output<Integer>> numRetries() {
        return Optional.ofNullable(this.numRetries);
    }

    /**
     * Interval in seconds to use for polling the status of query results in Athena.
     * 
     */
    @Import(name="pollInterval")
    private @Nullable Output<Integer> pollInterval;

    /**
     * @return Interval in seconds to use for polling the status of query results in Athena.
     * 
     */
    public Optional<Output<Integer>> pollInterval() {
        return Optional.ofNullable(this.pollInterval);
    }

    /**
     * AWS region of your Athena instance.
     * 
     */
    @Import(name="regionName", required=true)
    private Output<String> regionName;

    /**
     * @return AWS region of your Athena instance.
     * 
     */
    public Output<String> regionName() {
        return this.regionName;
    }

    /**
     * Prefix for storing tables, if different from the connection&#39;s S3 staging directory.
     * 
     */
    @Import(name="s3DataDir")
    private @Nullable Output<String> s3DataDir;

    /**
     * @return Prefix for storing tables, if different from the connection&#39;s S3 staging directory.
     * 
     */
    public Optional<Output<String>> s3DataDir() {
        return Optional.ofNullable(this.s3DataDir);
    }

    /**
     * How to generate table paths in the S3 data directory.
     * 
     */
    @Import(name="s3DataNaming")
    private @Nullable Output<String> s3DataNaming;

    /**
     * @return How to generate table paths in the S3 data directory.
     * 
     */
    public Optional<Output<String>> s3DataNaming() {
        return Optional.ofNullable(this.s3DataNaming);
    }

    /**
     * S3 location to store Athena query results and metadata.
     * 
     */
    @Import(name="s3StagingDir", required=true)
    private Output<String> s3StagingDir;

    /**
     * @return S3 location to store Athena query results and metadata.
     * 
     */
    public Output<String> s3StagingDir() {
        return this.s3StagingDir;
    }

    /**
     * Prefix for storing temporary tables, if different from the connection&#39;s S3 data directory.
     * 
     */
    @Import(name="s3TmpTableDir")
    private @Nullable Output<String> s3TmpTableDir;

    /**
     * @return Prefix for storing temporary tables, if different from the connection&#39;s S3 data directory.
     * 
     */
    public Optional<Output<String>> s3TmpTableDir() {
        return Optional.ofNullable(this.s3TmpTableDir);
    }

    /**
     * Identifier of Athena Spark workgroup for running Python models.
     * 
     */
    @Import(name="sparkWorkGroup")
    private @Nullable Output<String> sparkWorkGroup;

    /**
     * @return Identifier of Athena Spark workgroup for running Python models.
     * 
     */
    public Optional<Output<String>> sparkWorkGroup() {
        return Optional.ofNullable(this.sparkWorkGroup);
    }

    /**
     * Identifier of Athena workgroup.
     * 
     */
    @Import(name="workGroup")
    private @Nullable Output<String> workGroup;

    /**
     * @return Identifier of Athena workgroup.
     * 
     */
    public Optional<Output<String>> workGroup() {
        return Optional.ofNullable(this.workGroup);
    }

    private GlobalConnectionAthenaArgs() {}

    private GlobalConnectionAthenaArgs(GlobalConnectionAthenaArgs $) {
        this.database = $.database;
        this.numBoto3Retries = $.numBoto3Retries;
        this.numIcebergRetries = $.numIcebergRetries;
        this.numRetries = $.numRetries;
        this.pollInterval = $.pollInterval;
        this.regionName = $.regionName;
        this.s3DataDir = $.s3DataDir;
        this.s3DataNaming = $.s3DataNaming;
        this.s3StagingDir = $.s3StagingDir;
        this.s3TmpTableDir = $.s3TmpTableDir;
        this.sparkWorkGroup = $.sparkWorkGroup;
        this.workGroup = $.workGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalConnectionAthenaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalConnectionAthenaArgs $;

        public Builder() {
            $ = new GlobalConnectionAthenaArgs();
        }

        public Builder(GlobalConnectionAthenaArgs defaults) {
            $ = new GlobalConnectionAthenaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Specify the database (data catalog) to build models into (lowercase only).
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Specify the database (data catalog) to build models into (lowercase only).
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param numBoto3Retries Number of times to retry boto3 requests (e.g. deleting S3 files for materialized tables).
         * 
         * @return builder
         * 
         */
        public Builder numBoto3Retries(@Nullable Output<Integer> numBoto3Retries) {
            $.numBoto3Retries = numBoto3Retries;
            return this;
        }

        /**
         * @param numBoto3Retries Number of times to retry boto3 requests (e.g. deleting S3 files for materialized tables).
         * 
         * @return builder
         * 
         */
        public Builder numBoto3Retries(Integer numBoto3Retries) {
            return numBoto3Retries(Output.of(numBoto3Retries));
        }

        /**
         * @param numIcebergRetries Number of times to retry iceberg commit queries to fix ICEBERG*COMMIT*ERROR.
         * 
         * @return builder
         * 
         */
        public Builder numIcebergRetries(@Nullable Output<Integer> numIcebergRetries) {
            $.numIcebergRetries = numIcebergRetries;
            return this;
        }

        /**
         * @param numIcebergRetries Number of times to retry iceberg commit queries to fix ICEBERG*COMMIT*ERROR.
         * 
         * @return builder
         * 
         */
        public Builder numIcebergRetries(Integer numIcebergRetries) {
            return numIcebergRetries(Output.of(numIcebergRetries));
        }

        /**
         * @param numRetries Number of times to retry a failing query.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(@Nullable Output<Integer> numRetries) {
            $.numRetries = numRetries;
            return this;
        }

        /**
         * @param numRetries Number of times to retry a failing query.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(Integer numRetries) {
            return numRetries(Output.of(numRetries));
        }

        /**
         * @param pollInterval Interval in seconds to use for polling the status of query results in Athena.
         * 
         * @return builder
         * 
         */
        public Builder pollInterval(@Nullable Output<Integer> pollInterval) {
            $.pollInterval = pollInterval;
            return this;
        }

        /**
         * @param pollInterval Interval in seconds to use for polling the status of query results in Athena.
         * 
         * @return builder
         * 
         */
        public Builder pollInterval(Integer pollInterval) {
            return pollInterval(Output.of(pollInterval));
        }

        /**
         * @param regionName AWS region of your Athena instance.
         * 
         * @return builder
         * 
         */
        public Builder regionName(Output<String> regionName) {
            $.regionName = regionName;
            return this;
        }

        /**
         * @param regionName AWS region of your Athena instance.
         * 
         * @return builder
         * 
         */
        public Builder regionName(String regionName) {
            return regionName(Output.of(regionName));
        }

        /**
         * @param s3DataDir Prefix for storing tables, if different from the connection&#39;s S3 staging directory.
         * 
         * @return builder
         * 
         */
        public Builder s3DataDir(@Nullable Output<String> s3DataDir) {
            $.s3DataDir = s3DataDir;
            return this;
        }

        /**
         * @param s3DataDir Prefix for storing tables, if different from the connection&#39;s S3 staging directory.
         * 
         * @return builder
         * 
         */
        public Builder s3DataDir(String s3DataDir) {
            return s3DataDir(Output.of(s3DataDir));
        }

        /**
         * @param s3DataNaming How to generate table paths in the S3 data directory.
         * 
         * @return builder
         * 
         */
        public Builder s3DataNaming(@Nullable Output<String> s3DataNaming) {
            $.s3DataNaming = s3DataNaming;
            return this;
        }

        /**
         * @param s3DataNaming How to generate table paths in the S3 data directory.
         * 
         * @return builder
         * 
         */
        public Builder s3DataNaming(String s3DataNaming) {
            return s3DataNaming(Output.of(s3DataNaming));
        }

        /**
         * @param s3StagingDir S3 location to store Athena query results and metadata.
         * 
         * @return builder
         * 
         */
        public Builder s3StagingDir(Output<String> s3StagingDir) {
            $.s3StagingDir = s3StagingDir;
            return this;
        }

        /**
         * @param s3StagingDir S3 location to store Athena query results and metadata.
         * 
         * @return builder
         * 
         */
        public Builder s3StagingDir(String s3StagingDir) {
            return s3StagingDir(Output.of(s3StagingDir));
        }

        /**
         * @param s3TmpTableDir Prefix for storing temporary tables, if different from the connection&#39;s S3 data directory.
         * 
         * @return builder
         * 
         */
        public Builder s3TmpTableDir(@Nullable Output<String> s3TmpTableDir) {
            $.s3TmpTableDir = s3TmpTableDir;
            return this;
        }

        /**
         * @param s3TmpTableDir Prefix for storing temporary tables, if different from the connection&#39;s S3 data directory.
         * 
         * @return builder
         * 
         */
        public Builder s3TmpTableDir(String s3TmpTableDir) {
            return s3TmpTableDir(Output.of(s3TmpTableDir));
        }

        /**
         * @param sparkWorkGroup Identifier of Athena Spark workgroup for running Python models.
         * 
         * @return builder
         * 
         */
        public Builder sparkWorkGroup(@Nullable Output<String> sparkWorkGroup) {
            $.sparkWorkGroup = sparkWorkGroup;
            return this;
        }

        /**
         * @param sparkWorkGroup Identifier of Athena Spark workgroup for running Python models.
         * 
         * @return builder
         * 
         */
        public Builder sparkWorkGroup(String sparkWorkGroup) {
            return sparkWorkGroup(Output.of(sparkWorkGroup));
        }

        /**
         * @param workGroup Identifier of Athena workgroup.
         * 
         * @return builder
         * 
         */
        public Builder workGroup(@Nullable Output<String> workGroup) {
            $.workGroup = workGroup;
            return this;
        }

        /**
         * @param workGroup Identifier of Athena workgroup.
         * 
         * @return builder
         * 
         */
        public Builder workGroup(String workGroup) {
            return workGroup(Output.of(workGroup));
        }

        public GlobalConnectionAthenaArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("GlobalConnectionAthenaArgs", "database");
            }
            if ($.regionName == null) {
                throw new MissingRequiredPropertyException("GlobalConnectionAthenaArgs", "regionName");
            }
            if ($.s3StagingDir == null) {
                throw new MissingRequiredPropertyException("GlobalConnectionAthenaArgs", "s3StagingDir");
            }
            return $;
        }
    }

}