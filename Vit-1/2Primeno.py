#program2
print("Enter till which number you want to print :")
n=int(input())
print("Prime1 numbers are:")
for i in range(1,n+1):
    c=0
    for j in range(1,i+1):
        if i%j == 0:
            c=c+1
    if c==2:
        print(i)        