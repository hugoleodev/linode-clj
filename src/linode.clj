(ns linode
  (:require [clj-http.client :as client]
            [cheshire.core :as json]))

(def ^:private endpoint "https://api.linode.com/v4/")

(defn linode-types []
  (-> (str endpoint "linode/types") client/get :body json/parse-string))