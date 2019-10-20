#!/bin/python3

import math
import os
import random
import re
import sys

'''
https://www.hackerrank.com/challenges/jumping-on-the-clouds
'''

# Complete the jumpingOnClouds function below.
def jumpingOnClouds(c):
    jumps=0
    index=0
    for i in range(len(c)):
        if index > i:
            continue
        if i+2 < len(c) and c[i+2] == 0:
            index+=1
        if i<(len(c)-1):
            jumps+=1
            index+=1        

    return jumps

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    c = list(map(int, input().rstrip().split()))

    result = jumpingOnClouds(c)

    fptr.write(str(result) + '\n')

    fptr.close()
