# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

## Student Name
Rian Blauvelt

## GitHub Repository URL
https://github.com/rianblue141/CMSC-115-Final

---

# Commit 1: Initial Commit

## What did you include in this commit?
- The original BuggyProgram.java containing the three buggy methods.
- Task1Test.java, Task2Test.java, and Task3Test.java.
- The original README.md file.

## What was the purpose of this commit?
- The purpose was to establish a baseline version of the project before making any changes.

---

# Commit 2: Task 1 (getGrade)

## Which tests in Task1Test were failing before your fix?
- The testGrades and testEdges tests had failures because the score boundaries were incorrect.

## What was the issue in the code?
- The original code used `score > 90` and `score > 80`, which caused scores of exactly 90 and 80 to be placed in the wrong categories.

## What change did you make to fix it?
- I changed the conditions to use `score >= 90` for "Exceeds" and `score >= 80` for "Meets."

## How did the tests help guide your fix?
- The tests included boundary values of 90, 80, and 79. These values showed that 90 should be "Exceeds," 80 should be "Meets," and 79 should be "Does Not Meet."

---

# Commit 3: Task 2 (sumEvenNumbers)

## Which tests in Task2Test were failing before your fix?
- The testSumEvenNumbers, testOddNumbers, and testEmpty tests were affected by problems in the method.

## What was the issue in the code?
- The sum was initialized to 1 instead of 0, and the loop used `i <= values.length`, which could attempt to access an array element beyond the last valid index.

## What change did you make to fix it?
- I changed the initial value of sum to 0 and changed the loop condition from `i <= values.length` to `i < values.length`.

## How did the tests help guide your fix?
- The tests showed that only even numbers should be added, an array containing only odd numbers should return 0, and an empty array should also return 0.

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
- The testSumRangeReverseOrder test failed. sumRange(5, 1) returned 0 instead of 15. The normal order and single value tests already passed.

## What was the issue in the code?
- The loop only counted upward from start to end. When start was greater than end, the condition `i <= end` was never true, so the method returned 0.

## What change did you make to fix it?
- I added a second loop for the reverse case. If start is less than or equal to end, the method counts upward and includes both ends. If start is greater than end, it counts downward from start to end and includes both ends.

## How did the tests help guide your fix?
- testSumRangeNormalOrder expected 6 for the range 1 to 3, which is 1 + 2 + 3. testSumRangeReverseOrder expected 15 for 5 to 1, which is 5 + 4 + 3 + 2 + 1. testSumRangeSingleValue expected 7 when both arguments are 7. Those results showed that both endpoints are included and that the method has to work when the first number is larger than the second.

---

# Overall Reflection

## Which task was the easiest to fix? Why?
-

## Which task was the most difficult? Why?
-

## How did Git help you track your progress through the debugging process?
-

## Why is it important to make small, frequent commits when debugging code?
-

## What did you learn about using JUnit tests to guide debugging?
-

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?
-

## Why is it useful to document your work after completing a programming task?
-
