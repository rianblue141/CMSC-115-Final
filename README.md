# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

## Student Name
Rian Blauvelt

## GitHub Repository URL
Paste your GitHub repository URL here.

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
-

## What was the issue in the code?
-

## What change did you make to fix it?
-

## How did the tests help guide your fix?
-

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
-

## What was the issue in the code?
-

## What change did you make to fix it?
-

## How did the tests help guide your fix?
-

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
