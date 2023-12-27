#program1
print("Enter till which number you want to print :")
n=int(input())
print("even numbers are:")
for i in range(0,n+1):
    if i%2 == 0:
        print(i)