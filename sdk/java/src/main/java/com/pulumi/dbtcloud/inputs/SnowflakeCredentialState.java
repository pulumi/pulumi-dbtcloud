// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnowflakeCredentialState extends com.pulumi.resources.ResourceArgs {

    public static final SnowflakeCredentialState Empty = new SnowflakeCredentialState();

    /**
     * The type of Snowflake credential (&#39;password&#39; or &#39;keypair&#39;)
     * 
     */
    @Import(name="authType")
    private @Nullable Output<String> authType;

    /**
     * @return The type of Snowflake credential (&#39;password&#39; or &#39;keypair&#39;)
     * 
     */
    public Optional<Output<String>> authType() {
        return Optional.ofNullable(this.authType);
    }

    /**
     * The system Snowflake credential ID
     * 
     */
    @Import(name="credentialId")
    private @Nullable Output<Integer> credentialId;

    /**
     * @return The system Snowflake credential ID
     * 
     */
    public Optional<Output<Integer>> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }

    /**
     * Database to connect to
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Database to connect to
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Whether the Snowflake credential is active
     * 
     */
    @Import(name="isActive")
    private @Nullable Output<Boolean> isActive;

    /**
     * @return Whether the Snowflake credential is active
     * 
     */
    public Optional<Output<Boolean>> isActive() {
        return Optional.ofNullable(this.isActive);
    }

    /**
     * Number of threads to use
     * 
     */
    @Import(name="numThreads")
    private @Nullable Output<Integer> numThreads;

    /**
     * @return Number of threads to use
     * 
     */
    public Optional<Output<Integer>> numThreads() {
        return Optional.ofNullable(this.numThreads);
    }

    /**
     * Password for Snowflake
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return Password for Snowflake
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Private key for Snowflake
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return Private key for Snowflake
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * Private key passphrase for Snowflake
     * 
     */
    @Import(name="privateKeyPassphrase")
    private @Nullable Output<String> privateKeyPassphrase;

    /**
     * @return Private key passphrase for Snowflake
     * 
     */
    public Optional<Output<String>> privateKeyPassphrase() {
        return Optional.ofNullable(this.privateKeyPassphrase);
    }

    /**
     * Project ID to create the Snowflake credential in
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<Integer> projectId;

    /**
     * @return Project ID to create the Snowflake credential in
     * 
     */
    public Optional<Output<Integer>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Role to assume
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return Role to assume
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Default schema name
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return Default schema name
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Username for Snowflake
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return Username for Snowflake
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    /**
     * Warehouse to use
     * 
     */
    @Import(name="warehouse")
    private @Nullable Output<String> warehouse;

    /**
     * @return Warehouse to use
     * 
     */
    public Optional<Output<String>> warehouse() {
        return Optional.ofNullable(this.warehouse);
    }

    private SnowflakeCredentialState() {}

    private SnowflakeCredentialState(SnowflakeCredentialState $) {
        this.authType = $.authType;
        this.credentialId = $.credentialId;
        this.database = $.database;
        this.isActive = $.isActive;
        this.numThreads = $.numThreads;
        this.password = $.password;
        this.privateKey = $.privateKey;
        this.privateKeyPassphrase = $.privateKeyPassphrase;
        this.projectId = $.projectId;
        this.role = $.role;
        this.schema = $.schema;
        this.user = $.user;
        this.warehouse = $.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnowflakeCredentialState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnowflakeCredentialState $;

        public Builder() {
            $ = new SnowflakeCredentialState();
        }

        public Builder(SnowflakeCredentialState defaults) {
            $ = new SnowflakeCredentialState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authType The type of Snowflake credential (&#39;password&#39; or &#39;keypair&#39;)
         * 
         * @return builder
         * 
         */
        public Builder authType(@Nullable Output<String> authType) {
            $.authType = authType;
            return this;
        }

        /**
         * @param authType The type of Snowflake credential (&#39;password&#39; or &#39;keypair&#39;)
         * 
         * @return builder
         * 
         */
        public Builder authType(String authType) {
            return authType(Output.of(authType));
        }

        /**
         * @param credentialId The system Snowflake credential ID
         * 
         * @return builder
         * 
         */
        public Builder credentialId(@Nullable Output<Integer> credentialId) {
            $.credentialId = credentialId;
            return this;
        }

        /**
         * @param credentialId The system Snowflake credential ID
         * 
         * @return builder
         * 
         */
        public Builder credentialId(Integer credentialId) {
            return credentialId(Output.of(credentialId));
        }

        /**
         * @param database Database to connect to
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Database to connect to
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param isActive Whether the Snowflake credential is active
         * 
         * @return builder
         * 
         */
        public Builder isActive(@Nullable Output<Boolean> isActive) {
            $.isActive = isActive;
            return this;
        }

        /**
         * @param isActive Whether the Snowflake credential is active
         * 
         * @return builder
         * 
         */
        public Builder isActive(Boolean isActive) {
            return isActive(Output.of(isActive));
        }

        /**
         * @param numThreads Number of threads to use
         * 
         * @return builder
         * 
         */
        public Builder numThreads(@Nullable Output<Integer> numThreads) {
            $.numThreads = numThreads;
            return this;
        }

        /**
         * @param numThreads Number of threads to use
         * 
         * @return builder
         * 
         */
        public Builder numThreads(Integer numThreads) {
            return numThreads(Output.of(numThreads));
        }

        /**
         * @param password Password for Snowflake
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password Password for Snowflake
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param privateKey Private key for Snowflake
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey Private key for Snowflake
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param privateKeyPassphrase Private key passphrase for Snowflake
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPassphrase(@Nullable Output<String> privateKeyPassphrase) {
            $.privateKeyPassphrase = privateKeyPassphrase;
            return this;
        }

        /**
         * @param privateKeyPassphrase Private key passphrase for Snowflake
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPassphrase(String privateKeyPassphrase) {
            return privateKeyPassphrase(Output.of(privateKeyPassphrase));
        }

        /**
         * @param projectId Project ID to create the Snowflake credential in
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID to create the Snowflake credential in
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param role Role to assume
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Role to assume
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param schema Default schema name
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Default schema name
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param user Username for Snowflake
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user Username for Snowflake
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        /**
         * @param warehouse Warehouse to use
         * 
         * @return builder
         * 
         */
        public Builder warehouse(@Nullable Output<String> warehouse) {
            $.warehouse = warehouse;
            return this;
        }

        /**
         * @param warehouse Warehouse to use
         * 
         * @return builder
         * 
         */
        public Builder warehouse(String warehouse) {
            return warehouse(Output.of(warehouse));
        }

        public SnowflakeCredentialState build() {
            return $;
        }
    }

}
