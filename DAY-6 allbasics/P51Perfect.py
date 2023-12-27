#sum of its factors = that number
n=int(input())
s=0
for i in range(1,n):
    if(n%i==0):
        s=s+i
if s==n:
    print("perfect num")
else:
    print("not a perfect num")

    