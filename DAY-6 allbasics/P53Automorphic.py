#automorphic number last digits of square of number==number eg..76==5776
n=int(input())
s=str(n)
l=len(s)
sq=n**2
sq1=str(sq)
s1=sq1[::-1]
s2=s1[0:l]
s3=s2[::-1]
if s3==s:
    print("yes")
else:
    print("No")


'''or
n=int(input())
sq=n**2
n1=str(n)
l1=len(n1)
s1=str(sq)
l2=len(s1)
s2=s1[l2-l1:l2]
print(n1)
print(s2)
if(n1==s2):
    print("Automorphic numbers")
else:
    print("Not automorphic numbers")
'''
