// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRepositoryPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRepositoryPlainArgs Empty = new GetRepositoryPlainArgs();

    /**
     * Whether we should return the public deploy key
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future version of the provider. The key is always fetched when the clone strategy is `deploy_key`
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future version of the provider. The key is always fetched when the clone strategy is `deploy_key` */
    @Import(name="fetchDeployKey")
    private @Nullable Boolean fetchDeployKey;

    /**
     * @return Whether we should return the public deploy key
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future version of the provider. The key is always fetched when the clone strategy is `deploy_key`
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future version of the provider. The key is always fetched when the clone strategy is `deploy_key` */
    public Optional<Boolean> fetchDeployKey() {
        return Optional.ofNullable(this.fetchDeployKey);
    }

    /**
     * Project ID to create the repository in
     * 
     */
    @Import(name="projectId", required=true)
    private Integer projectId;

    /**
     * @return Project ID to create the repository in
     * 
     */
    public Integer projectId() {
        return this.projectId;
    }

    /**
     * ID for the repository
     * 
     */
    @Import(name="repositoryId", required=true)
    private Integer repositoryId;

    /**
     * @return ID for the repository
     * 
     */
    public Integer repositoryId() {
        return this.repositoryId;
    }

    private GetRepositoryPlainArgs() {}

    private GetRepositoryPlainArgs(GetRepositoryPlainArgs $) {
        this.fetchDeployKey = $.fetchDeployKey;
        this.projectId = $.projectId;
        this.repositoryId = $.repositoryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRepositoryPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRepositoryPlainArgs $;

        public Builder() {
            $ = new GetRepositoryPlainArgs();
        }

        public Builder(GetRepositoryPlainArgs defaults) {
            $ = new GetRepositoryPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fetchDeployKey Whether we should return the public deploy key
         * 
         * @return builder
         * 
         * @deprecated
         * This field is deprecated and will be removed in a future version of the provider. The key is always fetched when the clone strategy is `deploy_key`
         * 
         */
        @Deprecated /* This field is deprecated and will be removed in a future version of the provider. The key is always fetched when the clone strategy is `deploy_key` */
        public Builder fetchDeployKey(@Nullable Boolean fetchDeployKey) {
            $.fetchDeployKey = fetchDeployKey;
            return this;
        }

        /**
         * @param projectId Project ID to create the repository in
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param repositoryId ID for the repository
         * 
         * @return builder
         * 
         */
        public Builder repositoryId(Integer repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        public GetRepositoryPlainArgs build() {
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetRepositoryPlainArgs", "projectId");
            }
            if ($.repositoryId == null) {
                throw new MissingRequiredPropertyException("GetRepositoryPlainArgs", "repositoryId");
            }
            return $;
        }
    }

}