(ns oinque.core
  (:use
   [twitter oauth callbacks]
   [twitter.callbacks handlers]
   [twitter.api restful])
  (:import
   (twitter.callbacks.protocols SyncSingleCallback)))
