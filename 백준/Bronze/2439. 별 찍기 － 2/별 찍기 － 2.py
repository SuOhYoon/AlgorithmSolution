import sys
input = sys.stdin.readline

x = int(input())
for i in range(1, x+1):
    s = ' '
    print(s * (x-i) + '*' * i)