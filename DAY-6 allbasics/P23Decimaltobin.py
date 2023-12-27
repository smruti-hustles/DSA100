n=int(input())
s=""
while(n>0):
    r=n%2
    s=s+(str(r))
    n=n//2
print(s[::-1])    