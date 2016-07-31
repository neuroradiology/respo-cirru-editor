
(ns cirru-editor.comp.container
  (:require [hsl.core :refer [hsl]]
            [respo.alias :refer [create-comp div span]]
            [cirru-editor.comp.expression :refer [comp-expression]]))

(defn render [store]
  (fn [state mutate!] (div {} (comp-expression store))))

(def comp-container (create-comp :container render))
