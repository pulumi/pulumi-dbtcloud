// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnowflakeSemanticLayerCredentialCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnowflakeSemanticLayerCredentialCredentialArgs Empty = new SnowflakeSemanticLayerCredentialCredentialArgs();

    /**
     * The type of Snowflake credential (&#39;password&#39; or &#39;keypair&#39;)
     * 
     */
    @Import(name="authType", required=true)
    private Output<String> authType;

    /**
     * @return The type of Snowflake credential (&#39;password&#39; or &#39;keypair&#39;)
     * 
     */
    public Output<String> authType() {
        return this.authType;
    }

    /**
     * The internal credential ID
     * 
     */
    @Import(name="credentialId")
    private @Nullable Output<Integer> credentialId;

    /**
     * @return The internal credential ID
     * 
     */
    public Optional<Output<Integer>> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }

    /**
     * The catalog to connect use
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return The catalog to connect use
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * The ID of this resource. Contains the project ID and the credential ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of this resource. Contains the project ID and the credential ID.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
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
    @Import(name="numThreads", required=true)
    private Output<Integer> numThreads;

    /**
     * @return Number of threads to use
     * 
     */
    public Output<Integer> numThreads() {
        return this.numThreads;
    }

    /**
     * The password for the Snowflake account
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the Snowflake account
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The private key for the Snowflake account
     * 
     */
    @Import(name="privateKey")
    private @Nullable Output<String> privateKey;

    /**
     * @return The private key for the Snowflake account
     * 
     */
    public Optional<Output<String>> privateKey() {
        return Optional.ofNullable(this.privateKey);
    }

    /**
     * The passphrase for the private key
     * 
     */
    @Import(name="privateKeyPassphrase")
    private @Nullable Output<String> privateKeyPassphrase;

    /**
     * @return The passphrase for the private key
     * 
     */
    public Optional<Output<String>> privateKeyPassphrase() {
        return Optional.ofNullable(this.privateKeyPassphrase);
    }

    /**
     * Project ID to create the Snowflake credential in
     * 
     */
    @Import(name="projectId", required=true)
    private Output<Integer> projectId;

    /**
     * @return Project ID to create the Snowflake credential in
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }

    /**
     * The role to assume
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role to assume
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The schema where to create models. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema where to create models. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Snowflake credential for the Semantic Layer.
     * 
     */
    @Import(name="semanticLayerCredential")
    private @Nullable Output<Boolean> semanticLayerCredential;

    /**
     * @return This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Snowflake credential for the Semantic Layer.
     * 
     */
    public Optional<Output<Boolean>> semanticLayerCredential() {
        return Optional.ofNullable(this.semanticLayerCredential);
    }

    /**
     * The username for the Snowflake account. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return The username for the Snowflake account. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    /**
     * The warehouse to use
     * 
     */
    @Import(name="warehouse")
    private @Nullable Output<String> warehouse;

    /**
     * @return The warehouse to use
     * 
     */
    public Optional<Output<String>> warehouse() {
        return Optional.ofNullable(this.warehouse);
    }

    private SnowflakeSemanticLayerCredentialCredentialArgs() {}

    private SnowflakeSemanticLayerCredentialCredentialArgs(SnowflakeSemanticLayerCredentialCredentialArgs $) {
        this.authType = $.authType;
        this.credentialId = $.credentialId;
        this.database = $.database;
        this.id = $.id;
        this.isActive = $.isActive;
        this.numThreads = $.numThreads;
        this.password = $.password;
        this.privateKey = $.privateKey;
        this.privateKeyPassphrase = $.privateKeyPassphrase;
        this.projectId = $.projectId;
        this.role = $.role;
        this.schema = $.schema;
        this.semanticLayerCredential = $.semanticLayerCredential;
        this.user = $.user;
        this.warehouse = $.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnowflakeSemanticLayerCredentialCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnowflakeSemanticLayerCredentialCredentialArgs $;

        public Builder() {
            $ = new SnowflakeSemanticLayerCredentialCredentialArgs();
        }

        public Builder(SnowflakeSemanticLayerCredentialCredentialArgs defaults) {
            $ = new SnowflakeSemanticLayerCredentialCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authType The type of Snowflake credential (&#39;password&#39; or &#39;keypair&#39;)
         * 
         * @return builder
         * 
         */
        public Builder authType(Output<String> authType) {
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
         * @param credentialId The internal credential ID
         * 
         * @return builder
         * 
         */
        public Builder credentialId(@Nullable Output<Integer> credentialId) {
            $.credentialId = credentialId;
            return this;
        }

        /**
         * @param credentialId The internal credential ID
         * 
         * @return builder
         * 
         */
        public Builder credentialId(Integer credentialId) {
            return credentialId(Output.of(credentialId));
        }

        /**
         * @param database The catalog to connect use
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The catalog to connect use
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param id The ID of this resource. Contains the project ID and the credential ID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of this resource. Contains the project ID and the credential ID.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
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
        public Builder numThreads(Output<Integer> numThreads) {
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
         * @param password The password for the Snowflake account
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the Snowflake account
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param privateKey The private key for the Snowflake account
         * 
         * @return builder
         * 
         */
        public Builder privateKey(@Nullable Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        /**
         * @param privateKey The private key for the Snowflake account
         * 
         * @return builder
         * 
         */
        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        /**
         * @param privateKeyPassphrase The passphrase for the private key
         * 
         * @return builder
         * 
         */
        public Builder privateKeyPassphrase(@Nullable Output<String> privateKeyPassphrase) {
            $.privateKeyPassphrase = privateKeyPassphrase;
            return this;
        }

        /**
         * @param privateKeyPassphrase The passphrase for the private key
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
        public Builder projectId(Output<Integer> projectId) {
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
         * @param role The role to assume
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role to assume
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param schema The schema where to create models. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema where to create models. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param semanticLayerCredential This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Snowflake credential for the Semantic Layer.
         * 
         * @return builder
         * 
         */
        public Builder semanticLayerCredential(@Nullable Output<Boolean> semanticLayerCredential) {
            $.semanticLayerCredential = semanticLayerCredential;
            return this;
        }

        /**
         * @param semanticLayerCredential This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Snowflake credential for the Semantic Layer.
         * 
         * @return builder
         * 
         */
        public Builder semanticLayerCredential(Boolean semanticLayerCredential) {
            return semanticLayerCredential(Output.of(semanticLayerCredential));
        }

        /**
         * @param user The username for the Snowflake account. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user The username for the Snowflake account. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        /**
         * @param warehouse The warehouse to use
         * 
         * @return builder
         * 
         */
        public Builder warehouse(@Nullable Output<String> warehouse) {
            $.warehouse = warehouse;
            return this;
        }

        /**
         * @param warehouse The warehouse to use
         * 
         * @return builder
         * 
         */
        public Builder warehouse(String warehouse) {
            return warehouse(Output.of(warehouse));
        }

        public SnowflakeSemanticLayerCredentialCredentialArgs build() {
            if ($.authType == null) {
                throw new MissingRequiredPropertyException("SnowflakeSemanticLayerCredentialCredentialArgs", "authType");
            }
            if ($.numThreads == null) {
                throw new MissingRequiredPropertyException("SnowflakeSemanticLayerCredentialCredentialArgs", "numThreads");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("SnowflakeSemanticLayerCredentialCredentialArgs", "projectId");
            }
            return $;
        }
    }

}
