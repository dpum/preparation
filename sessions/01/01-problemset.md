# DPUM - Session 01 - Problem Set

## 1. Java IO
--------------------------------

#### 1.A. - CAT
* Write an implemantation of the basic functionality of the UNIX `cat` command.
* Relevant: https://docs.oracle.com/javase/tutorial/essential/exceptions/QandE/answers.html
--------------------------------

#### 1.B. - Reading Records I
* Building on top of the last exercise, now we know that each of the lines represent a record of an User.
* Each record is printed in the following format; `[id];[name];[age];[location]`
* Write a function that given the file writes to STDOUT each of the records in the following format: `[name]([age]) from [location] - (user no: [id])`
--------------------------------

#### 1.C. - Reading Records II
* Building on top of the last exercise, now we know that the file contains several sets of records.
* Each of the sets starts with a line that indicates the number of records and whether they are being stored or removed. Example:
```
2 ADDED
222;Bruno;32;Braga
111;Alba;23;Porto
1 REMOVED
222
3 ADDED
333;Charles;15;Porto
444;Diana;16;Braga
555;Elena;27;Braga
```
* Write a function that given the file writes to STDOUT each of the records that should remaind in the following format: `[name]([age]) from [location] - (user no: [id])`

## 2. Sorting
--------------------------------

#### 2.A. - Sorting a Java List with a custom object
* Your are given an implementation of a POJO User (contains id, name, age, location).
* The goal is to write a function that given a Collection of such objects returns it sorted by `age` and `location`.
--------------------------------

#### 2.B. - Valid Anagram (Leetcode 242)
* Given two strings s and t , write a function to determine if t is an anagram of s.

```
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
```
```
Example 2:

Input: s = "rat", t = "car"
Output: false
```
--------------------------------

#### 2.C. - Largest Perimeter Triangle (Leetcode 976)
* Given an array A of positive lengths, return the largest perimeter of a triangle with non-zero area, formed from 3 of these lengths.
* If it is impossible to form any triangle of non-zero area, return 0.

## 3. Hashing
--------------------------------

#### 3.A. - Isomorphic Strings (Leetcode 205)

Given two strings *s* and *T*, determine if they are isomorphic.

Two strings are isomorphic if the characters in *s* can be replaced to get *t*.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

```
Example 1:

Input: s = "egg", t = "add"
Output: true
```
```
Example 2:

Input: s = "foo", t = "bar"
Output: false
```
```
Example 3:

Input: s = "paper", t = "title"
Output: true
```

Note: You may assume both *s* and *t* have the same length.

--------------------------------

#### 3.B - Happy Number (Leetcode 202)

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 
```
Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
```

#### 3.C. - Single Number (Leetcode 136)
Given a *non-empty array of integers*, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:
```
Input: [2,2,1]
Output: 1
```
Example 2:
```
Input: [4,1,2,1,2]
Output: 4
```

## 4. Binary Search
--------------------------------

#### 4.A. - Search in a dictionary (TADM)
* Given an array of words in a language dictionary, implement a function that searches for a word.

--------------------------------

#### 4.B - SQRT(x) (Leetcode 69)
Implement int sqrt(int x).

Compute and return the square root of x, where x is guaranteed to be a non-negative integer.

Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.

Example 1:
```
Input: 4
Output: 2
Example 2:
```
Example 2:
```
Input: 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since 
             the decimal part is truncated, 2 is returned.
```
