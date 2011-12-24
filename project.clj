(defproject lein-multi "1.1.0"
  :description "A Leiningen plugin for running tasks against multiple dependency sets."
  :url "http://github.com/maravillas/lein-multi"
  :license {:name "MIT License"
            :url "http://www.opensource.org/licenses/mit-license.php"}
  :dev-dependencies [[org.clojure/clojure "1.3.0"]
                     [commons-io/commons-io "2.1"]
                     ;; A lein jar is necessary for the tests. Clojars is a bit
                     ;; oudated, though, so I'll just let you pull it in yourself.
                     ;; Sorry.

                     [leiningen "1.6.2"]
                     ])