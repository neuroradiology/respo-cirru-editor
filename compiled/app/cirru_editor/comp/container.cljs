
(ns cirru-editor.comp.container
  (:require [hsl.core :refer [hsl]]
            [respo.alias :refer [create-comp div span]]
            [cirru-editor.comp.editor :refer [comp-editor]]))

(defn render [store] (fn [state mutate!] (div {} (comp-editor store))))

(def comp-container (create-comp :container render))