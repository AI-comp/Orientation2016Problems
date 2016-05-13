#!/usr/bin/python

import random
from constants import *

def generateFile(index):
  filename = '50-random%02d.in' % index
  with open(filename, 'w') as f:
    generateTestCase(f, random.randint(N_MIN, N_MAX))
    print >>f, 0, 0

def generateTestCase(f, n):
  print >>f, n
  for _ in xrange(n):
    print >>f, random.randint(Y_MIN, Y_MAX)

def main():
  for index in xrange(10):
    generateFile(index)

if __name__ == '__main__':
  main()
