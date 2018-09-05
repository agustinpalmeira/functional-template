(ns exercise3-test
  (:require [clojure.test :refer :all]
            [exercise3 :refer :all]))

(def mapa {:a nil :b 1 :c 2})

; (deftest test-mapa-key-nula-nil
;   (testing "Tests when the key value is nil should return true."
;     (is (= ((mapa-key-nula mapa :a) true)))
;   )
; )
;
; (deftest test-mapa-key-nula-one
;   (testing "Tests when the key value is nil should return true."
;     (is (= ((mapa-key-nula mapa :b) false)))
;   )
; )
;
; (deftest test-mapa-key-nula-two
;   (testing "Tests when the key value is nil should return true."
;     (is (= ((mapa-key-nula mapa :c) false)))
;   )
; )

    "(mapa-key-nula mapa :a)"
    "(mapa-key-nula mapa :b)"
    "(mapa-key-nula mapa :c)"
