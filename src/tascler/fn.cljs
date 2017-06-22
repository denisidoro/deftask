(ns tascler.fn
  (:require [tascler.tasker :as tasker]
            [tascler.http :as http]))

(defn myreq []
  (let [r (http/GET "https://api.icndb.com/jokes/random?firstName=John&amp;lastName=Doe")]
    (js/flash (str r))))
