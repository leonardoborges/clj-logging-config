;; clj-logging-config - Logging configuration for Clojure.

;; by Malcolm Sparks

;; Copyright (c) Malcolm Sparks. All rights reserved.

;; The use and distribution terms for this software are covered by the Eclipse
;; Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which can
;; be found in the file epl-v10.html at the root of this distribution.  By using
;; this software in any fashion, you are agreeing to be bound by the terms of
;; this license.  You must not remove this notice, or any other, from this
;; software.

(ns examples.jul-example
  (:use clojure.tools.logging
        clojure.contrib.pprint
        clj-logging-config.jul))

;; Try these examples in a REPL.
;; By default messages will go to standard out, not the REPL - so check your
;; console.

(set-logger!)
(warn "Just a plain logging message, you should see the level at the beginning")
(set-logger-level! :info)

(comment
  (set-logger!)
  (info "Just a plain logging message, you should see the level at the beginning")
  (info "Just a plain logging message, you should see the level at the beginning")

  (set-logger-level! :info)
  (info "An info message")

  (set-logger-level! :warn)
  (info "You won't see me")
  (warn "But you'll see me!")

  (set-logger-level! :debug)
  (debug "Now you can see a debug message")

;; If you get stuck you can reset the logging system with this :-
  (reset-logging!)

;; If you want to see what is going on, try setting the clj-logging-config's own
;; internal logging to debug :-
  (set-internal-logging-level! :debug)

;; Sometimes printing out the current configuration can help diagnose problems :-
  (pprint (get-logging-config))

)
