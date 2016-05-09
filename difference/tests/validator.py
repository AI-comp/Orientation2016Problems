#!/usr/bin/python2

import os
import sys
from constants import *
sys.path.append(os.path.dirname(os.path.abspath(__file__)) + '/../../lib')
from checker import Checker

def main():
  ch = Checker()

  n = ch.readInt()
  ch.checkRange(n, N_MIN, N_MAX, 'N')
  for _ in xrange(n):
    numbers = ch.readInts(3)
    for i in xrange(len(numbers)):
      ch.checkRange(numbers[i], A_MIN, A_MAX, chr(ord('A') + i))

if __name__ == '__main__':
  main()
