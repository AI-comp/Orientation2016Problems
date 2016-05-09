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
    y = ch.readInt()
    ch.checkRange(y, Y_MIN, Y_MAX, 'Y')

if __name__ == '__main__':
  main()
