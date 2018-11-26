# File I/O Part 1 Exercises (Pair)

## 1) WordSearch

### Part 1

Write a program that asks the user for a search word, and the path of a text file to search. The program searches the file for occurrences of the search word, and each time it finds the word, it displays the line number and contents of the line where the word was found. 

Use `alices_adventures_in_wonderland.txt` for test input.

The initial output should start with:
```
1) Project Gutenberg's Alice's Adventures in Wonderland, by Lewis Carroll
9) Title: Alice's Adventures in Wonderland
43) [Illustration: "Alice"]
.
.
.
```

### Part 2

Modify the program to ask the user if the search should be case sensitive.

Use `alices_adventures_in_wonderland.txt` for test input.
       
The output should change to:
```
1) Project Gutenberg's Alice's Adventures in Wonderland, by Lewis Carroll
9) Title: Alice's Adventures in Wonderland
41) ALICE'S ADVENTURES IN WONDERLAND
43) [Illustration: "Alice"]
.
.
.
```

<div style="page-break-after: always;"></div>


## 2) WordCount


Write a program that given a  path for a text file, reads the contents of the file, and displays the number of words and sentences in the file.


Hints: 
- Words are delimited by space characters.
- Sentences are terminated by either a period, an exclamation mark, or a question mark.

Use `alices_adventures_in_wonderland.txt` for test input.

The output should be:
```
Word Count: 30355
Sentence Count: 1116*
```
**Sentence Count may vary between 1116 - 1839.*
