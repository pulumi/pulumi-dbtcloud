// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dbtcloud.SnowflakeSemanticLayerCredentialArgs;
import com.pulumi.dbtcloud.Utilities;
import com.pulumi.dbtcloud.inputs.SnowflakeSemanticLayerCredentialState;
import com.pulumi.dbtcloud.outputs.SnowflakeSemanticLayerCredentialConfiguration;
import com.pulumi.dbtcloud.outputs.SnowflakeSemanticLayerCredentialCredential;
import javax.annotation.Nullable;

/**
 * Snowflake credential resource. This resource is composed of a Snowflake credential and a Semantic Layer configuration. It is used to create a Snowflake credential for the Semantic Layer.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * using import blocks (requires Terraform &gt;= 1.5)
 * 
 * import {
 * 
 *   to = dbtcloud_snowflake_semantic_layer_credential.example
 * 
 *   id = &#34;credential_id&#34;
 * 
 * }
 * 
 * import {
 * 
 *   to = dbtcloud_snowflake_semantic_layer_credential.example
 * 
 *   id = &#34;12345&#34;
 * 
 * }
 * 
 * using the older import command
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/snowflakeSemanticLayerCredential:SnowflakeSemanticLayerCredential example &#34;credential_id&#34;
 * ```
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/snowflakeSemanticLayerCredential:SnowflakeSemanticLayerCredential example 12345
 * ```
 * 
 */
@ResourceType(type="dbtcloud:index/snowflakeSemanticLayerCredential:SnowflakeSemanticLayerCredential")
public class SnowflakeSemanticLayerCredential extends com.pulumi.resources.CustomResource {
    /**
     * Semantic Layer credenttial configuration details.
     * 
     */
    @Export(name="configuration", refs={SnowflakeSemanticLayerCredentialConfiguration.class}, tree="[0]")
    private Output<SnowflakeSemanticLayerCredentialConfiguration> configuration;

    /**
     * @return Semantic Layer credenttial configuration details.
     * 
     */
    public Output<SnowflakeSemanticLayerCredentialConfiguration> configuration() {
        return this.configuration;
    }
    /**
     * Snowflake credential details, but used in the context of the Semantic Layer.
     * 
     */
    @Export(name="credential", refs={SnowflakeSemanticLayerCredentialCredential.class}, tree="[0]")
    private Output<SnowflakeSemanticLayerCredentialCredential> credential;

    /**
     * @return Snowflake credential details, but used in the context of the Semantic Layer.
     * 
     */
    public Output<SnowflakeSemanticLayerCredentialCredential> credential() {
        return this.credential;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnowflakeSemanticLayerCredential(java.lang.String name) {
        this(name, SnowflakeSemanticLayerCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnowflakeSemanticLayerCredential(java.lang.String name, SnowflakeSemanticLayerCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnowflakeSemanticLayerCredential(java.lang.String name, SnowflakeSemanticLayerCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/snowflakeSemanticLayerCredential:SnowflakeSemanticLayerCredential", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SnowflakeSemanticLayerCredential(java.lang.String name, Output<java.lang.String> id, @Nullable SnowflakeSemanticLayerCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/snowflakeSemanticLayerCredential:SnowflakeSemanticLayerCredential", name, state, makeResourceOptions(options, id), false);
    }

    private static SnowflakeSemanticLayerCredentialArgs makeArgs(SnowflakeSemanticLayerCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SnowflakeSemanticLayerCredentialArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi/pulumi-dbtcloud")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SnowflakeSemanticLayerCredential get(java.lang.String name, Output<java.lang.String> id, @Nullable SnowflakeSemanticLayerCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SnowflakeSemanticLayerCredential(name, id, state, options);
    }
}
