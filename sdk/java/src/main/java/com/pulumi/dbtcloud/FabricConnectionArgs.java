// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FabricConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FabricConnectionArgs Empty = new FabricConnectionArgs();

    /**
     * The database to connect to for this connection.
     * 
     */
    @Import(name="database", required=true)
    private Output<String> database;

    /**
     * @return The database to connect to for this connection.
     * 
     */
    public Output<String> database() {
        return this.database;
    }

    /**
     * The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
     * 
     */
    @Import(name="loginTimeout")
    private @Nullable Output<Integer> loginTimeout;

    /**
     * @return The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
     * 
     */
    public Optional<Output<Integer>> loginTimeout() {
        return Optional.ofNullable(this.loginTimeout);
    }

    /**
     * Connection name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Connection name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The port to connect to for this connection.
     * 
     */
    @Import(name="port", required=true)
    private Output<Integer> port;

    /**
     * @return The port to connect to for this connection.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }

    /**
     * Project ID to create the connection in
     * 
     */
    @Import(name="projectId", required=true)
    private Output<Integer> projectId;

    /**
     * @return Project ID to create the connection in
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }

    /**
     * The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
     * 
     */
    @Import(name="queryTimeout")
    private @Nullable Output<Integer> queryTimeout;

    /**
     * @return The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
     * 
     */
    public Optional<Output<Integer>> queryTimeout() {
        return Optional.ofNullable(this.queryTimeout);
    }

    /**
     * The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
     * 
     */
    @Import(name="retries")
    private @Nullable Output<Integer> retries;

    /**
     * @return The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
     * 
     */
    public Optional<Output<Integer>> retries() {
        return Optional.ofNullable(this.retries);
    }

    /**
     * The server hostname.
     * 
     */
    @Import(name="server", required=true)
    private Output<String> server;

    /**
     * @return The server hostname.
     * 
     */
    public Output<String> server() {
        return this.server;
    }

    private FabricConnectionArgs() {}

    private FabricConnectionArgs(FabricConnectionArgs $) {
        this.database = $.database;
        this.loginTimeout = $.loginTimeout;
        this.name = $.name;
        this.port = $.port;
        this.projectId = $.projectId;
        this.queryTimeout = $.queryTimeout;
        this.retries = $.retries;
        this.server = $.server;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FabricConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FabricConnectionArgs $;

        public Builder() {
            $ = new FabricConnectionArgs();
        }

        public Builder(FabricConnectionArgs defaults) {
            $ = new FabricConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database The database to connect to for this connection.
         * 
         * @return builder
         * 
         */
        public Builder database(Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database The database to connect to for this connection.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param loginTimeout The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
         * 
         * @return builder
         * 
         */
        public Builder loginTimeout(@Nullable Output<Integer> loginTimeout) {
            $.loginTimeout = loginTimeout;
            return this;
        }

        /**
         * @param loginTimeout The number of seconds used to establish a connection before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
         * 
         * @return builder
         * 
         */
        public Builder loginTimeout(Integer loginTimeout) {
            return loginTimeout(Output.of(loginTimeout));
        }

        /**
         * @param name Connection name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Connection name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param port The port to connect to for this connection.
         * 
         * @return builder
         * 
         */
        public Builder port(Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port to connect to for this connection.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param projectId Project ID to create the connection in
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID to create the connection in
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param queryTimeout The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(@Nullable Output<Integer> queryTimeout) {
            $.queryTimeout = queryTimeout;
            return this;
        }

        /**
         * @param queryTimeout The number of seconds used to wait for a query before failing. Defaults to 0, which means that the timeout is disabled or uses the default system settings.
         * 
         * @return builder
         * 
         */
        public Builder queryTimeout(Integer queryTimeout) {
            return queryTimeout(Output.of(queryTimeout));
        }

        /**
         * @param retries The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
         * 
         * @return builder
         * 
         */
        public Builder retries(@Nullable Output<Integer> retries) {
            $.retries = retries;
            return this;
        }

        /**
         * @param retries The number of automatic times to retry a query before failing. Defaults to 1. Queries with syntax errors will not be retried. This setting can be used to overcome intermittent network issues.
         * 
         * @return builder
         * 
         */
        public Builder retries(Integer retries) {
            return retries(Output.of(retries));
        }

        /**
         * @param server The server hostname.
         * 
         * @return builder
         * 
         */
        public Builder server(Output<String> server) {
            $.server = server;
            return this;
        }

        /**
         * @param server The server hostname.
         * 
         * @return builder
         * 
         */
        public Builder server(String server) {
            return server(Output.of(server));
        }

        public FabricConnectionArgs build() {
            if ($.database == null) {
                throw new MissingRequiredPropertyException("FabricConnectionArgs", "database");
            }
            if ($.port == null) {
                throw new MissingRequiredPropertyException("FabricConnectionArgs", "port");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("FabricConnectionArgs", "projectId");
            }
            if ($.server == null) {
                throw new MissingRequiredPropertyException("FabricConnectionArgs", "server");
            }
            return $;
        }
    }

}
