// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectsPlainArgs Empty = new GetProjectsPlainArgs();

    /**
     * Used to filter projects by name, Optional
     * 
     */
    @Import(name="nameContains")
    private @Nullable String nameContains;

    /**
     * @return Used to filter projects by name, Optional
     * 
     */
    public Optional<String> nameContains() {
        return Optional.ofNullable(this.nameContains);
    }

    private GetProjectsPlainArgs() {}

    private GetProjectsPlainArgs(GetProjectsPlainArgs $) {
        this.nameContains = $.nameContains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectsPlainArgs $;

        public Builder() {
            $ = new GetProjectsPlainArgs();
        }

        public Builder(GetProjectsPlainArgs defaults) {
            $ = new GetProjectsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nameContains Used to filter projects by name, Optional
         * 
         * @return builder
         * 
         */
        public Builder nameContains(@Nullable String nameContains) {
            $.nameContains = nameContains;
            return this;
        }

        public GetProjectsPlainArgs build() {
            return $;
        }
    }

}
