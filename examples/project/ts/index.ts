import * as pulumi from "@pulumi/pulumi";
import * as dbtcloud from "@pulumi/dbtcloud";

const project =  new dbtcloud.Project("ts-project", {name: "ts-project"});

export const projectname = project.name;
