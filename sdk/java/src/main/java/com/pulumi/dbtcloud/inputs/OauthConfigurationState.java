// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OauthConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final OauthConfigurationState Empty = new OauthConfigurationState();

    /**
     * The Application ID URI for the OAuth integration. Only for Entra
     * 
     */
    @Import(name="applicationIdUri")
    private @Nullable Output<String> applicationIdUri;

    /**
     * @return The Application ID URI for the OAuth integration. Only for Entra
     * 
     */
    public Optional<Output<String>> applicationIdUri() {
        return Optional.ofNullable(this.applicationIdUri);
    }

    /**
     * The Authorize URL for the OAuth integration
     * 
     */
    @Import(name="authorizeUrl")
    private @Nullable Output<String> authorizeUrl;

    /**
     * @return The Authorize URL for the OAuth integration
     * 
     */
    public Optional<Output<String>> authorizeUrl() {
        return Optional.ofNullable(this.authorizeUrl);
    }

    /**
     * The Client ID for the OAuth integration
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The Client ID for the OAuth integration
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The Client secret for the OAuth integration
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The Client secret for the OAuth integration
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The name of OAuth integration
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of OAuth integration
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The redirect URL for the OAuth integration
     * 
     */
    @Import(name="redirectUri")
    private @Nullable Output<String> redirectUri;

    /**
     * @return The redirect URL for the OAuth integration
     * 
     */
    public Optional<Output<String>> redirectUri() {
        return Optional.ofNullable(this.redirectUri);
    }

    /**
     * The Token URL for the OAuth integration
     * 
     */
    @Import(name="tokenUrl")
    private @Nullable Output<String> tokenUrl;

    /**
     * @return The Token URL for the OAuth integration
     * 
     */
    public Optional<Output<String>> tokenUrl() {
        return Optional.ofNullable(this.tokenUrl);
    }

    /**
     * The type of OAuth integration (`entra` or `okta`)
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type of OAuth integration (`entra` or `okta`)
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private OauthConfigurationState() {}

    private OauthConfigurationState(OauthConfigurationState $) {
        this.applicationIdUri = $.applicationIdUri;
        this.authorizeUrl = $.authorizeUrl;
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.name = $.name;
        this.redirectUri = $.redirectUri;
        this.tokenUrl = $.tokenUrl;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OauthConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OauthConfigurationState $;

        public Builder() {
            $ = new OauthConfigurationState();
        }

        public Builder(OauthConfigurationState defaults) {
            $ = new OauthConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationIdUri The Application ID URI for the OAuth integration. Only for Entra
         * 
         * @return builder
         * 
         */
        public Builder applicationIdUri(@Nullable Output<String> applicationIdUri) {
            $.applicationIdUri = applicationIdUri;
            return this;
        }

        /**
         * @param applicationIdUri The Application ID URI for the OAuth integration. Only for Entra
         * 
         * @return builder
         * 
         */
        public Builder applicationIdUri(String applicationIdUri) {
            return applicationIdUri(Output.of(applicationIdUri));
        }

        /**
         * @param authorizeUrl The Authorize URL for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder authorizeUrl(@Nullable Output<String> authorizeUrl) {
            $.authorizeUrl = authorizeUrl;
            return this;
        }

        /**
         * @param authorizeUrl The Authorize URL for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder authorizeUrl(String authorizeUrl) {
            return authorizeUrl(Output.of(authorizeUrl));
        }

        /**
         * @param clientId The Client ID for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The Client ID for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The Client secret for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The Client secret for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param name The name of OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redirectUri The redirect URL for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder redirectUri(@Nullable Output<String> redirectUri) {
            $.redirectUri = redirectUri;
            return this;
        }

        /**
         * @param redirectUri The redirect URL for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder redirectUri(String redirectUri) {
            return redirectUri(Output.of(redirectUri));
        }

        /**
         * @param tokenUrl The Token URL for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder tokenUrl(@Nullable Output<String> tokenUrl) {
            $.tokenUrl = tokenUrl;
            return this;
        }

        /**
         * @param tokenUrl The Token URL for the OAuth integration
         * 
         * @return builder
         * 
         */
        public Builder tokenUrl(String tokenUrl) {
            return tokenUrl(Output.of(tokenUrl));
        }

        /**
         * @param type The type of OAuth integration (`entra` or `okta`)
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of OAuth integration (`entra` or `okta`)
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public OauthConfigurationState build() {
            return $;
        }
    }

}