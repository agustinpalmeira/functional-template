(ns exercise7-test
  (:require [clojure.test :refer :all]
            [exercise7 :refer :all]))

(deftest test-list-position-second
  (testing "Test: Second number of a list."
    (is (= (enesimo 2 '(4 5 6 7)) 6))))

(deftest test-map-position-zero
  (testing "Test: First number of a map."
    (is (= (enesimo 0 [:a :b :c]) :a))))

(deftest test-array-position-one
  (testing "Test: First position of an array."
    (is (= (enesimo 1 [1 2 3 4]) 2))))

;(deftest test-pair-position-two
;  (testing "Test: Second position of a pair."
;    (is (= (enesimo 2 '([1 2] [3 4] [5 6]) [5 6])))))
