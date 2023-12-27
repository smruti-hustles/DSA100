n=int(input())
d=0
l=len(str(n))
for i in range(0,l):
    r=n%10
    d=d+(2**i)*r
    n=n//10
print(f"decimal format of {n} is {d}")   
