// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProjectPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProjectPlainArgs Empty = new GetProjectPlainArgs();

    /**
     * Project ID
     * 
     */
    @Import(name="id")
    private @Nullable Integer id;

    /**
     * @return Project ID
     * 
     */
    public Optional<Integer> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Project name
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Project name
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetProjectPlainArgs() {}

    private GetProjectPlainArgs(GetProjectPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProjectPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProjectPlainArgs $;

        public Builder() {
            $ = new GetProjectPlainArgs();
        }

        public Builder(GetProjectPlainArgs defaults) {
            $ = new GetProjectPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Project ID
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Integer id) {
            $.id = id;
            return this;
        }

        /**
         * @param name Project name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetProjectPlainArgs build() {
            return $;
        }
    }

}
