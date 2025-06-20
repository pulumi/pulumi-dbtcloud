// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dbtcloud.RedshiftCredentialArgs;
import com.pulumi.dbtcloud.Utilities;
import com.pulumi.dbtcloud.inputs.RedshiftCredentialState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Redshift credential resource
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.dbtcloud.RedshiftCredential;
 * import com.pulumi.dbtcloud.RedshiftCredentialArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var redshift = new RedshiftCredential("redshift", RedshiftCredentialArgs.builder()
 *             .numThreads(16)
 *             .projectId(testProject.id())
 *             .defaultSchema("my_schema")
 *             .username("my_username")
 *             .password("my_sensitive_password")
 *             .isActive(true)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * using  import blocks (requires Terraform &gt;= 1.5)
 * 
 * import {
 * 
 *   to = dbtcloud_redshift_credential.my_credential
 * 
 *   id = &#34;project_id:credential_id&#34;
 * 
 * }
 * 
 * import {
 * 
 *   to = dbtcloud_redshift_credential.my_credential
 * 
 *   id = &#34;12345:6789&#34;
 * 
 * }
 * 
 * using the older import command
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/redshiftCredential:RedshiftCredential my_credential &#34;project_id:credential_id&#34;
 * ```
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/redshiftCredential:RedshiftCredential my_credential 12345:6789
 * ```
 * 
 */
@ResourceType(type="dbtcloud:index/redshiftCredential:RedshiftCredential")
public class RedshiftCredential extends com.pulumi.resources.CustomResource {
    /**
     * The internal credential ID
     * 
     */
    @Export(name="credentialId", refs={Integer.class}, tree="[0]")
    private Output<Integer> credentialId;

    /**
     * @return The internal credential ID
     * 
     */
    public Output<Integer> credentialId() {
        return this.credentialId;
    }
    /**
     * Default schema name
     * 
     */
    @Export(name="defaultSchema", refs={String.class}, tree="[0]")
    private Output<String> defaultSchema;

    /**
     * @return Default schema name
     * 
     */
    public Output<String> defaultSchema() {
        return this.defaultSchema;
    }
    /**
     * Whether the Redshift credential is active
     * 
     */
    @Export(name="isActive", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isActive;

    /**
     * @return Whether the Redshift credential is active
     * 
     */
    public Output<Boolean> isActive() {
        return this.isActive;
    }
    /**
     * Number of threads to use
     * 
     */
    @Export(name="numThreads", refs={Integer.class}, tree="[0]")
    private Output<Integer> numThreads;

    /**
     * @return Number of threads to use
     * 
     */
    public Output<Integer> numThreads() {
        return this.numThreads;
    }
    /**
     * The password for the Redshift account
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return The password for the Redshift account
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Project ID to create the Redshift credential in
     * 
     */
    @Export(name="projectId", refs={Integer.class}, tree="[0]")
    private Output<Integer> projectId;

    /**
     * @return Project ID to create the Redshift credential in
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }
    /**
     * The username for the Redshift account.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The username for the Redshift account.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RedshiftCredential(java.lang.String name) {
        this(name, RedshiftCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RedshiftCredential(java.lang.String name, RedshiftCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RedshiftCredential(java.lang.String name, RedshiftCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/redshiftCredential:RedshiftCredential", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private RedshiftCredential(java.lang.String name, Output<java.lang.String> id, @Nullable RedshiftCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/redshiftCredential:RedshiftCredential", name, state, makeResourceOptions(options, id), false);
    }

    private static RedshiftCredentialArgs makeArgs(RedshiftCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RedshiftCredentialArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi/pulumi-dbtcloud")
            .additionalSecretOutputs(List.of(
                "password"
            ))
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
    public static RedshiftCredential get(java.lang.String name, Output<java.lang.String> id, @Nullable RedshiftCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RedshiftCredential(name, id, state, options);
    }
}
