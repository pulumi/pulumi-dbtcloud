// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dbtcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-dbtcloud/sdk/go/dbtcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Redshift credential resource. This resource is composed of a Redshift credential and a Semantic Layer configuration. It is used to create a Redshift credential for the Semantic Layer.
//
// ## Import
//
// using import blocks (requires Terraform >= 1.5)
//
// import {
//
//	to = dbtcloud_redshift_semantic_layer_credential.example
//
//	id = "credential_id"
//
// }
//
// import {
//
//	to = dbtcloud_redshift_semantic_layer_credential.example
//
//	id = "12345"
//
// }
//
// using the older import command
//
// ```sh
// $ pulumi import dbtcloud:index/redshiftSemanticLayerCredential:RedshiftSemanticLayerCredential example "credential_id"
// ```
//
// ```sh
// $ pulumi import dbtcloud:index/redshiftSemanticLayerCredential:RedshiftSemanticLayerCredential example 12345
// ```
type RedshiftSemanticLayerCredential struct {
	pulumi.CustomResourceState

	// Semantic Layer credential configuration details.
	Configuration RedshiftSemanticLayerCredentialConfigurationOutput `pulumi:"configuration"`
	// Redshift credential details, but used in the context of the Semantic Layer.
	Credential RedshiftSemanticLayerCredentialCredentialOutput `pulumi:"credential"`
}

// NewRedshiftSemanticLayerCredential registers a new resource with the given unique name, arguments, and options.
func NewRedshiftSemanticLayerCredential(ctx *pulumi.Context,
	name string, args *RedshiftSemanticLayerCredentialArgs, opts ...pulumi.ResourceOption) (*RedshiftSemanticLayerCredential, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Configuration == nil {
		return nil, errors.New("invalid value for required argument 'Configuration'")
	}
	if args.Credential == nil {
		return nil, errors.New("invalid value for required argument 'Credential'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RedshiftSemanticLayerCredential
	err := ctx.RegisterResource("dbtcloud:index/redshiftSemanticLayerCredential:RedshiftSemanticLayerCredential", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRedshiftSemanticLayerCredential gets an existing RedshiftSemanticLayerCredential resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRedshiftSemanticLayerCredential(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RedshiftSemanticLayerCredentialState, opts ...pulumi.ResourceOption) (*RedshiftSemanticLayerCredential, error) {
	var resource RedshiftSemanticLayerCredential
	err := ctx.ReadResource("dbtcloud:index/redshiftSemanticLayerCredential:RedshiftSemanticLayerCredential", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RedshiftSemanticLayerCredential resources.
type redshiftSemanticLayerCredentialState struct {
	// Semantic Layer credential configuration details.
	Configuration *RedshiftSemanticLayerCredentialConfiguration `pulumi:"configuration"`
	// Redshift credential details, but used in the context of the Semantic Layer.
	Credential *RedshiftSemanticLayerCredentialCredential `pulumi:"credential"`
}

type RedshiftSemanticLayerCredentialState struct {
	// Semantic Layer credential configuration details.
	Configuration RedshiftSemanticLayerCredentialConfigurationPtrInput
	// Redshift credential details, but used in the context of the Semantic Layer.
	Credential RedshiftSemanticLayerCredentialCredentialPtrInput
}

func (RedshiftSemanticLayerCredentialState) ElementType() reflect.Type {
	return reflect.TypeOf((*redshiftSemanticLayerCredentialState)(nil)).Elem()
}

type redshiftSemanticLayerCredentialArgs struct {
	// Semantic Layer credential configuration details.
	Configuration RedshiftSemanticLayerCredentialConfiguration `pulumi:"configuration"`
	// Redshift credential details, but used in the context of the Semantic Layer.
	Credential RedshiftSemanticLayerCredentialCredential `pulumi:"credential"`
}

// The set of arguments for constructing a RedshiftSemanticLayerCredential resource.
type RedshiftSemanticLayerCredentialArgs struct {
	// Semantic Layer credential configuration details.
	Configuration RedshiftSemanticLayerCredentialConfigurationInput
	// Redshift credential details, but used in the context of the Semantic Layer.
	Credential RedshiftSemanticLayerCredentialCredentialInput
}

func (RedshiftSemanticLayerCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*redshiftSemanticLayerCredentialArgs)(nil)).Elem()
}

type RedshiftSemanticLayerCredentialInput interface {
	pulumi.Input

	ToRedshiftSemanticLayerCredentialOutput() RedshiftSemanticLayerCredentialOutput
	ToRedshiftSemanticLayerCredentialOutputWithContext(ctx context.Context) RedshiftSemanticLayerCredentialOutput
}

func (*RedshiftSemanticLayerCredential) ElementType() reflect.Type {
	return reflect.TypeOf((**RedshiftSemanticLayerCredential)(nil)).Elem()
}

func (i *RedshiftSemanticLayerCredential) ToRedshiftSemanticLayerCredentialOutput() RedshiftSemanticLayerCredentialOutput {
	return i.ToRedshiftSemanticLayerCredentialOutputWithContext(context.Background())
}

func (i *RedshiftSemanticLayerCredential) ToRedshiftSemanticLayerCredentialOutputWithContext(ctx context.Context) RedshiftSemanticLayerCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RedshiftSemanticLayerCredentialOutput)
}

// RedshiftSemanticLayerCredentialArrayInput is an input type that accepts RedshiftSemanticLayerCredentialArray and RedshiftSemanticLayerCredentialArrayOutput values.
// You can construct a concrete instance of `RedshiftSemanticLayerCredentialArrayInput` via:
//
//	RedshiftSemanticLayerCredentialArray{ RedshiftSemanticLayerCredentialArgs{...} }
type RedshiftSemanticLayerCredentialArrayInput interface {
	pulumi.Input

	ToRedshiftSemanticLayerCredentialArrayOutput() RedshiftSemanticLayerCredentialArrayOutput
	ToRedshiftSemanticLayerCredentialArrayOutputWithContext(context.Context) RedshiftSemanticLayerCredentialArrayOutput
}

type RedshiftSemanticLayerCredentialArray []RedshiftSemanticLayerCredentialInput

func (RedshiftSemanticLayerCredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RedshiftSemanticLayerCredential)(nil)).Elem()
}

