(ns yandex.client
  (:require [config :refer [sensitive-config]]))

(println (->> sensitive-config
              :yandex-api
              :oauth-base-url))
