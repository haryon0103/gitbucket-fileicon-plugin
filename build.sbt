name := "gitbucket-fileicon-plugin"
organization := "io.github.gitbucket"
version := "1.0.0"
scalaVersion := "2.12.8"
gitbucketVersion := "4.31.0"

enablePlugins(FrontendPlugin)
nodePackageManager := sbtfrontend.NodePackageManager.Yarn