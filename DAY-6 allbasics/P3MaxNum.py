#max of 2 numbers
a=eval(input())
b=eval(input())
c=eval(input())
if(a>b and a>c):
    print("Max=",a)
elif b>c:
    print("Max=",b)    
else:
    print("Max=",c)  

#max of 4 numbers
a=eval(input())
b=eval(input())
c=eval(input())
d=eval(input())
if(a>b and a>c and a>d):
    print("Max=",a)
elif(b>c and b>d):
    print("Max=",b)
elif(c>d):
    print("Max=",c)
else:
    print("Max=",d)            
