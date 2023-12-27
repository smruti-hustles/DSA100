#program1 - extracting prime numbers from given list of numbers
l1=eval(input())
l=list(l1)
l2=[]
for i in l:
    c=0
    if(i>0):
        for j in range(1,i+1):
            if(i%j==0):
                c=c+1
        if c==2:
            l2.append(i)
print(l2)

