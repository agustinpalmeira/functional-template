(ns exercise6-test
  (:require [clojure.test :refer :all]
            [exercise6 :refer :all]))

(deftest test-array
  (testing "Test: Last number of a vector."
    (is (= (ultimo [1 2 3 4 5]) 5))))

(deftest test-list
  (testing "Test: Last number of a list."
    (is (= (ultimo '(5 4 3)) 3))))

(deftest test-chars-array
  (testing "Test: Last number of a list of chars."
    (is (= (ultimo ["b" "c" "d"]) "d"))))

    ;Tests
    ;(ultimo [1 2 3 4 5]) => 5
    ;(ultimo '(5 4 3)) => 3
    ;(ultimo ["b" "c" "d"]) => "d"
