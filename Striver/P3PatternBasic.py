'''
#pattern1
t=int(input())
for i in range(1,t+1):
    for j in range(1,t+1):
        print("*",end="")
    print() 
    
#pattern2
t=int(input())
for i in range(1,t+1):
    for j in range(1,i+1):
        print("*",end="")
    print() 
    
#pattern3
t=int(input())
for i in range(1,t+1):
    for j in range(1,i+1):
        print(j,end="")
    print() 
    
#pattern4
t=int(input())
for i in range(1,t+1):
    for j in range(1,i+1):
        print(i,end="")
    print() 
    
#pattern5
t=int(input())
for i in range(t+1,1,-1):
    for j in range(i+1,1+1,-1):
        print("*",end="")
    print() 
    
#pattern6
t=int(input())
for i in range(t+1,1,-1):
    for j in range(1,i):
        print(j,end="")
    print() 
    
#pattern10
t=int(input())
for i in range(1,t+1):
    for j in range(1,i+1):
        print("*",end="")
    print()
for i in range(t,1,-1):
    for j in range(i+1,1+1,-1):
        print("*",end="")  
    print()    
 
#pattern11      
t=int(input())
for i in range(1,t+1):
    for j in range(1,i+1):
        if i%2==0:
          if j%2==0:
            print("1",end=" ")
          else:
            print("0",end=" ")  
        else:
          if j%2==0:
            print("0",end=" ")
          else:
            print("1",end=" ") 
    print()      
    
#pattern13
t=int(input())
c=0
for i in range(1,t+1):
    for j in range(1,i+1):
        c=c+1
        print(c,end=" ")
    print() 
      '''
      
     
#pattern13
t=int(input())
c=65
for i in range(1,t+1):
    for j in range(1,i+1):
        print(chr(c),end="")
        c=c+1
    print() 
      

    