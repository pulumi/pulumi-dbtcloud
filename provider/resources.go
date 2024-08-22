// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dbtcloud

import (
	"context"
	"fmt"
	"path/filepath"
	"strconv"

	_ "embed" // to embed bridge metadata

	dbtcloud "github.com/dbt-labs/terraform-provider-dbtcloud/pkg/provider"

	pfbridge "github.com/pulumi/pulumi-terraform-bridge/pf/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	tfbridgetokens "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge/tokens"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"

	"github.com/pulumi/pulumi-dbtcloud/provider/pkg/version"
)

//go:embed cmd/pulumi-resource-dbtcloud/bridge-metadata.json
var bridgeMetadata []byte

func computeIDField(field resource.PropertyKey) tfbridge.ComputeID {
	return tfbridge.DelegateIDField(field, "dbtcloud", "https://github.com/pulumi/pulumi-dbtcloud")
}

// all of the token components used below.
const (
	mainPkg = "dbtcloud"
	mainMod = "index"
)

// Provider returns additional overlaid schema and metadata associated with the provider
func Provider(ctx context.Context) tfbridge.ProviderInfo {
	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P: pfbridge.MuxShimWithPF(ctx,
			shimv2.NewProvider(dbtcloud.SDKProvider("")()),
			dbtcloud.New(),
		),
		Name:              "dbtcloud",
		DisplayName:       "dbt Cloud",
		PluginDownloadURL: "github://api.github.com/pulumi/pulumi-dbtcloud",
		Description:       "A Pulumi package for creating and managing dbt Cloud resources.",
		Keywords:          []string{"pulumi", "dbtcloud", "dbt", "cloud", "category/cloud"},
		License:           "Apache-2.0",
		Homepage:          "https://pulumi.com",
		Repository:        "https://github.com/pulumi/pulumi-dbtcloud",
		GitHubOrg:         "dbt-labs",
		Version:           version.Version,
		LogoURL:           "https://raw.githubusercontent.com/pulumi/pulumi-dbtcloud/main/res/dbt-bit_tm.png",
		TFProviderLicense: tfbridge.SetProviderLicense(tfbridge.MITLicenseType),
		MetadataInfo:      tfbridge.NewProviderMetadata(bridgeMetadata),
		DocRules:          &tfbridge.DocRuleInfo{EditRules: editRules},

		// Ignore legacy tokens (prefix: "dbt_cloud_" instead of "dbtcloud_")
		// These will be removed from upstream at v0.3
		IgnoreMappings: []string{
			"dbt_cloud_bigquery_connection",
			"dbt_cloud_bigquery_credential",
			"dbt_cloud_connection",
			"dbt_cloud_databricks_credential",
			"dbt_cloud_environment",
			"dbt_cloud_environment_variable",
			"dbt_cloud_group",
			"dbt_cloud_job",
			"dbt_cloud_postgres_credential",
			"dbt_cloud_project",
			"dbt_cloud_project_artefacts",
			"dbt_cloud_project_connection",
			"dbt_cloud_project_repository",
			"dbt_cloud_repository",
			"dbt_cloud_service_token",
			"dbt_cloud_snowflake_credential",
			"dbt_cloud_webhook",
			"dbt_cloud_group",
			"dbt_cloud_user",
			"dbt_cloud_privatelink_endpoint",
		},
		Config: map[string]*tfbridge.SchemaInfo{
			"account_id": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"DBT_CLOUD_ACCOUNT_ID"}},
			},
			"token": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"DBT_CLOUD_TOKEN"}},
			},
			"host_url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"DBT_CLOUD_HOST_URL"},
					Value:   "https://cloud.getdbt.com/api",
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"dbtcloud_bigquery_credential": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "BigQueryCredential"),
			},
			"dbtcloud_bigquery_connection": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "BigQueryConnection"),
			},
			"dbtcloud_extended_attributes": {
				Tok:        tfbridge.MakeResource(mainPkg, mainMod, "ExtendedAttributes"),
				CSharpName: "ExtendedAttributesDetails",
			},
			"dbtcloud_job": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Job"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"job_completion_trigger_condition": {
						CSharpName: "CompletionTriggerCondition",
					},
				},
			},
			"dbtcloud_project": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Project"),
			},
			"dbtcloud_project_connection": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ProjectConnection"),
			},
			"dbtcloud_project_repository": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ProjectRepository"),
			},
			"dbtcloud_project_artefacts": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ProjectArtefacts"),
			},
			"dbtcloud_environment": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Environment"),
			},
			"dbtcloud_environment_variable": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "EnvironmentVariable"),
			},
			"dbtcloud_databricks_credential": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "DatabricksCredential"),
			},
			"dbtcloud_snowflake_credential": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "SnowflakeCredential"),
			},
			"dbtcloud_postgres_credential": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "PostgresCredential"),
			},
			"dbtcloud_connection": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Connection"),
			},
			"dbtcloud_repository": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Repository"),
			},
			"dbtcloud_group": {
				Tok:       tfbridge.MakeResource(mainPkg, mainMod, "Group"),
				ComputeID: computeIDField("id"),
			},
			"dbtcloud_global_connection": {
				Fields: map[string]*tfbridge.SchemaInfo{
					"id": {Type: "string"},
				},
			},
			"dbtcloud_service_token": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ServiceToken"),
			},
			"dbtcloud_webhook": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Webhook"),
			},
			"dbtcloud_notification": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Notification"),
			},
			"dbtcloud_user_groups": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "UserGroups"),
			},
			"dbtcloud_license_map": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "LicenseMap"),
			},
			"dbtcloud_environment_variable_job_override": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "EnvironmentVariableJobOverride"),
			},
			"dbtcloud_fabric_connection": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "FabricConnection"),
			},
			"dbtcloud_fabric_credential": {
				Tok:  tfbridge.MakeResource(mainPkg, mainMod, "FabricCredential"),
				Docs: &tfbridge.DocInfo{AllowMissing: true},
			},
			"dbtcloud_partial_license_map": {
				ComputeID: computeIDField("id"),
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"dbtcloud_bigquery_credential": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getBigQueryCredential"),
			},
			"dbtcloud_bigquery_connection": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getBigQueryConnection"),
			},
			"dbtcloud_group": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getGroup"),
			},
			"dbtcloud_job": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getJob"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"job_completion_trigger_condition": {
						CSharpName: "CompletionTriggerCondition",
					},
				},
			},
			"dbtcloud_project": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getProject"),
			},
			"dbtcloud_environment": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getEnvironment"),
			},
			"dbtcloud_environment_variable": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getEnvironmentVariable"),
			},
			"dbtcloud_snowflake_credential": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSnowflakeCredential"),
			},
			"dbtcloud_postgres_credential": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getPostgresCredential"),
			},
			"dbtcloud_databricks_credential": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDatabricksCredential"),
			},
			"dbtcloud_connection": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getConnection"),
			},
			"dbtcloud_repository": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getRepository"),
			},
			"dbtcloud_user": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getUser"),
			},
			"dbtcloud_service_token": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getServiceToken"),
			},
			"dbtcloud_webhook": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getWebhook"),
			},
			"dbtcloud_privatelink_endpoint": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getPrivatelinkEndpoint"),
			},
			"dbtcloud_notification": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getNotification"),
			},
			"dbtcloud_user_groups": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getUserGroups"),
			},
			"dbtcloud_extended_attributes": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getExtendedAttributes"),
			},
			"dbtcloud_group_users": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getGroupUsers"),
			},
			"dbtcloud_azure_dev_ops_project": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAzureDevOpsProject"),
			},
			"dbtcloud_azure_dev_ops_repository": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAzureDevOpsRepository"),
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@pulumi/dbtcloud",

			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0",
				"@types/mime": "^2.0.0",
			},
			RespectSchemaVersion: true,
		},
		Python: &tfbridge.PythonInfo{
			RespectSchemaVersion: true,
			PackageName:          "pulumi_dbtcloud",

			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},

			PyProject: struct{ Enabled bool }{true},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
			RespectSchemaVersion:           true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RespectSchemaVersion: true,
			RootNamespace:        "Pulumi",
			Namespaces: map[string]string{
				"dbtcloud": "DbtCloud",
			},
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.MustComputeTokens(
		tfbridgetokens.SingleModule(
			"dbtcloud_",
			mainMod,
			tfbridgetokens.MakeStandard(mainPkg),
		).Ignore("dbt_cloud_"), // to ignore legacy resources; this is doing nothing for now
	)

	prov.MustApplyAutoAliases()

	prov.SetAutonaming(255, "-")

	convertIDType(&prov, "dbtcloud_group_partial_permissions")

	return prov
}

func convertIDType(prov *tfbridge.ProviderInfo, tfName string) {
	if schema := prov.P.ResourcesMap().Get(tfName).Schema(); schema.Get("id").Type() != shim.TypeInt {
		panic("convertIDType expects to convert from an int to a string")
	}

	prov.Resources[tfName].ComputeID = func(_ context.Context, state resource.PropertyMap) (resource.ID, error) {
		id, ok := state["id"]
		const post = "; this is always a provider bug"
		if !ok {
			return "", fmt.Errorf("missing id property%s", post)
		}
		if !id.IsNumber() {
			return "", fmt.Errorf(`unexpected id type, expected "number", found %s%s`,
				id.TypeString(), post,
			)
		}

		return resource.ID(strconv.FormatFloat(id.NumberValue(), 'f', -1, 64)), nil
	}
}
