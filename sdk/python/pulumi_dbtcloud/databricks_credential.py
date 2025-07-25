# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['DatabricksCredentialArgs', 'DatabricksCredential']

@pulumi.input_type
class DatabricksCredentialArgs:
    def __init__(__self__, *,
                 project_id: pulumi.Input[_builtins.int],
                 token: pulumi.Input[_builtins.str],
                 adapter_type: Optional[pulumi.Input[_builtins.str]] = None,
                 catalog: Optional[pulumi.Input[_builtins.str]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 semantic_layer_credential: Optional[pulumi.Input[_builtins.bool]] = None,
                 target_name: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a DatabricksCredential resource.
        :param pulumi.Input[_builtins.int] project_id: Project ID to create the Databricks credential in
        :param pulumi.Input[_builtins.str] token: Token for Databricks user
        :param pulumi.Input[_builtins.str] adapter_type: The type of the adapter (databricks or spark). Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        :param pulumi.Input[_builtins.str] catalog: The catalog where to create models (only for the databricks adapter)
        :param pulumi.Input[_builtins.str] schema: The schema where to create models. Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        :param pulumi.Input[_builtins.bool] semantic_layer_credential: This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Databricks credential for the Semantic Layer.
        :param pulumi.Input[_builtins.str] target_name: Target name
        """
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "token", token)
        if adapter_type is not None:
            pulumi.set(__self__, "adapter_type", adapter_type)
        if catalog is not None:
            pulumi.set(__self__, "catalog", catalog)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if semantic_layer_credential is not None:
            pulumi.set(__self__, "semantic_layer_credential", semantic_layer_credential)
        if target_name is not None:
            warnings.warn("""This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.""", DeprecationWarning)
            pulumi.log.warn("""target_name is deprecated: This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.""")
        if target_name is not None:
            pulumi.set(__self__, "target_name", target_name)

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[_builtins.int]:
        """
        Project ID to create the Databricks credential in
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[_builtins.int]):
        pulumi.set(self, "project_id", value)

    @_builtins.property
    @pulumi.getter
    def token(self) -> pulumi.Input[_builtins.str]:
        """
        Token for Databricks user
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "token", value)

    @_builtins.property
    @pulumi.getter(name="adapterType")
    def adapter_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the adapter (databricks or spark). Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        """
        return pulumi.get(self, "adapter_type")

    @adapter_type.setter
    def adapter_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "adapter_type", value)

    @_builtins.property
    @pulumi.getter
    def catalog(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The catalog where to create models (only for the databricks adapter)
        """
        return pulumi.get(self, "catalog")

    @catalog.setter
    def catalog(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "catalog", value)

    @_builtins.property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The schema where to create models. Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "schema", value)

    @_builtins.property
    @pulumi.getter(name="semanticLayerCredential")
    def semantic_layer_credential(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Databricks credential for the Semantic Layer.
        """
        return pulumi.get(self, "semantic_layer_credential")

    @semantic_layer_credential.setter
    def semantic_layer_credential(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "semantic_layer_credential", value)

    @_builtins.property
    @pulumi.getter(name="targetName")
    @_utilities.deprecated("""This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.""")
    def target_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Target name
        """
        return pulumi.get(self, "target_name")

    @target_name.setter
    def target_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_name", value)


@pulumi.input_type
class _DatabricksCredentialState:
    def __init__(__self__, *,
                 adapter_type: Optional[pulumi.Input[_builtins.str]] = None,
                 catalog: Optional[pulumi.Input[_builtins.str]] = None,
                 credential_id: Optional[pulumi.Input[_builtins.int]] = None,
                 project_id: Optional[pulumi.Input[_builtins.int]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 semantic_layer_credential: Optional[pulumi.Input[_builtins.bool]] = None,
                 target_name: Optional[pulumi.Input[_builtins.str]] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering DatabricksCredential resources.
        :param pulumi.Input[_builtins.str] adapter_type: The type of the adapter (databricks or spark). Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        :param pulumi.Input[_builtins.str] catalog: The catalog where to create models (only for the databricks adapter)
        :param pulumi.Input[_builtins.int] credential_id: The system Databricks credential ID
        :param pulumi.Input[_builtins.int] project_id: Project ID to create the Databricks credential in
        :param pulumi.Input[_builtins.str] schema: The schema where to create models. Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        :param pulumi.Input[_builtins.bool] semantic_layer_credential: This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Databricks credential for the Semantic Layer.
        :param pulumi.Input[_builtins.str] target_name: Target name
        :param pulumi.Input[_builtins.str] token: Token for Databricks user
        """
        if adapter_type is not None:
            pulumi.set(__self__, "adapter_type", adapter_type)
        if catalog is not None:
            pulumi.set(__self__, "catalog", catalog)
        if credential_id is not None:
            pulumi.set(__self__, "credential_id", credential_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if semantic_layer_credential is not None:
            pulumi.set(__self__, "semantic_layer_credential", semantic_layer_credential)
        if target_name is not None:
            warnings.warn("""This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.""", DeprecationWarning)
            pulumi.log.warn("""target_name is deprecated: This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.""")
        if target_name is not None:
            pulumi.set(__self__, "target_name", target_name)
        if token is not None:
            pulumi.set(__self__, "token", token)

    @_builtins.property
    @pulumi.getter(name="adapterType")
    def adapter_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The type of the adapter (databricks or spark). Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        """
        return pulumi.get(self, "adapter_type")

    @adapter_type.setter
    def adapter_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "adapter_type", value)

    @_builtins.property
    @pulumi.getter
    def catalog(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The catalog where to create models (only for the databricks adapter)
        """
        return pulumi.get(self, "catalog")

    @catalog.setter
    def catalog(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "catalog", value)

    @_builtins.property
    @pulumi.getter(name="credentialId")
    def credential_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The system Databricks credential ID
        """
        return pulumi.get(self, "credential_id")

    @credential_id.setter
    def credential_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "credential_id", value)

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        Project ID to create the Databricks credential in
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "project_id", value)

    @_builtins.property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The schema where to create models. Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "schema", value)

    @_builtins.property
    @pulumi.getter(name="semanticLayerCredential")
    def semantic_layer_credential(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Databricks credential for the Semantic Layer.
        """
        return pulumi.get(self, "semantic_layer_credential")

    @semantic_layer_credential.setter
    def semantic_layer_credential(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "semantic_layer_credential", value)

    @_builtins.property
    @pulumi.getter(name="targetName")
    @_utilities.deprecated("""This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.""")
    def target_name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Target name
        """
        return pulumi.get(self, "target_name")

    @target_name.setter
    def target_name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "target_name", value)

    @_builtins.property
    @pulumi.getter
    def token(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Token for Databricks user
        """
        return pulumi.get(self, "token")

    @token.setter
    def token(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "token", value)


@pulumi.type_token("dbtcloud:index/databricksCredential:DatabricksCredential")
class DatabricksCredential(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 adapter_type: Optional[pulumi.Input[_builtins.str]] = None,
                 catalog: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.int]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 semantic_layer_credential: Optional[pulumi.Input[_builtins.bool]] = None,
                 target_name: Optional[pulumi.Input[_builtins.str]] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Databricks credential resource

        ## Example Usage

        ```python
        import pulumi
        import pulumi_dbtcloud as dbtcloud

        my_databricks_cred = dbtcloud.DatabricksCredential("my_databricks_cred",
            project_id=dbt_project["id"],
            token="abcdefgh",
            schema="my_schema",
            adapter_type="databricks")
        ```

        ## Import

        using  import blocks (requires Terraform >= 1.5)

        import {

          to = dbtcloud_databricks_credential.my_databricks_credential

          id = "project_id:credential_id"

        }

        import {

          to = dbtcloud_databricks_credential.my_databricks_credential

          id = "12345:6789"

        }

        using the older import command

        ```sh
        $ pulumi import dbtcloud:index/databricksCredential:DatabricksCredential my_databricks_credential "project_id:credential_id"
        ```

        ```sh
        $ pulumi import dbtcloud:index/databricksCredential:DatabricksCredential my_databricks_credential 12345:6789
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] adapter_type: The type of the adapter (databricks or spark). Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        :param pulumi.Input[_builtins.str] catalog: The catalog where to create models (only for the databricks adapter)
        :param pulumi.Input[_builtins.int] project_id: Project ID to create the Databricks credential in
        :param pulumi.Input[_builtins.str] schema: The schema where to create models. Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        :param pulumi.Input[_builtins.bool] semantic_layer_credential: This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Databricks credential for the Semantic Layer.
        :param pulumi.Input[_builtins.str] target_name: Target name
        :param pulumi.Input[_builtins.str] token: Token for Databricks user
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DatabricksCredentialArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Databricks credential resource

        ## Example Usage

        ```python
        import pulumi
        import pulumi_dbtcloud as dbtcloud

        my_databricks_cred = dbtcloud.DatabricksCredential("my_databricks_cred",
            project_id=dbt_project["id"],
            token="abcdefgh",
            schema="my_schema",
            adapter_type="databricks")
        ```

        ## Import

        using  import blocks (requires Terraform >= 1.5)

        import {

          to = dbtcloud_databricks_credential.my_databricks_credential

          id = "project_id:credential_id"

        }

        import {

          to = dbtcloud_databricks_credential.my_databricks_credential

          id = "12345:6789"

        }

        using the older import command

        ```sh
        $ pulumi import dbtcloud:index/databricksCredential:DatabricksCredential my_databricks_credential "project_id:credential_id"
        ```

        ```sh
        $ pulumi import dbtcloud:index/databricksCredential:DatabricksCredential my_databricks_credential 12345:6789
        ```

        :param str resource_name: The name of the resource.
        :param DatabricksCredentialArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DatabricksCredentialArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 adapter_type: Optional[pulumi.Input[_builtins.str]] = None,
                 catalog: Optional[pulumi.Input[_builtins.str]] = None,
                 project_id: Optional[pulumi.Input[_builtins.int]] = None,
                 schema: Optional[pulumi.Input[_builtins.str]] = None,
                 semantic_layer_credential: Optional[pulumi.Input[_builtins.bool]] = None,
                 target_name: Optional[pulumi.Input[_builtins.str]] = None,
                 token: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DatabricksCredentialArgs.__new__(DatabricksCredentialArgs)

            __props__.__dict__["adapter_type"] = adapter_type
            __props__.__dict__["catalog"] = catalog
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["schema"] = schema
            __props__.__dict__["semantic_layer_credential"] = semantic_layer_credential
            __props__.__dict__["target_name"] = target_name
            if token is None and not opts.urn:
                raise TypeError("Missing required property 'token'")
            __props__.__dict__["token"] = None if token is None else pulumi.Output.secret(token)
            __props__.__dict__["credential_id"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["token"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(DatabricksCredential, __self__).__init__(
            'dbtcloud:index/databricksCredential:DatabricksCredential',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            adapter_type: Optional[pulumi.Input[_builtins.str]] = None,
            catalog: Optional[pulumi.Input[_builtins.str]] = None,
            credential_id: Optional[pulumi.Input[_builtins.int]] = None,
            project_id: Optional[pulumi.Input[_builtins.int]] = None,
            schema: Optional[pulumi.Input[_builtins.str]] = None,
            semantic_layer_credential: Optional[pulumi.Input[_builtins.bool]] = None,
            target_name: Optional[pulumi.Input[_builtins.str]] = None,
            token: Optional[pulumi.Input[_builtins.str]] = None) -> 'DatabricksCredential':
        """
        Get an existing DatabricksCredential resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] adapter_type: The type of the adapter (databricks or spark). Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        :param pulumi.Input[_builtins.str] catalog: The catalog where to create models (only for the databricks adapter)
        :param pulumi.Input[_builtins.int] credential_id: The system Databricks credential ID
        :param pulumi.Input[_builtins.int] project_id: Project ID to create the Databricks credential in
        :param pulumi.Input[_builtins.str] schema: The schema where to create models. Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        :param pulumi.Input[_builtins.bool] semantic_layer_credential: This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Databricks credential for the Semantic Layer.
        :param pulumi.Input[_builtins.str] target_name: Target name
        :param pulumi.Input[_builtins.str] token: Token for Databricks user
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DatabricksCredentialState.__new__(_DatabricksCredentialState)

        __props__.__dict__["adapter_type"] = adapter_type
        __props__.__dict__["catalog"] = catalog
        __props__.__dict__["credential_id"] = credential_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["schema"] = schema
        __props__.__dict__["semantic_layer_credential"] = semantic_layer_credential
        __props__.__dict__["target_name"] = target_name
        __props__.__dict__["token"] = token
        return DatabricksCredential(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="adapterType")
    def adapter_type(self) -> pulumi.Output[_builtins.str]:
        """
        The type of the adapter (databricks or spark). Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        """
        return pulumi.get(self, "adapter_type")

    @_builtins.property
    @pulumi.getter
    def catalog(self) -> pulumi.Output[_builtins.str]:
        """
        The catalog where to create models (only for the databricks adapter)
        """
        return pulumi.get(self, "catalog")

    @_builtins.property
    @pulumi.getter(name="credentialId")
    def credential_id(self) -> pulumi.Output[_builtins.int]:
        """
        The system Databricks credential ID
        """
        return pulumi.get(self, "credential_id")

    @_builtins.property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[_builtins.int]:
        """
        Project ID to create the Databricks credential in
        """
        return pulumi.get(self, "project_id")

    @_builtins.property
    @pulumi.getter
    def schema(self) -> pulumi.Output[_builtins.str]:
        """
        The schema where to create models. Optional only when semantic*layer*credential is set to true; otherwise, this field is required.
        """
        return pulumi.get(self, "schema")

    @_builtins.property
    @pulumi.getter(name="semanticLayerCredential")
    def semantic_layer_credential(self) -> pulumi.Output[_builtins.bool]:
        """
        This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Databricks credential for the Semantic Layer.
        """
        return pulumi.get(self, "semantic_layer_credential")

    @_builtins.property
    @pulumi.getter(name="targetName")
    @_utilities.deprecated("""This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.""")
    def target_name(self) -> pulumi.Output[_builtins.str]:
        """
        Target name
        """
        return pulumi.get(self, "target_name")

    @_builtins.property
    @pulumi.getter
    def token(self) -> pulumi.Output[_builtins.str]:
        """
        Token for Databricks user
        """
        return pulumi.get(self, "token")

