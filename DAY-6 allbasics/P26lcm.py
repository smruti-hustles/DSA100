a=int(input())
b=int(input())
if a>b:
    max=a
else:
    max=b  
while(True): 
  if max%a==0 and max%b==0:
    break
  max=max+1
print(f"lcm of {a} and {b} is: {max}")        
    