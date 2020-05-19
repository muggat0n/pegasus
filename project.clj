(defproject pegasus "0.7.2"
  :description "A scaleable production-ready crawler in clojure"
  :url "http://github.com/shriphani/pegasus"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[clj-http "3.10.1"]
                 [clj-named-leveldb "0.1.0"]
                 [clj-robots "0.6.0"]
                 [clj-time "0.15.2"]
                 [com.taoensso/timbre "4.10.0"]
                 [enlive "1.1.6"]
                 [factual/clj-leveldb "0.1.1"]
                 [fort-knox "0.4.0"]
                 [com.github.kyleburton/clj-xpath "1.4.11"]
                 [factual/durable-queue "0.1.6"]
                 [me.raynes/fs "1.4.6"]
                 [org.bovinegenius/exploding-fish "0.3.6"]
                 [org.clojure/clojure "1.10.1"]
                 [org.clojure/core.async "1.2.603"]
                 [org.clojure/tools.namespace "1.0.0"]
                 [prismatic/schema "1.1.12"]
                 [slingshot "0.12.2"]]
  :plugins [[lein-ancient "0.6.15"]])