func (i RedshiftSemanticLayerCredentialArray) ToRedshiftSemanticLayerCredentialArrayOutput() RedshiftSemanticLayerCredentialArrayOutput {
	return i.ToRedshiftSemanticLayerCredentialArrayOutputWithContext(context.Background())
}

func (i RedshiftSemanticLayerCredentialArray) ToRedshiftSemanticLayerCredentialArrayOutputWithContext(ctx context.Context) RedshiftSemanticLayerCredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RedshiftSemanticLayerCredentialArrayOutput)
}

// RedshiftSemanticLayerCredentialMapInput is an input type that accepts RedshiftSemanticLayerCredentialMap and RedshiftSemanticLayerCredentialMapOutput values.
// You can construct a concrete instance of `RedshiftSemanticLayerCredentialMapInput` via:
//
//	RedshiftSemanticLayerCredentialMap{ "key": RedshiftSemanticLayerCredentialArgs{...} }
type RedshiftSemanticLayerCredentialMapInput interface {
	pulumi.Input

	ToRedshiftSemanticLayerCredentialMapOutput() RedshiftSemanticLayerCredentialMapOutput
	ToRedshiftSemanticLayerCredentialMapOutputWithContext(context.Context) RedshiftSemanticLayerCredentialMapOutput
}

type RedshiftSemanticLayerCredentialMap map[string]RedshiftSemanticLayerCredentialInput

func (RedshiftSemanticLayerCredentialMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RedshiftSemanticLayerCredential)(nil)).Elem()
}

func (i RedshiftSemanticLayerCredentialMap) ToRedshiftSemanticLayerCredentialMapOutput() RedshiftSemanticLayerCredentialMapOutput {
	return i.ToRedshiftSemanticLayerCredentialMapOutputWithContext(context.Background())
}

func (i RedshiftSemanticLayerCredentialMap) ToRedshiftSemanticLayerCredentialMapOutputWithContext(ctx context.Context) RedshiftSemanticLayerCredentialMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RedshiftSemanticLayerCredentialMapOutput)
}

