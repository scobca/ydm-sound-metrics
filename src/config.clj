(ns config
  (:require [clojure.edn :as edn])
  (:import (java.io FileNotFoundException)))

(defn load-config []
  (try
    (edn/read-string (slurp "resources/config.sensitive.edn"))
    (catch FileNotFoundException _
      (throw (ex-info "FATAL: resources/config.sensitive.edn not found! Application cannot start." {})))))

(defonce config (load-config))