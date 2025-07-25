// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Teradata credential resource
 */
export class TeradataCredential extends pulumi.CustomResource {
    /**
     * Get an existing TeradataCredential resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeradataCredentialState, opts?: pulumi.CustomResourceOptions): TeradataCredential {
        return new TeradataCredential(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dbtcloud:index/teradataCredential:TeradataCredential';

    /**
     * Returns true if the given object is an instance of TeradataCredential.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TeradataCredential {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TeradataCredential.__pulumiType;
    }

    /**
     * The internal credential ID
     */
    public /*out*/ readonly credentialId!: pulumi.Output<number>;
    /**
     * The password for the Teradata account
     */
    public readonly password!: pulumi.Output<string>;
    /**
     * Project ID to create the Teradata/Trino credential in
     */
    public readonly projectId!: pulumi.Output<number>;
    /**
     * The schema where to create models
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * The number of threads to use. Default is 1
     */
    public readonly threads!: pulumi.Output<number>;
    /**
     * The username for the Teradata account
     */
    public readonly user!: pulumi.Output<string>;

    /**
     * Create a TeradataCredential resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TeradataCredentialArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeradataCredentialArgs | TeradataCredentialState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeradataCredentialState | undefined;
            resourceInputs["credentialId"] = state ? state.credentialId : undefined;
            resourceInputs["password"] = state ? state.password : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["threads"] = state ? state.threads : undefined;
            resourceInputs["user"] = state ? state.user : undefined;
        } else {
            const args = argsOrState as TeradataCredentialArgs | undefined;
            if ((!args || args.password === undefined) && !opts.urn) {
                throw new Error("Missing required property 'password'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.user === undefined) && !opts.urn) {
                throw new Error("Missing required property 'user'");
            }
            resourceInputs["password"] = args?.password ? pulumi.secret(args.password) : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["threads"] = args ? args.threads : undefined;
            resourceInputs["user"] = args ? args.user : undefined;
            resourceInputs["credentialId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["password"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(TeradataCredential.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TeradataCredential resources.
 */
export interface TeradataCredentialState {
    /**
     * The internal credential ID
     */
    credentialId?: pulumi.Input<number>;
    /**
     * The password for the Teradata account
     */
    password?: pulumi.Input<string>;
    /**
     * Project ID to create the Teradata/Trino credential in
     */
    projectId?: pulumi.Input<number>;
    /**
     * The schema where to create models
     */
    schema?: pulumi.Input<string>;
    /**
     * The number of threads to use. Default is 1
     */
    threads?: pulumi.Input<number>;
    /**
     * The username for the Teradata account
     */
    user?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TeradataCredential resource.
 */
export interface TeradataCredentialArgs {
    /**
     * The password for the Teradata account
     */
    password: pulumi.Input<string>;
    /**
     * Project ID to create the Teradata/Trino credential in
     */
    projectId: pulumi.Input<number>;
    /**
     * The schema where to create models
     */
    schema: pulumi.Input<string>;
    /**
     * The number of threads to use. Default is 1
     */
    threads?: pulumi.Input<number>;
    /**
     * The username for the Teradata account
     */
    user: pulumi.Input<string>;
}
