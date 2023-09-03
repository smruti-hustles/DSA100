#valid palindrome
n=input()
m=n.lower()
k=""
for i in range(len(m)):
    if m[i].isalnum():
        k+=m[i]
print(k)
t=k[::-1]
if(t==k):
    print("true")
else:
    print("false")    