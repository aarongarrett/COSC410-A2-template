Write a program that reads a file consisting of students' test scores in the range 0-200 (all integer values). (The first number in the file specifies the number of grades it contains. You may also assume that the number of grades will be fewer than 100.) It should then determine the number of students having scores in each of the following ranges: 0-24, 25-49, 50-74, 75-99, 100-124, 125-149, 150-174, and 175-200. Output the score ranges and the number of students.

Given the following file input:

26
76 89 150 135 200 76 12 100 150 28 178 189 167 200 175 150 87 99 129 149 176 200 87 35 157 189

The output should be the following:

[0 - 24]: 1
[25 - 49]: 2
[50 - 74]: 0
[75 - 99]: 6
[100 - 124]: 1
[125 - 149]: 3
[150 - 174]: 5
[175 - 200]: 8

To complete this assignment, you must implement the functions as specified in App.java.