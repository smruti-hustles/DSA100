#average of elements in the list
l1=eval(input())
s=0
for i in l1:
    if i%2==0:
     s=s+i   
print(f"sum of even numbers in the given list is:{s}")