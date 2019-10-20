#!/bin/python3
# https://www.hackerrank.com/challenges/repeated-string

import math
import os
import random
import re
import sys

# Complete the repeatedString function below.
def repeatedString(s, n):
    count = 0
    diff = n%len(s)
    for i in s:
        if i=="a":
            count+=1
    count = count* int(math.floor(n/len(s)))
    if diff > 0:
        for i in range(0, diff):
            if s[i]=="a":
                count+=1
    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    n = int(input())

    result = repeatedString(s, n)

    fptr.write(str(result) + '\n')

    fptr.close()
