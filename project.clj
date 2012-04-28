(defproject org.clojars.lelayf/dfs-datastores-cascading "1.1.5-SNAPSHOT"
  :java-source-path "src/jvm"
  :source-path "src/clj"
  :java-test-path "test/jvm"
  :javac-options {:debug "true" :fork "true"}
  :javac-source-path [["src"] ["test"]]
  :junit [["classes"]]
  :junit-options {:fork "off" :haltonfailure "on"}
  :repositories {"conjars" "http://conjars.org/repo"}
  :dependencies [[org.clojars.lelayf/dfs-datastores "1.1.3-SNAPSHOT"]
                 [cascading/cascading-hadoop "2.0.0-wip-281"
                  :exclusions [org.codehaus.janino/janino
                               org.apache.hadoop/hadoop-core]]]
  :dev-dependencies [[org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [lein-javac "1.3.0"]
                     [lein-junit "1.0.0"]
                     [junit "4.7"]])
