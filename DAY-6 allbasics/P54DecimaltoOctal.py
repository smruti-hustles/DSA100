#decimal to octal
n=int(input())
s=""
while(n>0):
    r=n%8
    s=s+str(r)
    n=n//8
print(s[::-1])  