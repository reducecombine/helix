(defproject lilactown/helix "0.1.0-SNAPSHOT"
  :description "ClojureScript optimized for modern React development."
  :url "https://github.com/lilactown/helix"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v20.html"}
  :source-paths ["src"]
  :dependencies [[cljs-bean "1.5.0"]]
  :deploy-repositories [["snapshots" {:sign-releases false :url "https://clojars.org"}]])
