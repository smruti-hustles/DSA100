#Binary to octal
n=int(input())
s=0
for i in range(0,len(str(n))):
    r=n%10
    s=s+(2**i)*r
    n=n//10
n1=s
s1=""
while(n1>0):
    r=n1%8
    s1=s1+str(r)
    n1=n1//8
print(s1[::-1])     
