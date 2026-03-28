(ns my-video.core
  (:require ["remotion" :refer [registerRoot Composition]]
            [reagent.core :as r]))

(defn my-scene []
  [:div "Hello from CLJS!"])

(defn root []
  [:> Composition
   {:id "MyVideo"
    :component (r/reactify-component my-scene)
    :durationInFrames 120
    :fps 30
    :width 1920
    :height 1080}])

(defn ^:export init []
  (registerRoot (r/reactify-component root)))

