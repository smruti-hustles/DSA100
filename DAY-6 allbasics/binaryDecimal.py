#decimal to binary
n=int(input())
store=""
while(n>0):
    r=n%2
    store=str(r)+store #reverse order concat
    n=n//2
print(store)

#binary to decimal
n=int(input())
i=0
s=0
while(n>0):
    r=n%10
    s+=(2**i)*r
    i+=1
    n=n//10
print(s)    