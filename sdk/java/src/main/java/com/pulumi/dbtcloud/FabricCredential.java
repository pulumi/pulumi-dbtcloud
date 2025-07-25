// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dbtcloud.FabricCredentialArgs;
import com.pulumi.dbtcloud.Utilities;
import com.pulumi.dbtcloud.inputs.FabricCredentialState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Fabric credential resource
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
 * import com.pulumi.dbtcloud.FabricCredential;
 * import com.pulumi.dbtcloud.FabricCredentialArgs;
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
 *         // when using AD authentication
 *         var myFabricCredAd = new FabricCredential("myFabricCredAd", FabricCredentialArgs.builder()
 *             .projectId(dbtProject.id())
 *             .schema("my_schema")
 *             .user("my_user")
 *             .password("my_password")
 *             .schemaAuthorization("abcd")
 *             .build());
 * 
 *         // when using service principal authentication
 *         var myFabricCredServPrinc = new FabricCredential("myFabricCredServPrinc", FabricCredentialArgs.builder()
 *             .projectId(dbtProject.id())
 *             .schema("my_schema")
 *             .clientId("my_client_id")
 *             .tenantId("my_tenant_id")
 *             .clientSecret("my_secret")
 *             .schemaAuthorization("abcd")
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
 *   to = dbtcloud_fabric_credential.my_fabric_credential
 * 
 *   id = &#34;project_id:credential_id&#34;
 * 
 * }
 * 
 * import {
 * 
 *   to = dbtcloud_fabric_credential.my_fabric_credential
 * 
 *   id = &#34;12345:6789&#34;
 * 
 * }
 * 
 * using the older import command
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/fabricCredential:FabricCredential my_fabric_credential &#34;project_id:credential_id&#34;
 * ```
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/fabricCredential:FabricCredential my_fabric_credential 12345:6789
 * ```
 * 
 */
@ResourceType(type="dbtcloud:index/fabricCredential:FabricCredential")
public class FabricCredential extends com.pulumi.resources.CustomResource {
    /**
     * The type of the adapter (fabric)
     * 
     */
    @Export(name="adapterType", refs={String.class}, tree="[0]")
    private Output<String> adapterType;

    /**
     * @return The type of the adapter (fabric)
     * 
     */
    public Output<String> adapterType() {
        return this.adapterType;
    }
    /**
     * The client ID of the Azure Active Directory service principal. This is only used when connecting to Azure SQL with an AAD service principal.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output<String> clientId;

    /**
     * @return The client ID of the Azure Active Directory service principal. This is only used when connecting to Azure SQL with an AAD service principal.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * The client secret of the Azure Active Directory service principal. This is only used when connecting to Azure SQL with an AAD service principal.
     * 
     */
    @Export(name="clientSecret", refs={String.class}, tree="[0]")
    private Output<String> clientSecret;

    /**
     * @return The client secret of the Azure Active Directory service principal. This is only used when connecting to Azure SQL with an AAD service principal.
     * 
     */
    public Output<String> clientSecret() {
        return this.clientSecret;
    }
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
     * The password for the account to connect to. Only used when connection with AD user/pass
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output<String> password;

    /**
     * @return The password for the account to connect to. Only used when connection with AD user/pass
     * 
     */
    public Output<String> password() {
        return this.password;
    }
    /**
     * Project ID to create the Fabric credential in
     * 
     */
    @Export(name="projectId", refs={Integer.class}, tree="[0]")
    private Output<Integer> projectId;

    /**
     * @return Project ID to create the Fabric credential in
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }
    /**
     * The schema where to create the dbt models
     * 
     */
    @Export(name="schema", refs={String.class}, tree="[0]")
    private Output<String> schema;

    /**
     * @return The schema where to create the dbt models
     * 
     */
    public Output<String> schema() {
        return this.schema;
    }
    /**
     * Optionally set this to the principal who should own the schemas created by dbt
     * 
     */
    @Export(name="schemaAuthorization", refs={String.class}, tree="[0]")
    private Output<String> schemaAuthorization;

    /**
     * @return Optionally set this to the principal who should own the schemas created by dbt
     * 
     */
    public Output<String> schemaAuthorization() {
        return this.schemaAuthorization;
    }
    /**
     * The tenant ID of the Azure Active Directory instance. This is only used when connecting to Azure SQL with a service principal.
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output<String> tenantId;

    /**
     * @return The tenant ID of the Azure Active Directory instance. This is only used when connecting to Azure SQL with a service principal.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }
    /**
     * The username of the Fabric account to connect to. Only used when connection with AD user/pass
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output<String> user;

    /**
     * @return The username of the Fabric account to connect to. Only used when connection with AD user/pass
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FabricCredential(java.lang.String name) {
        this(name, FabricCredentialArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FabricCredential(java.lang.String name, FabricCredentialArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FabricCredential(java.lang.String name, FabricCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/fabricCredential:FabricCredential", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private FabricCredential(java.lang.String name, Output<java.lang.String> id, @Nullable FabricCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/fabricCredential:FabricCredential", name, state, makeResourceOptions(options, id), false);
    }

    private static FabricCredentialArgs makeArgs(FabricCredentialArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? FabricCredentialArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi/pulumi-dbtcloud")
            .additionalSecretOutputs(List.of(
                "clientSecret",
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
    public static FabricCredential get(java.lang.String name, Output<java.lang.String> id, @Nullable FabricCredentialState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FabricCredential(name, id, state, options);
    }
}
