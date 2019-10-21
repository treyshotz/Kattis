import math

count, x, y = [int(q) for q in input().split()]
biggest = math.sqrt((x*x) + (y*y))

for i in range(count):
    num = int(input())
    if(num > biggest):
        print("NE")
    else:
        print("DA")