// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentsArgs Empty = new GetEnvironmentsArgs();

    /**
     * The project ID to filter the environments for [Optional]
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<Integer> projectId;

    /**
     * @return The project ID to filter the environments for [Optional]
     * 
     */
    public Optional<Output<Integer>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetEnvironmentsArgs() {}

    private GetEnvironmentsArgs(GetEnvironmentsArgs $) {
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentsArgs $;

        public Builder() {
            $ = new GetEnvironmentsArgs();
        }

        public Builder(GetEnvironmentsArgs defaults) {
            $ = new GetEnvironmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param projectId The project ID to filter the environments for [Optional]
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The project ID to filter the environments for [Optional]
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        public GetEnvironmentsArgs build() {
            return $;
        }
    }

}
