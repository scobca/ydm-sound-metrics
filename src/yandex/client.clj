(ns yandex.client
  (:require [config :refer [config]]))

(println (->> config
              :yandex-api
              :oauth-base-url))