type RedshiftSemanticLayerCredentialOutput struct{ *pulumi.OutputState }

func (RedshiftSemanticLayerCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RedshiftSemanticLayerCredential)(nil)).Elem()
}

func (o RedshiftSemanticLayerCredentialOutput) ToRedshiftSemanticLayerCredentialOutput() RedshiftSemanticLayerCredentialOutput {
	return o
}

func (o RedshiftSemanticLayerCredentialOutput) ToRedshiftSemanticLayerCredentialOutputWithContext(ctx context.Context) RedshiftSemanticLayerCredentialOutput {
	return o
}

// Semantic Layer credential configuration details.
func (o RedshiftSemanticLayerCredentialOutput) Configuration() RedshiftSemanticLayerCredentialConfigurationOutput {
	return o.ApplyT(func(v *RedshiftSemanticLayerCredential) RedshiftSemanticLayerCredentialConfigurationOutput {
		return v.Configuration
	}).(RedshiftSemanticLayerCredentialConfigurationOutput)
}

// Redshift credential details, but used in the context of the Semantic Layer.
func (o RedshiftSemanticLayerCredentialOutput) Credential() RedshiftSemanticLayerCredentialCredentialOutput {
	return o.ApplyT(func(v *RedshiftSemanticLayerCredential) RedshiftSemanticLayerCredentialCredentialOutput {
		return v.Credential
	}).(RedshiftSemanticLayerCredentialCredentialOutput)
}

type RedshiftSemanticLayerCredentialArrayOutput struct{ *pulumi.OutputState }

func (RedshiftSemanticLayerCredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RedshiftSemanticLayerCredential)(nil)).Elem()
}

func (o RedshiftSemanticLayerCredentialArrayOutput) ToRedshiftSemanticLayerCredentialArrayOutput() RedshiftSemanticLayerCredentialArrayOutput {
	return o
}

func (o RedshiftSemanticLayerCredentialArrayOutput) ToRedshiftSemanticLayerCredentialArrayOutputWithContext(ctx context.Context) RedshiftSemanticLayerCredentialArrayOutput {
	return o
}

func (o RedshiftSemanticLayerCredentialArrayOutput) Index(i pulumi.IntInput) RedshiftSemanticLayerCredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RedshiftSemanticLayerCredential {
		return vs[0].([]*RedshiftSemanticLayerCredential)[vs[1].(int)]
	}).(RedshiftSemanticLayerCredentialOutput)
}

type RedshiftSemanticLayerCredentialMapOutput struct{ *pulumi.OutputState }

func (RedshiftSemanticLayerCredentialMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RedshiftSemanticLayerCredential)(nil)).Elem()
}

func (o RedshiftSemanticLayerCredentialMapOutput) ToRedshiftSemanticLayerCredentialMapOutput() RedshiftSemanticLayerCredentialMapOutput {
	return o
}

func (o RedshiftSemanticLayerCredentialMapOutput) ToRedshiftSemanticLayerCredentialMapOutputWithContext(ctx context.Context) RedshiftSemanticLayerCredentialMapOutput {
	return o
}

func (o RedshiftSemanticLayerCredentialMapOutput) MapIndex(k pulumi.StringInput) RedshiftSemanticLayerCredentialOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RedshiftSemanticLayerCredential {
		return vs[0].(map[string]*RedshiftSemanticLayerCredential)[vs[1].(string)]
	}).(RedshiftSemanticLayerCredentialOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RedshiftSemanticLayerCredentialInput)(nil)).Elem(), &RedshiftSemanticLayerCredential{})
	pulumi.RegisterInputType(reflect.TypeOf((*RedshiftSemanticLayerCredentialArrayInput)(nil)).Elem(), RedshiftSemanticLayerCredentialArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RedshiftSemanticLayerCredentialMapInput)(nil)).Elem(), RedshiftSemanticLayerCredentialMap{})
	pulumi.RegisterOutputType(RedshiftSemanticLayerCredentialOutput{})
	pulumi.RegisterOutputType(RedshiftSemanticLayerCredentialArrayOutput{})
	pulumi.RegisterOutputType(RedshiftSemanticLayerCredentialMapOutput{})
}
