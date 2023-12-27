#pattern1
n=int(input())
for i in range(1,n+1):
    for j in range(1,n+1):
        print(j,end="")
    print()    


#pattern1
n=int(input())
for i in range(1,n+1):
    for j in range(1,i+1):
        print(j,end="")
    print()  

#pattern3
n=int(input())
c=0
for i in range(1,n+1):
    for j in range(1,i+1):
        if j%2 == 0 :
          print("*",end="")
        else:
          print(j,end="")    
    print()  


#pattern4
n=int(input())
c=0
for i in range(1,n+1):
    for j in range(1,i+1):
        c=c+1
        print(c,end="")
    print()  

