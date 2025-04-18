# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
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

__all__ = ['FabricConnectionArgs', 'FabricConnection']

@pulumi.input_type
class FabricConnectionArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[builtins.str],
                 port: pulumi.Input[builtins.int],
                 project_id: pulumi.Input[builtins.int],
                 server: pulumi.Input[builtins.str],
                 login_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 query_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 retries: Optional[pulumi.Input[builtins.int]] = None):
        """
        The set of arguments for constructing a FabricConnection resource.
        :param pulumi.Input[builtins.str] database: The database to connect to for this connection.
        :param pulumi.Input[builtins.int] port: The port to connect to for this connection.
        :param pulumi.Input[builtins.int] project_id: Project ID to create the connection in
        :param pulumi.Input[builtins.str] server: The server hostname.
        :param pulumi.Input[builtins.int] login_timeout: The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        :param pulumi.Input[builtins.str] name: Connection name
        :param pulumi.Input[builtins.int] query_timeout: The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        :param pulumi.Input[builtins.int] retries: The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "port", port)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "server", server)
        if login_timeout is not None:
            pulumi.set(__self__, "login_timeout", login_timeout)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if query_timeout is not None:
            pulumi.set(__self__, "query_timeout", query_timeout)
        if retries is not None:
            pulumi.set(__self__, "retries", retries)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[builtins.str]:
        """
        The database to connect to for this connection.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter
    def port(self) -> pulumi.Input[builtins.int]:
        """
        The port to connect to for this connection.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[builtins.int]:
        """
        Project ID to create the connection in
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[builtins.int]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def server(self) -> pulumi.Input[builtins.str]:
        """
        The server hostname.
        """
        return pulumi.get(self, "server")

    @server.setter
    def server(self, value: pulumi.Input[builtins.str]):
        pulumi.set(self, "server", value)

    @property
    @pulumi.getter(name="loginTimeout")
    def login_timeout(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        """
        return pulumi.get(self, "login_timeout")

    @login_timeout.setter
    def login_timeout(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "login_timeout", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Connection name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="queryTimeout")
    def query_timeout(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        """
        return pulumi.get(self, "query_timeout")

    @query_timeout.setter
    def query_timeout(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "query_timeout", value)

    @property
    @pulumi.getter
    def retries(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
        """
        return pulumi.get(self, "retries")

    @retries.setter
    def retries(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "retries", value)


@pulumi.input_type
class _FabricConnectionState:
    def __init__(__self__, *,
                 adapter_id: Optional[pulumi.Input[builtins.int]] = None,
                 connection_id: Optional[pulumi.Input[builtins.int]] = None,
                 database: Optional[pulumi.Input[builtins.str]] = None,
                 login_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 port: Optional[pulumi.Input[builtins.int]] = None,
                 project_id: Optional[pulumi.Input[builtins.int]] = None,
                 query_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 retries: Optional[pulumi.Input[builtins.int]] = None,
                 server: Optional[pulumi.Input[builtins.str]] = None):
        """
        Input properties used for looking up and filtering FabricConnection resources.
        :param pulumi.Input[builtins.int] adapter_id: Adapter id created for the Fabric connection
        :param pulumi.Input[builtins.int] connection_id: Connection Identifier
        :param pulumi.Input[builtins.str] database: The database to connect to for this connection.
        :param pulumi.Input[builtins.int] login_timeout: The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        :param pulumi.Input[builtins.str] name: Connection name
        :param pulumi.Input[builtins.int] port: The port to connect to for this connection.
        :param pulumi.Input[builtins.int] project_id: Project ID to create the connection in
        :param pulumi.Input[builtins.int] query_timeout: The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        :param pulumi.Input[builtins.int] retries: The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
        :param pulumi.Input[builtins.str] server: The server hostname.
        """
        if adapter_id is not None:
            pulumi.set(__self__, "adapter_id", adapter_id)
        if connection_id is not None:
            pulumi.set(__self__, "connection_id", connection_id)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if login_timeout is not None:
            pulumi.set(__self__, "login_timeout", login_timeout)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if query_timeout is not None:
            pulumi.set(__self__, "query_timeout", query_timeout)
        if retries is not None:
            pulumi.set(__self__, "retries", retries)
        if server is not None:
            pulumi.set(__self__, "server", server)

    @property
    @pulumi.getter(name="adapterId")
    def adapter_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Adapter id created for the Fabric connection
        """
        return pulumi.get(self, "adapter_id")

    @adapter_id.setter
    def adapter_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "adapter_id", value)

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Connection Identifier
        """
        return pulumi.get(self, "connection_id")

    @connection_id.setter
    def connection_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "connection_id", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The database to connect to for this connection.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="loginTimeout")
    def login_timeout(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        """
        return pulumi.get(self, "login_timeout")

    @login_timeout.setter
    def login_timeout(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "login_timeout", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        Connection name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The port to connect to for this connection.
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "port", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        Project ID to create the connection in
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="queryTimeout")
    def query_timeout(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        """
        return pulumi.get(self, "query_timeout")

    @query_timeout.setter
    def query_timeout(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "query_timeout", value)

    @property
    @pulumi.getter
    def retries(self) -> Optional[pulumi.Input[builtins.int]]:
        """
        The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
        """
        return pulumi.get(self, "retries")

    @retries.setter
    def retries(self, value: Optional[pulumi.Input[builtins.int]]):
        pulumi.set(self, "retries", value)

    @property
    @pulumi.getter
    def server(self) -> Optional[pulumi.Input[builtins.str]]:
        """
        The server hostname.
        """
        return pulumi.get(self, "server")

    @server.setter
    def server(self, value: Optional[pulumi.Input[builtins.str]]):
        pulumi.set(self, "server", value)


class FabricConnection(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database: Optional[pulumi.Input[builtins.str]] = None,
                 login_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 port: Optional[pulumi.Input[builtins.int]] = None,
                 project_id: Optional[pulumi.Input[builtins.int]] = None,
                 query_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 retries: Optional[pulumi.Input[builtins.int]] = None,
                 server: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        """
        Resource to create a MS Fabric connection in dbt Cloud.

        > This resource is deprecated and is going to be removed in the next major release, please use the `GlobalConnection` resource instead to create any DW connection.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_dbtcloud as dbtcloud

        my_fabric_connection = dbtcloud.FabricConnection("my_fabric_connection",
            project_id=dbt_project["id"],
            name="Connection Name",
            server="my-server",
            database="my-database",
            port=1234,
            login_timeout=30)
        ```

        ## Import

        using  import blocks (requires Terraform >= 1.5)

        import {

          to = dbtcloud_fabric_connection.my_connection

          id = "project_id:connection_id"

        }

        import {

          to = dbtcloud_fabric_connection.my_connection

          id = "12345:6789"

        }

        using the older import command

        ```sh
        $ pulumi import dbtcloud:index/fabricConnection:FabricConnection my_connection "project_id:connection_id"
        ```

        ```sh
        $ pulumi import dbtcloud:index/fabricConnection:FabricConnection my_connection 12345:6789
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.str] database: The database to connect to for this connection.
        :param pulumi.Input[builtins.int] login_timeout: The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        :param pulumi.Input[builtins.str] name: Connection name
        :param pulumi.Input[builtins.int] port: The port to connect to for this connection.
        :param pulumi.Input[builtins.int] project_id: Project ID to create the connection in
        :param pulumi.Input[builtins.int] query_timeout: The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        :param pulumi.Input[builtins.int] retries: The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
        :param pulumi.Input[builtins.str] server: The server hostname.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FabricConnectionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource to create a MS Fabric connection in dbt Cloud.

        > This resource is deprecated and is going to be removed in the next major release, please use the `GlobalConnection` resource instead to create any DW connection.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_dbtcloud as dbtcloud

        my_fabric_connection = dbtcloud.FabricConnection("my_fabric_connection",
            project_id=dbt_project["id"],
            name="Connection Name",
            server="my-server",
            database="my-database",
            port=1234,
            login_timeout=30)
        ```

        ## Import

        using  import blocks (requires Terraform >= 1.5)

        import {

          to = dbtcloud_fabric_connection.my_connection

          id = "project_id:connection_id"

        }

        import {

          to = dbtcloud_fabric_connection.my_connection

          id = "12345:6789"

        }

        using the older import command

        ```sh
        $ pulumi import dbtcloud:index/fabricConnection:FabricConnection my_connection "project_id:connection_id"
        ```

        ```sh
        $ pulumi import dbtcloud:index/fabricConnection:FabricConnection my_connection 12345:6789
        ```

        :param str resource_name: The name of the resource.
        :param FabricConnectionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FabricConnectionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 database: Optional[pulumi.Input[builtins.str]] = None,
                 login_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 name: Optional[pulumi.Input[builtins.str]] = None,
                 port: Optional[pulumi.Input[builtins.int]] = None,
                 project_id: Optional[pulumi.Input[builtins.int]] = None,
                 query_timeout: Optional[pulumi.Input[builtins.int]] = None,
                 retries: Optional[pulumi.Input[builtins.int]] = None,
                 server: Optional[pulumi.Input[builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FabricConnectionArgs.__new__(FabricConnectionArgs)

            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            __props__.__dict__["login_timeout"] = login_timeout
            __props__.__dict__["name"] = name
            if port is None and not opts.urn:
                raise TypeError("Missing required property 'port'")
            __props__.__dict__["port"] = port
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["query_timeout"] = query_timeout
            __props__.__dict__["retries"] = retries
            if server is None and not opts.urn:
                raise TypeError("Missing required property 'server'")
            __props__.__dict__["server"] = server
            __props__.__dict__["adapter_id"] = None
            __props__.__dict__["connection_id"] = None
        super(FabricConnection, __self__).__init__(
            'dbtcloud:index/fabricConnection:FabricConnection',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            adapter_id: Optional[pulumi.Input[builtins.int]] = None,
            connection_id: Optional[pulumi.Input[builtins.int]] = None,
            database: Optional[pulumi.Input[builtins.str]] = None,
            login_timeout: Optional[pulumi.Input[builtins.int]] = None,
            name: Optional[pulumi.Input[builtins.str]] = None,
            port: Optional[pulumi.Input[builtins.int]] = None,
            project_id: Optional[pulumi.Input[builtins.int]] = None,
            query_timeout: Optional[pulumi.Input[builtins.int]] = None,
            retries: Optional[pulumi.Input[builtins.int]] = None,
            server: Optional[pulumi.Input[builtins.str]] = None) -> 'FabricConnection':
        """
        Get an existing FabricConnection resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[builtins.int] adapter_id: Adapter id created for the Fabric connection
        :param pulumi.Input[builtins.int] connection_id: Connection Identifier
        :param pulumi.Input[builtins.str] database: The database to connect to for this connection.
        :param pulumi.Input[builtins.int] login_timeout: The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        :param pulumi.Input[builtins.str] name: Connection name
        :param pulumi.Input[builtins.int] port: The port to connect to for this connection.
        :param pulumi.Input[builtins.int] project_id: Project ID to create the connection in
        :param pulumi.Input[builtins.int] query_timeout: The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        :param pulumi.Input[builtins.int] retries: The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
        :param pulumi.Input[builtins.str] server: The server hostname.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FabricConnectionState.__new__(_FabricConnectionState)

        __props__.__dict__["adapter_id"] = adapter_id
        __props__.__dict__["connection_id"] = connection_id
        __props__.__dict__["database"] = database
        __props__.__dict__["login_timeout"] = login_timeout
        __props__.__dict__["name"] = name
        __props__.__dict__["port"] = port
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["query_timeout"] = query_timeout
        __props__.__dict__["retries"] = retries
        __props__.__dict__["server"] = server
        return FabricConnection(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="adapterId")
    def adapter_id(self) -> pulumi.Output[builtins.int]:
        """
        Adapter id created for the Fabric connection
        """
        return pulumi.get(self, "adapter_id")

    @property
    @pulumi.getter(name="connectionId")
    def connection_id(self) -> pulumi.Output[builtins.int]:
        """
        Connection Identifier
        """
        return pulumi.get(self, "connection_id")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[builtins.str]:
        """
        The database to connect to for this connection.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="loginTimeout")
    def login_timeout(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        """
        return pulumi.get(self, "login_timeout")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[builtins.str]:
        """
        Connection name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def port(self) -> pulumi.Output[builtins.int]:
        """
        The port to connect to for this connection.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[builtins.int]:
        """
        Project ID to create the connection in
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="queryTimeout")
    def query_timeout(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
        """
        return pulumi.get(self, "query_timeout")

    @property
    @pulumi.getter
    def retries(self) -> pulumi.Output[Optional[builtins.int]]:
        """
        The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
        """
        return pulumi.get(self, "retries")

    @property
    @pulumi.getter
    def server(self) -> pulumi.Output[builtins.str]:
        """
        The server hostname.
        """
        return pulumi.get(self, "server")

