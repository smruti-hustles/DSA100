#with temp var
a=int(input())
b=int(input())
t=a
a=b
b=t
print(a,b)
#without the temporary variable
x=eval(input())
y=eval(input())
x=x+y
y=x-y
x=x-y
print(x,y)
