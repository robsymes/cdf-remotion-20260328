(ns my-video.core
  (:require ["remotion" :refer [registerRoot Composition AbsoluteFill]]
            [reagent.core :as r]))

(defn my-scene []
  [:> AbsoluteFill
   {:style {:background-color "white" ; Ensure it's not transparent
            :display "flex"
            :justify-content "center"
            :align-items "center"
            :font-size "100px"
            :color "#ffaa33"}}
   [:div
    {:style
     {:color "#ffffff"
      :background-color "#ffff00"
      }}
    "Hello Rob!!"]])

(defn root []
  [:> Composition
   {:id "MyComp"
    :component (r/reactify-component my-scene)
    :durationInFrames 120
    :fps 30
    :width 1920
    :height 1080}])

(defn ^:export init []
  (js/console.log "HERE")
  (registerRoot (r/reactify-component root)))

