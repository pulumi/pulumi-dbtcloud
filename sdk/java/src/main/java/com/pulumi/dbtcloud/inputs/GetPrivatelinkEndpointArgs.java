// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivatelinkEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivatelinkEndpointArgs Empty = new GetPrivatelinkEndpointArgs();

    /**
     * Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
     * 
     */
    @Import(name="privateLinkEndpointUrl")
    private @Nullable Output<String> privateLinkEndpointUrl;

    /**
     * @return The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
     * 
     */
    public Optional<Output<String>> privateLinkEndpointUrl() {
        return Optional.ofNullable(this.privateLinkEndpointUrl);
    }

    private GetPrivatelinkEndpointArgs() {}

    private GetPrivatelinkEndpointArgs(GetPrivatelinkEndpointArgs $) {
        this.name = $.name;
        this.privateLinkEndpointUrl = $.privateLinkEndpointUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivatelinkEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivatelinkEndpointArgs $;

        public Builder() {
            $ = new GetPrivatelinkEndpointArgs();
        }

        public Builder(GetPrivatelinkEndpointArgs defaults) {
            $ = new GetPrivatelinkEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param privateLinkEndpointUrl The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
         * 
         * @return builder
         * 
         */
        public Builder privateLinkEndpointUrl(@Nullable Output<String> privateLinkEndpointUrl) {
            $.privateLinkEndpointUrl = privateLinkEndpointUrl;
            return this;
        }

        /**
         * @param privateLinkEndpointUrl The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
         * 
         * @return builder
         * 
         */
        public Builder privateLinkEndpointUrl(String privateLinkEndpointUrl) {
            return privateLinkEndpointUrl(Output.of(privateLinkEndpointUrl));
        }

        public GetPrivatelinkEndpointArgs build() {
            return $;
        }
    }

}
