// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dbtcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-dbtcloud/sdk/go/dbtcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Redshift credential data source
func LookupRedshiftCredential(ctx *pulumi.Context, args *LookupRedshiftCredentialArgs, opts ...pulumi.InvokeOption) (*LookupRedshiftCredentialResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupRedshiftCredentialResult
	err := ctx.Invoke("dbtcloud:index/getRedshiftCredential:getRedshiftCredential", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getRedshiftCredential.
type LookupRedshiftCredentialArgs struct {
	// Credential ID
	CredentialId int `pulumi:"credentialId"`
	// Default schema name
	DefaultSchema string `pulumi:"defaultSchema"`
	// Project ID
	ProjectId int `pulumi:"projectId"`
}

// A collection of values returned by getRedshiftCredential.
type LookupRedshiftCredentialResult struct {
	// Credential ID
	CredentialId int `pulumi:"credentialId"`
	// Default schema name
	DefaultSchema string `pulumi:"defaultSchema"`
	// The ID of this data source. Contains the project ID and the credential ID.
	Id string `pulumi:"id"`
	// Whether the Redshift credential is active
	IsActive bool `pulumi:"isActive"`
	// Number of threads to use
	NumThreads int `pulumi:"numThreads"`
	// Project ID
	ProjectId int `pulumi:"projectId"`
}

func LookupRedshiftCredentialOutput(ctx *pulumi.Context, args LookupRedshiftCredentialOutputArgs, opts ...pulumi.InvokeOption) LookupRedshiftCredentialResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupRedshiftCredentialResultOutput, error) {
			args := v.(LookupRedshiftCredentialArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("dbtcloud:index/getRedshiftCredential:getRedshiftCredential", args, LookupRedshiftCredentialResultOutput{}, options).(LookupRedshiftCredentialResultOutput), nil
		}).(LookupRedshiftCredentialResultOutput)
}

// A collection of arguments for invoking getRedshiftCredential.
type LookupRedshiftCredentialOutputArgs struct {
	// Credential ID
	CredentialId pulumi.IntInput `pulumi:"credentialId"`
	// Default schema name
	DefaultSchema pulumi.StringInput `pulumi:"defaultSchema"`
	// Project ID
	ProjectId pulumi.IntInput `pulumi:"projectId"`
}

func (LookupRedshiftCredentialOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRedshiftCredentialArgs)(nil)).Elem()
}

// A collection of values returned by getRedshiftCredential.
type LookupRedshiftCredentialResultOutput struct{ *pulumi.OutputState }

func (LookupRedshiftCredentialResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupRedshiftCredentialResult)(nil)).Elem()
}

func (o LookupRedshiftCredentialResultOutput) ToLookupRedshiftCredentialResultOutput() LookupRedshiftCredentialResultOutput {
	return o
}

func (o LookupRedshiftCredentialResultOutput) ToLookupRedshiftCredentialResultOutputWithContext(ctx context.Context) LookupRedshiftCredentialResultOutput {
	return o
}

// Credential ID
func (o LookupRedshiftCredentialResultOutput) CredentialId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRedshiftCredentialResult) int { return v.CredentialId }).(pulumi.IntOutput)
}

// Default schema name
func (o LookupRedshiftCredentialResultOutput) DefaultSchema() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRedshiftCredentialResult) string { return v.DefaultSchema }).(pulumi.StringOutput)
}

// The ID of this data source. Contains the project ID and the credential ID.
func (o LookupRedshiftCredentialResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupRedshiftCredentialResult) string { return v.Id }).(pulumi.StringOutput)
}

// Whether the Redshift credential is active
func (o LookupRedshiftCredentialResultOutput) IsActive() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupRedshiftCredentialResult) bool { return v.IsActive }).(pulumi.BoolOutput)
}

// Number of threads to use
func (o LookupRedshiftCredentialResultOutput) NumThreads() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRedshiftCredentialResult) int { return v.NumThreads }).(pulumi.IntOutput)
}

// Project ID
func (o LookupRedshiftCredentialResultOutput) ProjectId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupRedshiftCredentialResult) int { return v.ProjectId }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupRedshiftCredentialResultOutput{})
}
