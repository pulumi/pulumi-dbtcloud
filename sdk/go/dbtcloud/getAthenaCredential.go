// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dbtcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-dbtcloud/sdk/go/dbtcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Athena credential data source
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-dbtcloud/sdk/go/dbtcloud"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := dbtcloud.LookupAthenaCredential(ctx, &dbtcloud.LookupAthenaCredentialArgs{
//				ProjectId:    123,
//				CredentialId: 456,
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupAthenaCredential(ctx *pulumi.Context, args *LookupAthenaCredentialArgs, opts ...pulumi.InvokeOption) (*LookupAthenaCredentialResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupAthenaCredentialResult
	err := ctx.Invoke("dbtcloud:index/getAthenaCredential:getAthenaCredential", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAthenaCredential.
type LookupAthenaCredentialArgs struct {
	// Credential ID
	CredentialId int `pulumi:"credentialId"`
	// Project ID
	ProjectId int `pulumi:"projectId"`
}

// A collection of values returned by getAthenaCredential.
type LookupAthenaCredentialResult struct {
	// Credential ID
	CredentialId int `pulumi:"credentialId"`
	// The ID of this resource. Contains the project ID and the credential ID.
	Id string `pulumi:"id"`
	// Project ID
	ProjectId int `pulumi:"projectId"`
	// The schema where to create models
	Schema string `pulumi:"schema"`
}

func LookupAthenaCredentialOutput(ctx *pulumi.Context, args LookupAthenaCredentialOutputArgs, opts ...pulumi.InvokeOption) LookupAthenaCredentialResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupAthenaCredentialResultOutput, error) {
			args := v.(LookupAthenaCredentialArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("dbtcloud:index/getAthenaCredential:getAthenaCredential", args, LookupAthenaCredentialResultOutput{}, options).(LookupAthenaCredentialResultOutput), nil
		}).(LookupAthenaCredentialResultOutput)
}

// A collection of arguments for invoking getAthenaCredential.
type LookupAthenaCredentialOutputArgs struct {
	// Credential ID
	CredentialId pulumi.IntInput `pulumi:"credentialId"`
	// Project ID
	ProjectId pulumi.IntInput `pulumi:"projectId"`
}

func (LookupAthenaCredentialOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAthenaCredentialArgs)(nil)).Elem()
}

// A collection of values returned by getAthenaCredential.
type LookupAthenaCredentialResultOutput struct{ *pulumi.OutputState }

func (LookupAthenaCredentialResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAthenaCredentialResult)(nil)).Elem()
}

func (o LookupAthenaCredentialResultOutput) ToLookupAthenaCredentialResultOutput() LookupAthenaCredentialResultOutput {
	return o
}

func (o LookupAthenaCredentialResultOutput) ToLookupAthenaCredentialResultOutputWithContext(ctx context.Context) LookupAthenaCredentialResultOutput {
	return o
}

// Credential ID
func (o LookupAthenaCredentialResultOutput) CredentialId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAthenaCredentialResult) int { return v.CredentialId }).(pulumi.IntOutput)
}

// The ID of this resource. Contains the project ID and the credential ID.
func (o LookupAthenaCredentialResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAthenaCredentialResult) string { return v.Id }).(pulumi.StringOutput)
}

// Project ID
func (o LookupAthenaCredentialResultOutput) ProjectId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupAthenaCredentialResult) int { return v.ProjectId }).(pulumi.IntOutput)
}

// The schema where to create models
func (o LookupAthenaCredentialResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAthenaCredentialResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAthenaCredentialResultOutput{})
}
