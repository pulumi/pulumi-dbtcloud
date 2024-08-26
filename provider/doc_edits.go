package dbtcloud

import (
	"bytes"
	"regexp"

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
)

const preProjectExample string = `data "dbtcloud_project" "test_project" {
  name = "My project name"
}`

const postProjectExample string = `data "dbtcloud_project" "another_test_project" {
  name = "My other project name"
}`

func editRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	return append(
		defaults,
		removeContent(warning, "index.md"),
		simpleReplace("appplication_id", "applicationId"),
		simpleReplace("appplication_id", "application_id"),
		simpleReplace(preProjectExample, postProjectExample),
		simpleReplace(
			"```console\ndbt_cloud_api_result",
			"```javascript\ndbt_cloud_api_result",
		),

		// remove the header which warns for legacy dbt_cloud_ prefixed resources
		reReplace("// use dbt.*\n// legacy names will be removed from 0.3 onwards\n\n", ""),
		// reReplace("(?s)run the following commands in the Google Chrome console:.*Alternatively, you can ", ""),
	)
}

func simpleReplace(from, to string) tfbridge.DocsEdit {
	fromB, toB := []byte(from), []byte(to)
	return tfbridge.DocsEdit{
		Path: "*",
		Edit: func(_ string, content []byte) ([]byte, error) {
			return bytes.ReplaceAll(content, fromB, toB), nil
		},
	}
}

func reReplace(from string, to string) tfbridge.DocsEdit {
	fromR, toB := regexp.MustCompile(from), []byte(to)
	return tfbridge.DocsEdit{
		Path: "*",
		Edit: func(_ string, content []byte) ([]byte, error) {
			return fromR.ReplaceAll(content, toB), nil
		},
	}
}

var warning = []byte("~> 🚧 IMPORTANT! 🚧  \nSince 0.3, only resources starting with `dbtcloud_xxx` are allowed. " +
	"If you use the legacy `dbt_cloud_xxx` ones, you will have to stay on 0.2.x or move to the new resources.\n" +
	"Instruction on how to do it is available in the 0.2.x docs.")

// Helper func to remove a content byte from a file
func removeContent(text []byte, path string) tfbridge.DocsEdit {
	return tfbridge.DocsEdit{
		Path: path,
		Edit: func(_ string, content []byte) ([]byte, error) {
			contentSplit := bytes.Split(content, text)
			content = bytes.Join(contentSplit, []byte(" "))
			return content, nil
		},
	}
}
