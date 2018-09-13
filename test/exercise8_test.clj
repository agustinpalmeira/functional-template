(ns exercise8-test
  (:require [clojure.test :refer :all]
            [exercise8 :refer :all]))

;(deftest test-third-position
;  (testing "Test: Third position."
;    (is (= (separador 3 [1 2 3 4 5 6]) [(1 2 3) (4 5 6)]))))

;(deftest test-separate-first-position
;  (testing "Test: First position."
;    (is (= (separador 1 [:a :b :c :d]) [(:a) (:b :c :d)]))))

;(deftest test-separate-second-position
;  (testing "Test: Second position."
;    (is (= (separador 2 [[1 2] [3 4] [5 6]]) [([1 2] [3 4]) ([5 6])]))))


    ;Tests
    ;(separador 3 [1 2 3 4 5 6] => [(1 2 3) (4 5 6)]
    ;(separador 1 [:a :b :c :d] => [(:a) (:b :c :d)]
    ;(separador 2 [[1 2] [3 4] [5 6]] => [([1 2] [3 4]) ([5 6])]
