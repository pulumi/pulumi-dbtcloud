// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dbtcloud.StarburstCredentialArgs;
import com.pulumi.dbtcloud.Utilities;
import com.pulumi.dbtcloud.inputs.StarburstCredentialState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Starburst/Trino credential resource
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
 * import com.pulumi.dbtcloud.StarburstCredential;
 * import com.pulumi.dbtcloud.StarburstCredentialArgs;
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
 *         var example = new StarburstCredential("example", StarburstCredentialArgs.builder()
 *             .projectId(exampleDbtcloudProject.id())
 *             .database("your_catalog")
 *             .schema("your_schema")
 *             .user("your_user")
 *             .password("your_password")
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
 *   to = dbtcloud_starburst_credential.my_starburst_credential
 * 
 *   id = &#34;project_id:credential_id&#34;
 * 
 * }
 * 
 * import {
 * 
 *   to = dbtcloud_starburst_credential.my_starburst_credential
 * 
 *   id = &#34;12345:6789&#34;
 * 
 * }
 * 
 * using the older import command
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/starburstCredential:StarburstCredential my_starburst_credential &#34;project_id:credential_id&#34;
 * ```
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/starburstCredential:StarburstCredential my_starburst_credential 12345:6789
 * ```
 * 
 */
@ResourceType(type="dbtcloud:index/starburstCredential:StarburstCredential")
public class StarburstCredential extends com.pulumi.resources.CustomResource {
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
     * The catalog to connect use
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output<String> database;

    /**
     * @return The catalog to connect use
     * 
     */
    public Output<String> database() {
        return this.database;
    }
    /**
     * The password for the Starburst/Trino account
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return The password for the Starburst/Trino account
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Project ID to create the Starburst/Trino credential in
     * 
     */
    @Export(name="projectId", refs={Integer.class}, tree="[0]")
    private Output<Integer> projectId;

    /**
     * @return Project ID to create the Starburst/Trino credential in
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }
    /**
     * The schema where to create models
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema where to create models
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * The username for the Starburst/Trino account
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output<String> user;

    /**
     * @return The username for the Starburst/Trino account
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StarburstCredential(java.lang.String name) {
        this(name, StarburstCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StarburstCredential(java.lang.String name, StarburstCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StarburstCredential(java.lang.String name, StarburstCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/starburstCredential:StarburstCredential", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private StarburstCredential(java.lang.String name, Output<java.lang.String> id, @Nullable StarburstCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/starburstCredential:StarburstCredential", name, state, makeResourceOptions(options, id), false);
    }

    private static StarburstCredentialArgs makeArgs(StarburstCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? StarburstCredentialArgs.Empty : args;
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
    public static StarburstCredential get(java.lang.String name, Output<java.lang.String> id, @Nullable StarburstCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new StarburstCredential(name, id, state, options);
    }
}
