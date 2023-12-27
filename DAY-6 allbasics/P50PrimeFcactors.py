#prime factors of a number
def isPrime(num):
    
    if c==2:
        return 1       
n=int(input())
for i in range(1,n):
    c=0
    for x in range(1,i+1):
        if i%x==0:
            c=c+1
    if c==2:        
        if(n%i==0):
            print(i)