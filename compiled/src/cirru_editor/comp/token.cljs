
(ns cirru-editor.comp.token
  (:require [respo.alias :refer [create-comp div input]]))

(defn render [token]
  (fn [state mutate!] (input {:attrs {:value token}})))

(def comp-token (create-comp :token render))
