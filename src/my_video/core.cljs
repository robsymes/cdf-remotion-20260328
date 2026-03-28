(ns my-video.core
  (:require ["remotion" :refer [registerRoot Composition AbsoluteFill]]
            [reagent.core :as r]))

(defn my-scene []
  [:> AbsoluteFill
   [:div "Hello from CLJS!"]])

(defn root []
  [:> Composition
   {:id "MyComp"
    :component (r/reactify-component my-scene)
    :durationInFrames 120
    :fps 30
    :width 1920
    :height 1080}])

(defn ^:export init []
  (registerRoot (r/reactify-component root)))

